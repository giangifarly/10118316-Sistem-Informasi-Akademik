package com.becek39studio.sisteminformasiakademik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    EditText username,password;
    Button signin;
    TextView toSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        signin = findViewById(R.id.btnLogin);
        toSignUp = findViewById(R.id.regToSignUp);

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                menuHome();
            }
        });

        toSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                menuRegister();
            }
        });
    }

    public void menuHome(){
        Intent i = new Intent(this,HomeActivity.class);
        startActivity(i);
    }

    public void menuRegister(){
        Intent j = new Intent(this,RegisterActivity.class);
        startActivity(j);
    }
}