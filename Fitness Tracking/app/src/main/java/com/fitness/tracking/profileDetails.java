package com.fitness.tracking;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class profileDetails extends AppCompatActivity {
    TextView name,age,gender,number,height,weight;
    Button editProfile;
    public DatabaseReference databaseReference;
    ProgressBar progressBar;
    FirebaseUser firebaseUser;
    FirebaseAuth auth;

    String nameStr,ageStr,genderStr,numberStr,heightstr,weightstr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_details);

        name=findViewById(R.id.name_tv);
        age=findViewById(R.id.age_tv);
        gender=findViewById(R.id.gender_tv);
        number=findViewById(R.id.mobile_tv);
        height=findViewById(R.id.height_tv);
        weight=findViewById(R.id.weight_tv);
        editProfile=findViewById(R.id.edit_profile_btn);
        ProgressBar progressBar=findViewById(R.id.progressBar);
        progressBar.setVisibility(View.VISIBLE);
        auth=FirebaseAuth.getInstance();
        firebaseUser =auth.getCurrentUser();
        databaseReference= FirebaseDatabase.getInstance().getReference("Registered Users");

        String currentuser = auth.getInstance().getCurrentUser().getUid();

        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot dataSnapshot : snapshot.getChildren()) {
                    String id=dataSnapshot.getKey().toString();
                    if(currentuser.equals(id)){
                        ReadWriteUserDetails user = dataSnapshot.getValue(ReadWriteUserDetails.class);
                        name.setText("Name: "+user.name);
                        age.setText("Age: "+user.age);
                        gender.setText("Gender: "+user.gender);
                        number.setText("Mobile: "+user.mobile);
                        height.setText("Height: "+user.height);
                        weight.setText("Weight: "+user.weight);
                        progressBar.setVisibility(View.GONE);
                        nameStr=user.name;
                        ageStr=user.age;
                        genderStr=user.gender;
                        numberStr=user.mobile;
                        heightstr=user.height;
                        weightstr=user.weight;
                    }

                }

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });


        editProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(profileDetails.this,editprofile.class);
                i.putExtra("name",nameStr);
                i.putExtra("age",ageStr);
                i.putExtra("gender",genderStr);
                i.putExtra("mobile",numberStr);
                i.putExtra("key",currentuser);
                i.putExtra("height",heightstr);
                i.putExtra("weight",weightstr);
                startActivity(i);
            }
        });


    }
}