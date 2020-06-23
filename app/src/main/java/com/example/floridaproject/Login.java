package com.example.floridaproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Login extends AppCompatActivity {
    private static final String TAG = "Login";
    private BackPressCloseHandler backPressCloseHandler;
    EditText etId, etPassword;
    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

            etId = (EditText)findViewById(R.id.etId);
            etPassword = (EditText)findViewById(R.id.etPassword);

        mAuth = FirebaseAuth.getInstance();







        backPressCloseHandler =new BackPressCloseHandler(this);
        Button btnLogin = (Button)findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stEmail = etId.getText().toString();
                String stPassword = etPassword.getText().toString();

                if (stEmail.isEmpty() || stPassword.isEmpty()) {
                    Toast.makeText(Login.this, "please write your Email" + " or  write your password", Toast.LENGTH_LONG).show();
                    return;
                }




                mAuth.signInWithEmailAndPassword(stEmail, stPassword)
                        .addOnCompleteListener(Login.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    // Sign in success, update UI with the signed-in user's information
                                    Log.d(TAG, "signInWithEmail:success");
                                    FirebaseUser user = mAuth.getCurrentUser();
                                    //updateUI(user);
                                    Intent in = new Intent(Login.this, MainActivity.class);
                                    startActivity(in);
                                    Toast.makeText(Login.this, "Login Success!",
                                            Toast.LENGTH_SHORT).show();

                                } else {
                                    // If sign in fails, display a message to the user.
                                    Log.w(TAG, "signInWithEmail:failure", task.getException());
                                    Toast.makeText(Login.this, "Authentication failed.",
                                            Toast.LENGTH_SHORT).show();
                                    //updateUI(null);
                                }

                                // ...
                            }
                        });

            }
        });


    Button btnRegister = (Button)findViewById(R.id.btnRegister);
    btnRegister.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String stEmail = etId.getText().toString();
            String stPassword = etPassword.getText().toString();

            if(stEmail.isEmpty()){
                Toast.makeText(Login.this, "Please write your Email", Toast.LENGTH_LONG).show();
                return;



            }
            if(stPassword.isEmpty()){Toast.makeText(Login.this,"please write your password", Toast.LENGTH_LONG).show();
            return;}



//           Toast.makeText(Login.this, "Email : "+stEmail+", password :" + stPassword, Toast.LENGTH_SHORT).show();

            mAuth.createUserWithEmailAndPassword(stEmail, stPassword)
                    .addOnCompleteListener(Login.this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {
                                // Sign in success, update UI with the signed-in user's information
                                Log.d(TAG, "createUserWithEmail:success");
                                Toast.makeText(Login.this, "Authentication Success", Toast.LENGTH_SHORT).show();
                                FirebaseUser user = mAuth.getCurrentUser();
                                //updateUI(user);
                            } else {
                                // If sign in fails, display a message to the user.
                                Log.w(TAG, "createUserWithEmail:failure", task.getException());
                                Toast.makeText(Login.this, "Authentication failed.",
                                        Toast.LENGTH_SHORT).show();
                                //updateUI(null);
                            }

                            // ...
                        }
                    });





        }
    });




    }

    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        //updateUI(currentUser);
    }

    public void onBackPressed(){
        //super.onBackPressed();
        backPressCloseHandler.onBackPressed();


    }






}