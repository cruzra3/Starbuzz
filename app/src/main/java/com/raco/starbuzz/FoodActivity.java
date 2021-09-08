package com.raco.starbuzz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class FoodActivity extends AppCompatActivity {
    public static final String EXTRA_FOODID = "foodid";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
    }
}