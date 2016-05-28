package com.example.android.vietnamforindians;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class cham_island extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cham_island);
    }

    /* Passing control to previous̵ activity */

    public void beforeChamIsland(View view)
    {
        Intent intent = new Intent(this, hoi_an.class);
        startActivity(intent);
    }
}
