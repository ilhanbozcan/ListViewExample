package com.example.listviewexample;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ArrayAdapterActivity extends ListActivity {
    
    static String[] ANIMALS = new String[] {"Güray", "Mehmet", "Yemre"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_array_adapter);


        
        ListView ListView = getListView();
        
        ArrayAdapter adapter = new ArrayAdapter<String> (this,R.layout.activity_array_adapter,ANIMALS);
        setListAdapter(adapter);
        ListView.setTextFilterEnabled(true);
        //ListView.setOnItemClickListener();

        ListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ArrayAdapterActivity.this,((TextView)view).getText(),Toast.LENGTH_SHORT).show(); // create toast message
            }
        });
        
    }
}
