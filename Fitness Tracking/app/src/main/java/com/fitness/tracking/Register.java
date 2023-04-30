package com.fitness.tracking;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;

public class Register extends AppCompatActivity {


    public static final String TAG = "TAG";
    EditText mFullName,mEmail,mPassword,mPhone,mAge,mGender,mHeight,mWeight;
    Button mRegisterBtn;
    TextView mLoginBtn;
    ProgressBar progressBar;
    FirebaseFirestore fStore;
    String userID;
    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        mFullName   = findViewById(R.id.fullName);
        mAge        = findViewById(R.id.age);
        mGender     = findViewById(R.id.gender);
        mEmail      = findViewById(R.id.Email);
        mPassword   = findViewById(R.id.password);
        mPhone      = findViewById(R.id.phone);
        mHeight     = findViewById(R.id.height);
        mWeight     = findViewById(R.id.weight);
        mRegisterBtn= findViewById(R.id.registerBtn);
        mLoginBtn   = findViewById(R.id.createText);

        mAuth = FirebaseAuth.getInstance();
        fStore = FirebaseFirestore.getInstance();
        progressBar = findViewById(R.id.progressBar);

        if(mAuth.getCurrentUser() != null){
            startActivity(new Intent(getApplicationContext(),start.class));
            finish();
        }


        mRegisterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String email = mEmail.getText().toString().trim();
                 String password = mPassword.getText().toString().trim();
                 String nameStr = mFullName.getText().toString();
                 String ageStr=mAge.getText().toString();
                 String genderStr=mGender.getText().toString();
                 String mobileStr    = mPhone.getText().toString();
                 String heightStr=mHeight.getText().toString();
                 String weightStr=mWeight.getText().toString();

                if(TextUtils.isEmpty(email)){
                    mEmail.setError("Email is Required.");
                    return;
                }

                if(TextUtils.isEmpty(password)){
                    mPassword.setError("Password is Required.");
                    return;
                }

                if(password.length() < 6){
                    mPassword.setError("Password Must be >= 6 Characters");
                    return;
                }

                progressBar.setVisibility(View.VISIBLE);

                // register the user in firebase

                mAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            FirebaseUser FirebaseUser=mAuth.getCurrentUser();

                            ReadWriteUserDetails itemDetailsObject=new ReadWriteUserDetails(nameStr,ageStr,mobileStr,genderStr,heightStr,weightStr);

                            DatabaseReference referenceProfile= FirebaseDatabase.getInstance().getReference("Registered Users");
                            referenceProfile.child(FirebaseUser.getUid()).setValue(itemDetailsObject).addOnCompleteListener(new OnCompleteListener<Void>() {
                                @Override
                                public void onComplete(@NonNull Task<Void> task) {
                                    if(task.isSuccessful()){
                                        Toast.makeText(getApplicationContext(),"Successful", Toast.LENGTH_SHORT).show();
                                        FirebaseUser user=mAuth.getCurrentUser();
                                        Intent i =new Intent(getApplicationContext(),Login.class);
                                        startActivity(i);
                                        finish();
                                    }
                                    else{
                                        Toast.makeText(getApplicationContext(),"Failed To Save Data",Toast.LENGTH_SHORT).show();
                                    }
                                }
                            });



                        } else {
                            // If sign in fails, display a message to the user.
                            Toast.makeText(getApplicationContext(),"Sign Up Failed", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });



        mLoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Login.class));
            }
        });
    }
}