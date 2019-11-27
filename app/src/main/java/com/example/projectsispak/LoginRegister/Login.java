package com.example.projectsispak.LoginRegister;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.projectsispak.MainActivity;
import com.example.projectsispak.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import org.w3c.dom.Text;

public class Login extends AppCompatActivity implements View.OnClickListener {

    Button btnLogin;
    EditText etEmail;
    EditText etPassword;
    TextView textView;
    FirebaseAuth mAuth;
    ProgressDialog progressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
//        Toast.makeText(Login.this, "Firebase connection success", Toast.LENGTH_SHORT).show();

        mAuth = FirebaseAuth.getInstance();

        btnLogin = (Button) findViewById(R.id.buttonLogin);
        etEmail = (EditText) findViewById(R.id.editTextUsernameL);
        etPassword = (EditText) findViewById(R.id.editTextPasswordL);
        textView = (TextView) findViewById(R.id.textViewSignUn);
        btnLogin.setOnClickListener(this);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this, MainActivityRegister.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                finish();
            }
        });


    }

    private void UserLogin(){
        String email = etEmail.getText().toString().trim();
        String password = etPassword.getText().toString().trim();

        //Validasi
        if(TextUtils.isEmpty(email)){
            //Username is Empty
            Toast.makeText(this, "Please Enter Email", Toast.LENGTH_SHORT).show();
            etEmail.requestFocus();
            return;
        }
        if(TextUtils.isEmpty(password)){
            //password is Empty
            Toast.makeText(this, "Please Enter Password", Toast.LENGTH_SHORT).show();
            etPassword.requestFocus();
            return;
        }if(password.length() < 6){
            etPassword.setError("Minimum Length of Password should be 6");
            etPassword.requestFocus();
            return;
        }
        //Jika sudah tervalidasi semua
        //Lanjut
//        progressDialog.setMessage("Registering User ...");
//        progressDialog.show();
        mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    Intent intent = new Intent(Login.this, MainActivity.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);
                    finish();
                }else {
                    Toast.makeText(getApplicationContext(), task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonLogin:
                UserLogin();
                finish();
                break;
            case R.id.textViewSignUn:
                startActivity(new Intent(Login.this, MainActivityRegister.class));
                finish();
                break;
        }
    }
}
