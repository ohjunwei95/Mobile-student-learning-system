package com.example.user.loginactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Staffppl extends AppCompatActivity {

    private EditText name, pw;
    private Button login1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staffppl);

        name = (EditText)findViewById(R.id.etname);
        pw = (EditText)findViewById(R.id.etpassword) ;
        login1 = (Button)findViewById(R.id.login);

        login1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(name.getText().toString(), pw.getText().toString());
            }
        });
    }


    private void validate(String userName, String userPassword) {

        if ((userName.equals("admin")) && (userPassword.equals("admin"))) {

            Intent intent = new Intent(Staffppl.this, Staff_option.class);

            startActivity(intent);
        }else{
            Toast.makeText(Staffppl.this, "You are not admin",
                    Toast.LENGTH_LONG).show();

        }
    }

}