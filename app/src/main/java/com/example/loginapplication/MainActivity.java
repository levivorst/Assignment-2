package com.example.loginapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.Navigation;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.Button;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    private FirebaseAuth mAuth;
    private EditText emailT;
    private EditText passT;
    private Button buttonLogin;
    private Button buttonReg;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        mAuth = FirebaseAuth.getInstance();

//        emailT = findViewById(R.id.email);
//        passT = findViewById(R.id.pass);
//
//        buttonLogin = findViewById(R.id.login);
//        buttonReg = findViewById(R.id.reg);
//        buttonLogin.setOnClickListener(new View.OnClickListener(){
//
//            @Override
//            public void onClick(View view) {
//                login();
//            }
//        });
//
//        buttonReg.setOnClickListener(new View.OnClickListener(){
//
//            @Override
//            public void onClick(View view) {
//                reg();
//            }
//        });

//        EditText yourEditText= (EditText) findViewById(R.id.EditText);
//        emailT.requestFocus();
//        InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
//        imm.showSoftInput(emailT, InputMethodManager.SHOW_IMPLICIT);
//        button.setOnClickListener(action());
    }


//    public  void login(){
//
//
//
//        String email =emailT.getText().toString();
//        String password =passT.getText().toString();
//
//        mAuth.signInWithEmailAndPassword(email, password)
//                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
//                    @Override
//                    public void onComplete(@NonNull Task<AuthResult> task) {
//                        if (task.isSuccessful()) {
//                            Toast.makeText(MainActivity.this,"login ok",Toast.LENGTH_LONG).show();
////                            Navigation.findNavController(view).navigate(R.id.action_login2_to_fragment2);
//                        } else {
//                            Toast.makeText(MainActivity.this,"login fail",Toast.LENGTH_LONG).show();
//                        }
//                    }
//                });
//    }

//    public void reg(){
//        String email =emailT.getText().toString();
//        String password =passT.getText().toString();
//        mAuth.createUserWithEmailAndPassword(email, password)
//                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
//                    @Override
//                    public void onComplete(@NonNull Task<AuthResult> task) {
//                        if (task.isSuccessful()) {
//                            Toast.makeText(MainActivity.this,"reg ok",Toast.LENGTH_LONG).show();
//                        } else {
//                            Toast.makeText(MainActivity.this,"reg fail",Toast.LENGTH_LONG).show();
//                        }
//                    }
//                });
//
//    }
}