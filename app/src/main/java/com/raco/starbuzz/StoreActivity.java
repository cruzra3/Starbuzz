package com.raco.starbuzz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class StoreActivity extends AppCompatActivity {
    public static final String EXTRA_STOREID = "storeid";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);
    }
}