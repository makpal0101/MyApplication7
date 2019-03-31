package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //a List of type hero for holding list items
    List<Hero> heroList;

    //the listview
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initializing objects
        heroList = new ArrayList<>();
        listView = (ListView) findViewById(R.id.listView);

        //adding some values to our list
        heroList.add(new Hero(R.drawable.images, "images", "Avengers"));
        heroList.add(new Hero(R.drawable.images, "Joker", "Injustice Gang"));
        heroList.add(new Hero(R.drawable.images, "Iron Man", "Avengers"));
        heroList.add(new Hero(R.drawable.images, "Doctor Strange", "Avengers"));
        heroList.add(new Hero(R.drawable.images, "Captain America", "Avengers"));
        heroList.add(new Hero(R.drawable.images, "Batman", "Justice League"));

        //creating the adapter
        MyListAdapter adapter = new MyListAdapter(this, R.layout.my_custom_list, heroList);

        //attaching adapter to the listview
        listView.setAdapter(adapter);
    }
}