package com.example.user.loginactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void onButtonClick(View v) {
        if (v.getId() == R.id.button2) {
            Intent i = new Intent(SecondActivity.this, Result.class);
            startActivity(i);
        } else if (v.getId() == R.id.button3) {
            Intent i = new Intent(SecondActivity.this, show.class);
            startActivity(i);
        } else if (v.getId() == R.id.button8) {
            Intent i = new Intent(SecondActivity.this, Reference_source.class);
            startActivity(i);
        }
    }
}