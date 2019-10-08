package com.example.listviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapterActivity extends AppCompatActivity {
    final List<Animal> animals = new ArrayList<Animal>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_adapter);
        animals.add(new Animal("Horse",R.mipmap.at));
        animals.add(new Animal("Lion",R.mipmap.aslan));
        animals.add(new Animal("Tiger",R.mipmap.kaplan));

        final ListView listview= (ListView) findViewById(R.id.listview);
        AnimalAdapter adapter = new AnimalAdapter(this, animals);
        listview.setAdapter(adapter);
    }
}
