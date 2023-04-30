package com.fitness.tracking;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Home extends AppCompatActivity {


    BottomNavigationView nav;

    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);



        nav = findViewById(R.id.nav);


        button1 = findViewById(R.id.start);




        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Home.this,SecondActivity2.class);
                startActivity(intent);

            }
        });

        nav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId())
                {
                    case R.id.home:

                        Intent intent = new Intent(Home.this,SecondActivity2.class);
                        startActivity(intent);

                        break;

                    case R.id.explore:

                        Intent intent1 = new Intent(Home.this,Bmicalculator.class);
                        startActivity(intent1);

                        break;

                    case R.id.setting:

                        Intent intent2 = new Intent(Home.this,FoodActivity.class);
                        startActivity(intent2);

                        break;


                    case R.id.profil:

                        Intent intent3 = new Intent(Home.this,profileDetails.class);
                        startActivity(intent3);

                        break;



                }

                return true;
            }
        });
    }


    public void beforeage18(View view) {


        Intent intent = new Intent(Home.this,SecondActivity2.class);
        startActivity(intent);
    }


    public void calculator(View view) {


        Intent intent = new Intent(Home.this,Bmicalculator.class);
        startActivity(intent);
    }




    public void food(View view) {


        Intent intent = new Intent(Home.this,FoodActivity.class);
        startActivity(intent);
    }
}