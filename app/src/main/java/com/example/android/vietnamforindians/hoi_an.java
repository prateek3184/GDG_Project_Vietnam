package com.example.android.vietnamforindians;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class hoi_an extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.AppTheme);
        setContentView(R.layout.activity_hoi_an);
    }

    /* Passing control to next activity */

    public void nextAfterHoiAn(View view)
    {
        Intent intent = new Intent(this, cham_island.class);
        startActivity(intent);
    }

    /* Passing control to previous activity */

    public void beforeHoiAn(View view)
    {
        Intent intent = new Intent(this, phong_nha.class);
        startActivity(intent);
    }
}
