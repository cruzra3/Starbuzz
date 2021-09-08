package com.raco.starbuzz;

import static android.util.Log.*;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;


public class FoodActivity extends AppCompatActivity {
    public static final String EXTRA_FOODID = "foodid";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        //Get the food from the intent
        int foodId = (Integer)getIntent().getExtras().get(EXTRA_FOODID);
        Food food = Food.foods[foodId];

        //Populate the food name
        TextView name = (TextView)findViewById(R.id.name);
        name.setText(food.getName());

        //Populate the food description
        TextView description = (TextView)findViewById(R.id.description);
        description.setText(food.getDescription());

        //Populate the food image
        ImageView photo = (ImageView)findViewById(R.id.photo);
        photo.setImageResource(food.getImageResourceId());
        photo.setContentDescription(food.getName());
    }
}