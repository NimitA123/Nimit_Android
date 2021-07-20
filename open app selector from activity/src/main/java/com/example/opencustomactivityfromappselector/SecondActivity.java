package com.example.opencustomactivityfromappselector;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private TextView yuv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        yuv = findViewById(R.id.tv);
        Intent intent = getIntent();
        String name = intent.getStringExtra("yuvan");
        yuv.setText(name);


    }
}