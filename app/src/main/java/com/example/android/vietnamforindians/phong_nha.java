package com.example.android.vietnamforindians;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class phong_nha extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.AppTheme);
        setContentView(R.layout.activity_phong_nha);
    }

    /* Passing control to next activity */

    public void nextAfterPhongNha(View view)
    {
        Intent intent = new Intent(this, hoi_an.class);
        startActivity(intent);
    }

    /* Passing control to previous activity */

    public void beforePhongNha(View view)
    {
        Intent intent = new Intent(this, halong.class);
        startActivity(intent);
    }
}
