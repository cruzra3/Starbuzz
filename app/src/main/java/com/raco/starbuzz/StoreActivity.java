package com.raco.starbuzz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class StoreActivity extends AppCompatActivity {
    public static final String EXTRA_STOREID = "storeid";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);

        //Get the store from the intent
        int storeId = (Integer)getIntent().getExtras().get(EXTRA_STOREID);
        Store store = Store.stores[storeId];

        //Populate the store name
        TextView name = (TextView)findViewById(R.id.name);
        name.setText(store.getName());

        //Populate the store description
        TextView description = (TextView)findViewById(R.id.description);
        description.setText(store.getDescription());

        //Populate the store image
        ImageView photo = (ImageView)findViewById(R.id.photo);
        photo.setImageResource(store.getImageResourceId());
        photo.setContentDescription(store.getName());

    }
}