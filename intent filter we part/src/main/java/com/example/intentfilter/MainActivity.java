package com.example.intentfilter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText metusername;
    private EditText metemail;
    private EditText metpassword;
    private Button mbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        forcheck();
        mbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (usernamevalid() && isemailvalid() && ispasswordvalid()) {
                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    intent.putExtra("name", metusername.getText().toString());
                    startActivity(intent);


                }

            }
        });

    }

    private boolean isemailvalid() {
        if (metemail.getText().toString().length() >= 4) {
            return true;
        } else {
            metemail.setError("Invalid Email");
            return false;
        }
    }

    private boolean ispasswordvalid() {
        if (metpassword.getText().toString().length() >= 6) {
            return true;

        } else {
            metemail.setError("Invalid password");
            return false;
        }
    }

    private boolean usernamevalid() {
        if (metusername.getText().toString().length() >= 4) {
            return true;

        } else {
            metemail.setError("Invalid usernamevalid");
            return false;
        }
    }

    private void forcheck() {
        metusername = findViewById(R.id.metusername);
        metemail = findViewById(R.id.metemail);
        metpassword = findViewById(R.id.metpassword);
        mbtn = findViewById(R.id.mbtn);

    }
}