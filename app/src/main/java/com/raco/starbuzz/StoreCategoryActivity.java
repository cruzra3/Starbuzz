package com.raco.starbuzz;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class StoreCategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store_category);

        ArrayAdapter<Store> listAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                Store.stores);
        ListView listStores = (ListView) findViewById(R.id.list_stores);
        listStores.setAdapter(listAdapter);

        //Create the listener
        AdapterView.OnItemClickListener itemClickListener =
                new AdapterView.OnItemClickListener(){
                    @Override
                    public void onItemClick(AdapterView<?> listStores,
                                            View itemView,
                                            int position,
                                            long id) {
                        //Pass the store the user clicks on to StoreActivity
                        Intent intent = new Intent(StoreCategoryActivity.this,
                                StoreActivity.class);
                        intent.putExtra(StoreActivity.EXTRA_STOREID, (int) id);
                        startActivity(intent);
                    }
                };

        //Assign the listener to the list view
        listStores.setOnItemClickListener(itemClickListener);
    }
}