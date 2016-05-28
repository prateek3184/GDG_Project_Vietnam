package com.example.android.vietnamforindians;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class halong extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.AppTheme);
        setContentView(R.layout.activity_halong);
    }

    /* Passing control to next activity */

    public void nextAfterHalong(View view) {
        Intent intent = new Intent(this, phong_nha.class);
        startActivity(intent);
    }

    /* Passing control to previous activity */

    public void beforeHalong(View view) {
        Intent intent = new Intent(this, Listing_details.class);
        startActivity(intent);
    }

}
