package com.example.user.loginactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void onButtonClick(View v) {
        if (v.getId() == R.id.student) {
            Intent i = new Intent(Main2Activity.this, MainActivity.class);
            startActivity(i);
        }
        else if (v.getId() == R.id.staff){
            Intent i = new Intent(Main2Activity.this, Staffppl.class);
            startActivity(i);
        }
    }
}
