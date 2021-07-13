package com.example.intentfilter;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView yuv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        yuv = findViewById(R.id.yuv);
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        yuv.setText(name);
    }
}