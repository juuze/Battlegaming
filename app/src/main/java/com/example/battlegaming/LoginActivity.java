package com.example.battlegaming;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button loginButton = findViewById(R.id.loginButton);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Editable usernameEditable = ((EditText) findViewById(R.id.usernameEditText)).getText();
                String usernameString = usernameEditable.toString();

                Editable passwordEditable = ((EditText) findViewById(R.id.passwordEditText)).getText();
                String passwordString = passwordEditable.toString();

                Toast.makeText(LoginActivity.this, usernameString, Toast.LENGTH_SHORT).show();
                Toast.makeText(LoginActivity.this, passwordString, Toast.LENGTH_SHORT).show();
            }
        });

        TextView createAccountTextView = findViewById(R.id.createAccountTextView);
        createAccountTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(LoginActivity.this, CreateAccountActivity.class);
                //myIntent.putExtra("key", value); //Optional parameters
                LoginActivity.this.startActivity(myIntent);
            }
        });

        TextView forgotPassowrdTextView = findViewById(R.id.forgotPassworTextView);
        forgotPassowrdTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(LoginActivity.this, RecoveryAccountActivity.class);
                //myIntent.putExtra("key", value); //Optional parameters
                LoginActivity.this.startActivity(myIntent);
            }
        });
    }
}
