package com.example.sendmail;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.net.HttpCookie;

public class MainActivity extends AppCompatActivity {

    private Button gmail;
    private EditText et2;
    private EditText et3;
    private EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gmail = findViewById(R.id.btn);
        et2 = findViewById(R.id.et2);
        et3 = findViewById(R.id.et3);
        et1 = findViewById(R.id.et1);

        gmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent emailIntent = new Intent(Intent.ACTION_SEND);
                emailIntent.setType("text/plain");
                emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{et1.getText().toString()});

                emailIntent.putExtra(Intent.EXTRA_CC, new String[]{et2.getText().toString()});
                emailIntent.putExtra(Intent.EXTRA_TEXT,et3.getText().toString());
                startActivity(emailIntent);

            }
        });
    }
}

