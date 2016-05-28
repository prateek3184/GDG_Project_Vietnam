package com.example.android.vietnamforindians;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Listing_details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.AppTheme);
        setContentView(R.layout.activity_listing_details);
    }

    /* Passing control to next activity */

    public void nextAfterHanoi(View view)
    {
        Intent intent = new Intent(this, halong.class);
        startActivity(intent);
    }


}
