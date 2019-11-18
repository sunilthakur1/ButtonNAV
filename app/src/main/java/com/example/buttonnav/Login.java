package com.example.buttonnav;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    Button login;
    EditText username , password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login = findViewById(R.id.login);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().equals("Softwarica")&&
                        password.getText().toString().equals("coventry")){
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    Toast.makeText(Login.this, "Rediracting", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(Login.this, "Wrong Input", Toast.LENGTH_SHORT).show();
                }
            }
        });



        }
    }

