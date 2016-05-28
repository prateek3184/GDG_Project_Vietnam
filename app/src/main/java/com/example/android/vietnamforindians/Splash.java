package com.example.android.vietnamforindians;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        /****** Create Thread that will sleep for 3 seconds *************/
        Thread background = new Thread() {
            public void run() {

                try {
                    // Thread will sleep for 4 seconds
                    sleep(4*1000);

                    // After 4 seconds redirect to another intent
                    Intent i=new Intent(getBaseContext(),Home.class);
                    startActivity(i);

                    //Remove activity
                    finish();

                } catch (Exception e) {

                }
            }
        };

        // start thread
        background.start();
        Toast.makeText(this, "Welcome to Vietnam", Toast.LENGTH_LONG).show();
    }
}
