package com.example.user.loginactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Staff_option extends AppCompatActivity {

    private final AppCompatActivity activity = Staff_option.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staff_option);
    }

   public void onClick(View v){

       switch (v.getId()) {
           case R.id.seeRtd:
               Intent accountsIntent = new Intent(activity, UsersListActivity.class);

               startActivity(accountsIntent);
               break;

           case R.id.regisStd:
               // Navigate to RegisterActivity
               Intent intentRegister = new Intent(getApplicationContext(), RegisterActivity.class);
               startActivity(intentRegister);
               break;

           case R.id.delete:
               // Navigate to RegisterActivity
               Intent intentDelete = new Intent(getApplicationContext(), DeleteUser.class);
               startActivity(intentDelete);
               break;
       }

   }
}
