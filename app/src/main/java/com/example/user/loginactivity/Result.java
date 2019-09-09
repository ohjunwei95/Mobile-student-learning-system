package com.example.user.loginactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Result extends AppCompatActivity {

    EditText s1,s2,s3,s4,s5,s6,s7,s8,s9,s10;
    EditText p1,p2,p3,p4,p5,p6,p7,p8,p9,p10;
    EditText t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
    TextView show,tell;
    Double a1,a2;
    Double [] pointer = new Double[5];
    Double [] ch = new Double[5];
    Button calculate, result;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        //declare for subject name
        s1=(EditText)findViewById(R.id.n1);
        s2=(EditText)findViewById(R.id.n2);
        s3=(EditText)findViewById(R.id.n3);
        s4=(EditText)findViewById(R.id.n4);
        s5=(EditText)findViewById(R.id.n5);
        s6=(EditText)findViewById(R.id.n6);
        s7=(EditText)findViewById(R.id.n7);
        s8=(EditText)findViewById(R.id.n8);
        s9=(EditText)findViewById(R.id.n9);
        s10=(EditText)findViewById(R.id.n10);

        //declare for pointer value
        p1=(EditText)findViewById(R.id.v1);
        p2=(EditText)findViewById(R.id.v2);
        p3=(EditText)findViewById(R.id.v3);
        p4=(EditText)findViewById(R.id.v4);
        p5=(EditText)findViewById(R.id.v5);
        p6=(EditText)findViewById(R.id.v6);
        p7=(EditText)findViewById(R.id.v7);
        p8=(EditText)findViewById(R.id.v8);
        p9=(EditText)findViewById(R.id.v9);
        p10=(EditText)findViewById(R.id.v10);

        //declare for credit hours
        t1=(EditText)findViewById(R.id.c1);
        t2=(EditText)findViewById(R.id.c2);
        t3=(EditText)findViewById(R.id.c3);
        t4=(EditText)findViewById(R.id.c4);
        t5=(EditText)findViewById(R.id.c5);
        t6=(EditText)findViewById(R.id.c6);
        t7=(EditText)findViewById(R.id.c7);
        t8=(EditText)findViewById(R.id.c8);
        t9=(EditText)findViewById(R.id.c9);
        t10=(EditText)findViewById(R.id.c10);

        //declare for button
        calculate = (Button)findViewById(R.id.button5);

        show = (TextView)findViewById(R.id.demo);
        tell = (TextView)findViewById(R.id.textView26);


    }


    public void onClick(View view) {

        Double[] pointer = new Double[]{Double.parseDouble(p1.getText().toString()), Double.parseDouble(p2.getText().toString()),
                Double.parseDouble(p3.getText().toString()), Double.parseDouble(p4.getText().toString()),
                Double.parseDouble(p5.getText().toString())};

        Double[] ch = new Double[]{Double.parseDouble(t1.getText().toString()), Double.parseDouble(t2.getText().toString()),
                Double.parseDouble(t3.getText().toString()), Double.parseDouble(t4.getText().toString()),
                Double.parseDouble(t5.getText().toString())};



            /*Double.parseDouble(p6.getText().toString()),
            Double.parseDouble(p7.getText().toString()),Double.parseDouble(p8.getText().toString()),
            Double.parseDouble(p9.getText().toString()),Double.parseDouble(p10.getText().toString()),}; */


        Double total = 0.0;
        double tw = 0.0;

        for (int i = 0; i < 5; i++) {
            total += (pointer[i] * ch[i]);
        }

        for (int i = 0; i < 5; i++) {

            tw += ch[i];
        }

        Double total1 = total / tw;
        total1 = Double.parseDouble(new DecimalFormat("##.##").format(total1));
        String text = "Your GPA is " + total1.toString();
        show.setText(text);

        if (total1 < 2.0) {
            tell.setText("You failed in this semester!!!!");
        } else if (total1 >= 3.0) {
            tell.setText("Good job,keep it on!");
        } else if (total1 < 3.0 && total1>=2.0) {
            tell.setText("you need to work harder!");
        }
            else if(total1>=4.0) {
                tell.setText("Perfect!!!");
            }

        }


    public void onClick1(View view){

        Intent i = new Intent(Result.this, show.class);
        startActivity(i);
    }





}
