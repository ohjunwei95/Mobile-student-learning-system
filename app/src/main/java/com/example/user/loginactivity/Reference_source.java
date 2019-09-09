package com.example.user.loginactivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;

public class Reference_source extends AppCompatActivity {
    private WebView web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reference_source);

    }

    public void onButtonClick(View v) {
        if (v.getId() == R.id.textView15) {
                Intent browserIntent = new Intent( Intent.ACTION_VIEW,
                        Uri.parse("https://login.ezproxy.unimap.edu.my/login"));
                startActivity(browserIntent);
        }
        else if (v.getId() == R.id.textView22){
            
            Intent browserIntent = new Intent( Intent.ACTION_VIEW,
                    Uri.parse("http://www.referencedesk.org/finance.shtml"));
            startActivity(browserIntent);
        }
        else if (v.getId() == R.id.textView23){
            Intent browserIntent = new Intent( Intent.ACTION_VIEW,
                    Uri.parse("https://www.loc.gov/"));
            startActivity(browserIntent);
        }
        else if (v.getId() == R.id.textView24){
            Intent browserIntent = new Intent( Intent.ACTION_VIEW,
                    Uri.parse("https://www.lib.purdue.edu/find/quickreference"));
            startActivity(browserIntent);
        }
        else if (v.getId() == R.id.textView25){
            Intent browserIntent = new Intent( Intent.ACTION_VIEW,
                    Uri.parse("http://www.libraryspot.com/"));
            startActivity(browserIntent);
        }
    }
}
