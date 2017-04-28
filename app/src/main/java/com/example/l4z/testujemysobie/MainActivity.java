package com.example.l4z.testujemysobie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button mPopular;
    Button mHistory;
    Button mSongs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the Button with ID buttonToMostPopular
        mPopular = (Button) findViewById(R.id.buttonToMostPopular);
        // Set a click listener on that View
        mPopular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {class PopularActivity}
                Intent i = new Intent(MainActivity.this, PopularActivity.class);
                // Start the new activity
                startActivity(i);
            }
        });
        // Find the Button with ID buttonToHistory
        mHistory = (Button) findViewById(R.id.buttonToHistory);
        // Set a click listener on that View
        mHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {class HistoryActivity}
                Intent i = new Intent(MainActivity.this, HistoryActivity.class);
                // Start the new activity
                startActivity(i);
            }
        });
        // Find the Button with ID buttonToOwnSongs
        mSongs = (Button) findViewById(R.id.buttonToOwnSongs);
        // Set a click listener on that View
        mSongs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {class OwnerSongsActivity}
                Intent i = new Intent(MainActivity.this, OwnerSongsActivity.class);
                // Start the new activity
                startActivity(i);
            }
        });
    }
}
