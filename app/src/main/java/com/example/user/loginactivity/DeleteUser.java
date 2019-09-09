package com.example.user.loginactivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.user.loginactivity.helper.InputValidation;
import com.example.user.loginactivity.model.User;
import com.example.user.loginactivity.sql.DatabaseHelper;

public class DeleteUser extends AppCompatActivity {

    private DatabaseHelper databaseHelper;

    private User user;
    private InputValidation inputValidation;
    private final AppCompatActivity activity = DeleteUser.this;
    EditText nameStd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_user);
        nameStd=(EditText)findViewById(R.id.editText);
        initObjects();
    }

    public void onClick(View v){

        if(nameStd.getText().toString().matches("")){
            Toast.makeText(DeleteUser.this, "Please Enter Student Name",
                    Toast.LENGTH_LONG).show();
        }else {
            user.setName(nameStd.getText().toString());
            databaseHelper.deleteUser(user);

            Toast.makeText(DeleteUser.this, "Delete successfull!",
                    Toast.LENGTH_LONG).show();
        }
    }


    private void initObjects() {
        inputValidation = new InputValidation(activity);
        databaseHelper = new DatabaseHelper(activity);
        user = new User();

    }
}
