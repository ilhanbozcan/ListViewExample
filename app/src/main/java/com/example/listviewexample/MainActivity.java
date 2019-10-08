package com.example.listviewexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button arrayAdapterButton;
    Button customAdapterButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        arrayAdapterButton = findViewById(R.id.array); // find id arrayadapter
        customAdapterButton = findViewById(R.id.custom); // find id customadapter

        AdapterButtonListener Listener = new AdapterButtonListener();

        arrayAdapterButton.setOnClickListener(Listener); // set click
        //arrayAdapterButton.setOnClickListener(Listener); // set click
        /*
        View.OnClickListener Listener2 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("AdapterButtonListener" , "Clicked" );
                Intent intent = new Intent(MainActivity.this,ArrayAdapterActivity.class); //set sm to ArrayAdapterActivity
                startActivity(intent); // onclick open screen which in intent

            }
        };
        */
        customAdapterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("CustomButtonListener", "Clicked");
                Intent intent = new Intent(MainActivity.this, CustomAdapterActivity.class);
                startActivity(intent);
            }
        });



    }

    private class AdapterButtonListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            Log.d("AdapterButtonListener" , "Clicked" );
            Intent intent = new Intent(MainActivity.this, ArrayAdapterActivity.class); //set sm to ArrayAdapterActivity
            startActivity(intent); // onclick open screen which in intent
        }
    }
}
