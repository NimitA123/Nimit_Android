package com.example.evalutiontest1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {
    private Button mbtnLauchSecondActivity1;
    private View LaunchSecondActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        LaunchSecondActivity = findViewById(R.id.btnLauchActivity1);
        LaunchSecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                startActivity(intent);

            }
        });
    }
}