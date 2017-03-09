package com.renanrhoden.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button firstAppButton;
    private Button secondAppButton;
    private Button thirdAppButton;
    private Button fourthAppButton;
    private Button fifthAppButton;
    private Button sixthAppButton;

    private String firstAppMessage = "Popular Movies will now launch";
    private String secondAppMessage = "Stock Hawk will now launch";
    private String thirdAppMessage = "Build it Bigger will now launch";
    private String fourthAppMessage = "Make Your App Material will now launch";
    private String fifthAppMessage = "Go Ubiquitous will now launch";
    private String sixthAppMessage = "Capstone will now launch";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstAppButton = (Button) findViewById(R.id.firstAppButonID);
        secondAppButton = (Button) findViewById(R.id.secondAppButonID);
        thirdAppButton = (Button) findViewById(R.id.thirdAppButonID);
        fourthAppButton = (Button) findViewById(R.id.fourthAppButonID);
        fifthAppButton = (Button) findViewById(R.id.fifthAppButonID);
        sixthAppButton = (Button) findViewById(R.id.sixthAppButonID);

        firstAppButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast(firstAppMessage);
            }
        });
        secondAppButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast(secondAppMessage);
            }
        });
        thirdAppButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast(thirdAppMessage);
            }
        });
        fourthAppButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast(fourthAppMessage);
            }
        });
        fifthAppButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast(fifthAppMessage);
            }
        });
        sixthAppButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast(sixthAppMessage);
            }
        });
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
