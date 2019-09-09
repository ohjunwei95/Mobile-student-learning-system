package com.example.user.loginactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.user.loginactivity.helper.InputValidation;
import com.example.user.loginactivity.sql.DatabaseHelper;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //declare variable
    private final AppCompatActivity activity = MainActivity.this;

    private Button Login;
    private TextView viewlinkRegister;
    private int counter = 5;

    private NestedScrollView nestedScrollView;
    private TextInputLayout textInputLayoutEmail;
    private TextInputLayout textInputLayoutPassword;

    private TextInputEditText textInputEditTextEmail;
    private TextInputEditText textInputEditTextPassword;

    private InputValidation inputValidation;
    private DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //assign variable

        initViews();
        initListeners();
        initObjects();

        //link to next interface
      /*  Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(Name.getText().toString(), password.getText().toString());
            }
        });*/
    }
    private void initViews() {
        textInputEditTextEmail = (TextInputEditText) findViewById(R.id.etname);
        textInputEditTextPassword = (TextInputEditText) findViewById(R.id.etpassword);
        textInputLayoutEmail = (TextInputLayout) findViewById(R.id.textInputLayoutEmail);
        textInputLayoutPassword = (TextInputLayout) findViewById(R.id.textInputLayoutPassword);
        Login = (Button) findViewById(R.id.login);
        viewlinkRegister = (TextView) findViewById(R.id.Info);

    }

    /**
     * This method is to initialize objects to be used
     */
    private void initObjects() {
        databaseHelper = new DatabaseHelper(activity);
        inputValidation = new InputValidation(activity);

    }

    /**
     * This method is to initialize listeners
     */
    private void initListeners() {
        Login.setOnClickListener(this);
        viewlinkRegister.setOnClickListener(this);
    }


    //check for correct username and password
 /*   private void validate(String userName, String userPassword) {

        if ((userName.equals("yolo")) && (userPassword.equals("yolo"))) {

            Intent intent = new Intent(MainActivity.this, SecondActivity.class);

            startActivity(intent);

        } else {
            //display counter to attempt
            counter--;

            viewlinkRegister.setText("No of attempts remaining: " + String.valueOf(counter));

            if (counter == 0) {

                Login.setEnabled(false);
            }
        }
    }
*/
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.login:
                verifyFromSQLite();
                break;
            case R.id.Info:
                // Navigate to RegisterActivity
                Intent intentRegister = new Intent(getApplicationContext(), RegisterActivity.class);
                startActivity(intentRegister);
                break;
        }

    }

    /**
     * This method is to validate the input text fields and verify login credentials from SQLite
     */
    private void verifyFromSQLite() {
        if (!inputValidation.isInputEditTextFilled( textInputEditTextEmail,textInputLayoutEmail ,getString(R.string.error_message_email))) {
            return;
        }
        if (!inputValidation.isInputEditTextEmail(textInputEditTextEmail, textInputLayoutEmail, getString(R.string.error_message_email))) {
            return;
        }
        if (!inputValidation.isInputEditTextFilled(textInputEditTextPassword, textInputLayoutPassword, getString(R.string.error_message_email))) {
            return;
        }

        if (databaseHelper.checkUser(textInputEditTextEmail.getText().toString().trim()
                , textInputEditTextPassword.getText().toString().trim())) {


            Intent accountsIntent = new Intent(activity, SecondActivity.class);
            accountsIntent.putExtra("EMAIL", textInputEditTextEmail.getText().toString().trim());
            emptyInputEditText();
            startActivity(accountsIntent);


        } else {
            // Snack Bar to show success message that record is wrong
            Snackbar.make(nestedScrollView, getString(R.string.error_valid_email_password), Snackbar.LENGTH_LONG).show();
        }
    }

    /**
     * This method is to empty all input edit text
     */
    private void emptyInputEditText() {
        textInputEditTextEmail.setText(null);
        textInputEditTextPassword.setText(null);
    }

}
