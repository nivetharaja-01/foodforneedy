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

public class SignUp extends AppCompatActivity {

    EditText name,orphanname, email, password, cpassword;
    TextView signinnow;
    Button loginnow;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);



        name = findViewById(R.id.name);
        orphanname = findViewById(R.id.orphanname);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        cpassword = findViewById(R.id.cpassword);
        loginnow = findViewById(R.id.signup);
        signinnow = findViewById(R.id.login2);



        loginnow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nameip = name.getText().toString();
                String orphannameip = orphanname.getText().toString();
                String emailip = email.getText().toString();
                String passwordip = password.getText().toString();
                String cpasswordip = cpassword.getText().toString();

                if(emailip.equals("")) {
                    Toast.makeText(getApplicationContext(),"Please Enter your Email ID", Toast.LENGTH_LONG).show();
                }
                else if(nameip.equals("")) {
                    Toast.makeText(getApplicationContext(), "Please Enter Your Name", Toast.LENGTH_LONG).show();
                }
                else if(orphannameip.equals("")) {
                    Toast.makeText(getApplicationContext(), "Please Enter Your Orphanage Name", Toast.LENGTH_LONG).show();
                }
                else if(passwordip.equals("")) {
                    Toast.makeText(getApplicationContext(), "Please Enter Password", Toast.LENGTH_LONG).show();
                }
                else if(cpasswordip.equals("")) {
                    Toast.makeText(getApplicationContext(), "Please Enter Password Again", Toast.LENGTH_LONG).show();
                }
                else if(passwordip.length() < 7) {
                    Toast.makeText(getApplicationContext(), "Please Enter Valid Password (Min. 7 characters)", Toast.LENGTH_LONG).show();
                }
                else if(!cpasswordip.equals(passwordip)) {
                    Toast.makeText(getApplicationContext(),"Password Not Matched", Toast.LENGTH_LONG).show();
                }
                else {
                    signUp(emailip,passwordip,nameip,orphannameip);
                }
            }

            private void signUp(String emailip, String passwordip, String nameip, String orphannameip) {
            }
        });
        signinnow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SignUp.this, MainActivity.class));
            }
        });

    }
}