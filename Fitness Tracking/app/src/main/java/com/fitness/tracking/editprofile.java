package com.fitness.tracking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class editprofile extends AppCompatActivity {

    EditText name,age,gender,number,height,weight;
    Button update;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editprofile);

        name=findViewById(R.id.name_tv);
        age=findViewById(R.id.age_tv);
        gender=findViewById(R.id.gender_tv);
        number=findViewById(R.id.mobile_tv);
        height=findViewById(R.id.height_tv);
        weight=findViewById(R.id.weight_tv);
        update=findViewById(R.id.update_profile_btn);

        Intent intent = getIntent();
        String nameStr= intent.getStringExtra("name");
        String ageStr=intent.getStringExtra("age");
        String genderStr=intent.getStringExtra("gender");
        String mobileStr=intent.getStringExtra("mobile");
        String ownerKey=intent.getStringExtra("key");
        String heightStr=intent.getStringExtra("height");
        String weightStr=intent.getStringExtra("weight");

        name.setText(nameStr);
        age.setText(ageStr);
        gender.setText(genderStr);
        number.setText(mobileStr);
        height.setText(heightStr);
        weight.setText(weightStr);

        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(editprofile.this, "Clicked", Toast.LENGTH_SHORT).show();
                DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference("Registered Users");
                mDatabase.child(ownerKey).setValue(new ReadWriteUserDetails(name.getText().toString(),age.getText().toString(),number.getText().toString(),gender.getText().toString(),height.getText().toString(),weight.getText().toString()));
                Intent i=new Intent(getApplicationContext(),Home.class);
                startActivity(i);
                finish();
            }
        });
    }
}