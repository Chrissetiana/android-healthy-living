package com.chrissetiana.android.healthyliving;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int healthLevel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void yes(View view) {
        healthLevel += 1;
        String message = "You answered yes,current health level is " + healthLevel;
        display(message);
    }

    public void no(View view) {
        healthLevel -= 1;
        String message = "You answered no,current health level is " + healthLevel;
        display(message);
    }

    public void sometimes(View view) {
        healthLevel += 0;
        String message = "You answered sometimes,current health level is " + healthLevel;
        display(message);
    }

    public void display(String s){
        TextView t = findViewById(R.id.display_text_view);
        t.setText(s);
    }
}
