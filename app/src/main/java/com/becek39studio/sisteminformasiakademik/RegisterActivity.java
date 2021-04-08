package com.becek39studio.sisteminformasiakademik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {
    EditText nama, username, password;
    Button signup;
    TextView toSignIn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        username = findViewById(R.id.regUsername);
        password = findViewById(R.id.regPassword);
        signup = findViewById(R.id.btnRegSignUp);
        toSignIn = findViewById(R.id.regToLogin);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                menuHome();
            }
        });

        toSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                menuLogin();
            }
        });
    }
    public void menuHome(){
        Intent i = new Intent(this,HomeActivity.class);
        startActivity(i);
    }

    public void menuLogin(){
        Intent j = new Intent(this,LoginActivity.class);
        startActivity(j);
    }
}