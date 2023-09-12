package com.example.adapterviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
ListView listview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 1 - Adapter view = ListView
        listview=findViewById(R.id.listview);
        // 2- Creating the data source
        String [] countries = {"USA","India","Saudi Arabia","Japan","California"};
        // 3- Creating adapter btw the datasource and listview.

        //Use the custom adapter
        MyCustomAdapter adapter = new MyCustomAdapter(this,countries);
        //last me link the listview with adapter.
        listview.setAdapter(adapter);
    }
}