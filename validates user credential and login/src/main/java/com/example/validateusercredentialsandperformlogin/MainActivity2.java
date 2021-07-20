package com.example.validateusercredentialsandperformlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity2 extends AppCompatActivity {
    private Button button;
    private EditText Email;
    private EditText Password;
    private String emailValidation = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button = findViewById(R.id.button1);
        Email = findViewById(R.id.Email);
        Password = findViewById(R.id.password);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(isemailvalid()&& ispasswordvalid()){
                    Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                    intent.putExtra("name", Email.getText().toString());
                    startActivity(intent);


                }

            }
        });

    }

    private boolean  isemailvalid() {
        if(Email.getText().toString().matches(emailValidation)) {
            return true;
        }
        else{
            Email.setError("Invalid Email");
            return false;
        }
    }
    private boolean  ispasswordvalid() {
        if(Password.getText().toString().length()>=6){
            return true;

        }
        else{
            Password.setError("Invalid password");
            return false;
        }
    }

    }
