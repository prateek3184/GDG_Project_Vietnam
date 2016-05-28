package com.example.android.vietnamforindians;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    /* Passing control to individual activities for each of the 5 items when user clicks on the corresponding image */

    public void viewHanoi(View view) {
        beforeHalong(view);
    }

    public void viewHaLong(View view) {
        nextAfterHanoi(view);
    }

    public void viewPhongNha(View view) {
        nextAfterHalong(view);
    }

    public void viewHoiAn(View view) {
        nextAfterPhongNha(view);
    }

    public void viewChamIsland(View view) {
        nextAfterHoiAn(view);
    }

    /* Controlling the passing of control when user taps on 'previous' and 'next' options */

    public void nextAfterHanoi(View view) {
        Intent intent = new Intent(this, halong.class);
        startActivity(intent);
    }

    public void nextAfterHalong(View view) {
        Intent intent = new Intent(this, phong_nha.class);
        startActivity(intent);
    }

    public void nextAfterPhongNha(View view) {
        Intent intent = new Intent(this, hoi_an.class);
        startActivity(intent);
    }

    public void nextAfterHoiAn(View view) {
        Intent intent = new Intent(this, cham_island.class);
        startActivity(intent);
    }

    public void beforeHalong(View view) {
        Intent intent = new Intent(this, Listing_details.class);
        startActivity(intent);
    }

    public void beforeHoiAn(View view) {
        Intent intent = new Intent(this, phong_nha.class);
        startActivity(intent);
    }

    public void beforePhongNha(View view) {
        Intent intent = new Intent(this, halong.class);
        startActivity(intent);

    }

    public void beforeChamIsland(View view) {
        Intent intent = new Intent(this, hoi_an.class);
        startActivity(intent);
    }


}
