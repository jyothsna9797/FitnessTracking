package com.fitness.tracking;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {


    Button button1,button2;
    BottomNavigationView nav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        Toolbar toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);


        button1 = findViewById(R.id.startyoga1);
        button2 = findViewById(R.id.startyoga2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,SecondActivity2.class);
                startActivity(intent);

            }
        });



        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);

            }
        });
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.id_privacy){

            Intent intent  = new Intent(Intent.ACTION_VIEW, Uri.parse("https://5appshere1.blogspot.com/2023/03/privacy-policy-of-basketball-fitness.html?m=1"));
            startActivity(intent);

            return true;
        }
        if (id == R.id.id_terms){

            Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://5appshere1.blogspot.com/2023/03/terms-and-conditions-of-basketball_92.html?m=1"));
            startActivity(intent);


            return true;
        }
        if (id == R.id.rate){

            try {
                startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("market://details?id=" + getPackageName())));
            } catch(Exception ex) {
                startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://play.google.com/store/apps/details?id=" + getPackageName())));

            }


            return true;
        }

        if (id == R.id.share){

            Intent myIntent = new Intent(Intent.ACTION_SEND);
            myIntent.setType("text/plain");
            String sharebody = " This is the best app for Fitness Tracking \n By This app you can easily Fit your body for Soccer \n" + "https://play.google.com/store/apps/details?id=com.fitness.tracking&hl=en";
            String sharesub = "Fitness Tracking";
            myIntent.putExtra(Intent.EXTRA_SUBJECT,sharesub);
            myIntent.putExtra(Intent.EXTRA_TEXT,sharebody);
            startActivity(Intent.createChooser(myIntent,"Share using"));
            return true;
        }


        return true;
    }

    public void beforeage18(View view) {

        Intent intent = new Intent(MainActivity.this,SecondActivity2.class);
        startActivity(intent);



    }

    public void aftereage18(View view) {

        Intent intent = new Intent(MainActivity.this,Bmicalculator.class);
        startActivity(intent);
    }

    public void food(View view) {


        Intent intent = new Intent(MainActivity.this,FoodActivity.class);
        startActivity(intent);
    }


    @Override
    public void onBackPressed() {

        /*AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle(R.string.app_name);
        builder.setIcon(R.mipmap.ic_launcher);
        builder.setMessage("Do you want to exit?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        finish();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        AlertDialog alert = builder.create();
        alert.show();*/
        Intent intent = new Intent(MainActivity.this,MainActivity.class);
        startActivity(intent);
    }




}