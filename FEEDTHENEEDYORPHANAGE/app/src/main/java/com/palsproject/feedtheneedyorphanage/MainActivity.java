package com.palsproject.feedtheneedyorphanage;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText email, password;
    TextView signupnow;
    Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        Login = findViewById(R.id.signup);
        signupnow = findViewById(R.id.signup2);


        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String emailip = email.getText().toString();
                String passwordip = password.getText().toString();
                String emailRegex = "([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$";


                if (emailip.equals("")) {
                    Toast.makeText(MainActivity.this, "Please Enter your Email ID", Toast.LENGTH_LONG).show();
                } else if (!emailip.matches(emailRegex)) {
                    Toast.makeText(MainActivity.this, " You have entered invalid email ID", Toast.LENGTH_LONG).show();
                } else if (passwordip.equals("")) {
                    Toast.makeText(MainActivity.this, "Please Enter Password", Toast.LENGTH_LONG).show();
                } else if (passwordip.length() < 7) {
                    Toast.makeText(MainActivity.this, "Please Enter Valid Password (Min. 7 characters)", Toast.LENGTH_LONG).show();
                } else {
                    signupnow(emailip, passwordip);
                    Login.setEnabled(false);
                }
            }

            private void signupnow(String emailip, String passwordip) {
            }
        });

        signupnow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, SignUp.class);
                startActivity(i);
            }
        });

    }




}