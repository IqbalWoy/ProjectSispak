package com.example.projectsispak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.projectsispak.LoginRegister.Login;
import com.example.projectsispak.LoginRegister.MainActivityRegister;

public class Akun extends AppCompatActivity {

    Button signOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akun);

        Button btnRegister = findViewById(R.id.btn_signout);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent signOut = new Intent(Akun.this, Login.class);
                startActivity(signOut);
                finish();
            }
        });
    }

}
