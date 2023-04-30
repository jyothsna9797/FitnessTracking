package com.fitness.tracking;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class SecondActivity extends AppCompatActivity {


    int[] newArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        Toolbar toolbar =  findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);


        newArray = new int[]{


                R.id.bridge_pose,R.id.chair_pose,R.id.child_pose,R.id.cobbler_pose,R.id.cow_pose,R.id.plank_pose,
                R.id.crunches_pose,R.id.situp_pose,R.id.legup_pose,R.id.windmill_pose,






        };
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

            return  true;
        }
        if (id == R.id.id_terms){

            Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://5appshere1.blogspot.com/2023/03/terms-and-conditions-of-basketball_92.html?m=1"));
            startActivity(intent);

            return  true;
        }
        if (id == R.id.rate){

            try {
                startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("market://details?id=" + getPackageName())));
            } catch(Exception ex) {
                startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://play.google.com/store/apps/details?id=" + getPackageName())));

            }





            return  true;
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

    public void Imagebuttonclicked(View view) {



        for (int i=0;i< newArray.length;i++){


            if (view.getId() == newArray[i]) {
                int value = i+1;
                Log.i("FIRST",String.valueOf(value));
                Intent intent = new Intent(SecondActivity.this,ThirdActivity.class);
                intent.putExtra("value", String.valueOf(value));
                startActivity(intent);



            }
        }


    }


    public void onBackPressed() {
        Intent intent = new Intent(SecondActivity.this,Home.class);
        startActivity(intent);
        finish();
    }
}