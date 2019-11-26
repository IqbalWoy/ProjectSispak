package com.example.projectsispak.LoginRegister;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.projectsispak.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivityRegister extends AppCompatActivity implements View.OnClickListener {

    Button buttonRegister;
    EditText editTextUsername;
    EditText editTextPassword;
    EditText editTextNama;
    TextView textViewSignup;
    ProgressDialog progressDialog;
    FirebaseAuth firebaseAuth;
    //    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference reff;
    DataMember dataMember;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_register);

        firebaseAuth = FirebaseAuth.getInstance();

        Toast.makeText(MainActivityRegister.this, "Firebase connection success", Toast.LENGTH_SHORT).show();

        progressDialog = new ProgressDialog(this);
//        progressBar = new ProgressBar(this);
        buttonRegister = findViewById(R.id.buttonRegistration);
        editTextNama = findViewById(R.id.editTextNama);
        editTextUsername = findViewById(R.id.editTextUsername);
        editTextPassword = findViewById(R.id.editTextPassword);
        textViewSignup = findViewById(R.id.textViewSignIn);
        reff = FirebaseDatabase.getInstance().getReference().child("Member");
//        databaseReference = FirebaseDatabase.getInstance().getReference().child("DataMember");
        dataMember = new DataMember();

        buttonRegister.setOnClickListener(this);
        textViewSignup.setOnClickListener(this);

    }

    private void registerUser() {
        String username = editTextUsername.getText().toString().trim();
        String password = editTextPassword.getText().toString().trim();

        String nama = editTextNama.getText().toString().trim();
        dataMember.setNamaMember(nama);
        dataMember.setNamaKucing("aci");
        dataMember.setJenisKucing("tania");
        dataMember.setBeratKucing("28");
        reff.child("-LtrxZZMlAAKahB1QqeI").child("namaMember").setValue("klsD");
//        Toast.makeText(MainActivityRegister.this,)

        //Validasi
        if (TextUtils.isEmpty(username)) {
            //Username is Empty
            Toast.makeText(this, "Please Enter Username", Toast.LENGTH_SHORT).show();
            editTextUsername.requestFocus();
            return;
        }
        if (TextUtils.isEmpty(password)) {
            //password is Empty
            Toast.makeText(this, "Please Enter Password", Toast.LENGTH_SHORT).show();
            editTextPassword.requestFocus();
            return;
        }
        if (password.length() < 6) {
            editTextPassword.setError("Minimum Length of Password should be 6");
            editTextPassword.requestFocus();
            return;
        }
        //Jika sudah tervalidasi semua
        //Lanjut
        progressDialog.setMessage("Registering User ...");
        progressDialog.show();
//

        firebaseAuth.createUserWithEmailAndPassword(username, password).addOnCompleteListener(this,     new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {

                    Toast.makeText(MainActivityRegister.this, "Registered Successfull", Toast.LENGTH_LONG).show();
                    progressDialog.hide();
                    Intent intent = new Intent(MainActivityRegister.this, Login.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);

                } else {
                    if (task.getException() instanceof FirebaseAuthUserCollisionException) {
                        Toast.makeText(getApplicationContext(), "You are already registered", Toast.LENGTH_SHORT).show();
//                        startActivity(new Intent(this, Login.class));
                    } else {
                        Toast.makeText(getApplicationContext(), task.getException().getMessage(), Toast.LENGTH_LONG).show();
                    }
//                    FirebaseAuthException e = (FirebaseAuthException )task.getException();
//                    Toast.makeText(MainActivityRegister.this, "Failed Registration: "+e.getMessage(), Toast.LENGTH_SHORT).show();
                    progressDialog.hide();
//                    Toast.makeText(MainActivityRegister.this, "Could Not Registered ... please try again", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.buttonRegistration:
                registerUser();
                break;
            case R.id.textViewSignIn:
                startActivity(new Intent(this, Login.class));
                break;

        }
    }
}
