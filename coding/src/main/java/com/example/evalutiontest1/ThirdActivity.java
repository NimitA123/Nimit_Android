package com.example.evalutiontest1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ThirdActivity extends AppCompatActivity {
    private Button mbtnLauchSecondActivity2;
    private View LaunchSecondActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third2);
        LaunchSecondActivity = findViewById(R.id.btnLauchActivity2);
        LaunchSecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ThirdActivity.this, FouthActivity.class);
                startActivity(intent);

            }
        });
    }
}