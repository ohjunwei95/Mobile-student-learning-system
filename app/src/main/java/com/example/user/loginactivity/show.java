package com.example.user.loginactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class show extends AppCompatActivity {

    TextView a,b,c,d;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);


    }

    public void onButtonClick(View v) {
        if (v.getId() == R.id.textView8) {
            Intent i = new Intent(show.this, Net_modelling.class);
            startActivity(i);
        }
        else if (v.getId() == R.id.textView9){
            Intent i = new Intent(show.this, Net_manage.class);
            startActivity(i);
        }
        else if (v.getId() == R.id.textView10){
            Intent i = new Intent(show.this, show.class);
            startActivity(i);
        }
        else if (v.getId() == R.id.textView11){
            Intent i = new Intent(show.this, Mobile_computing.class);
            startActivity(i);
        }
    }



}
