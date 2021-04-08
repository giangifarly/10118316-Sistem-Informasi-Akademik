package com.becek39studio.sisteminformasiakademik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {
    Button profile,signout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        signout = findViewById(R.id.btnSignOut);
        profile = findViewById(R.id.btnProfile);

        signout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setProfile();
            }
        });
    }

    private void setProfile(){
        Intent i = new Intent(this, ProfileActivity.class);
        startActivity(i);
    }
}