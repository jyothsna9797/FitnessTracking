package com.fitness.tracking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Profilepage1 extends AppCompatActivity {



    EditText send_text,send_text2,send_text3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profilepage1);



        send_text = findViewById(R.id.send_text_id);
        send_text2 = findViewById(R.id.send_text_id2);
        send_text3 = findViewById(R.id.send_text_id3);

        TextView cal = findViewById(R.id.calculate);

        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = send_text.getText().toString();
                String str2 = send_text2.getText().toString();
                String str3 = send_text3.getText().toString();

                // Create the Intent object of this class Context() to Second_activity class
                Intent intent = new Intent(getApplicationContext(), profileDetails.class);
                // now by putExtra method put the value in key, value pair key is
                // message_key by this key we will receive the value, and put the string
                intent.putExtra("message_key", str);
                intent.putExtra("message_key2", str2);
                intent.putExtra("message_key3", str3);

                // start the Intent
                startActivity(intent);
            }
        });





    }



    public void hi(View view) {


        Toast.makeText(this, "Profile Data Saved Succesfully", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(Profilepage1.this,profileDetails.class);
        startActivity(intent);
    }
}