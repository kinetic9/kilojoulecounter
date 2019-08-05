package com.example.kilojoulecounter;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends AppCompatActivity {

    public SharedPreferences.Editor diaryEditor;
    //Running totals
    public double foodTot;
    public double averageNKI;
    public double exerciseTot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               startActivity(new Intent(MainActivity.this, addData.class));
            }
        });

        // Fetch existing entries
        SharedPreferences sharedPrefs = getSharedPreferences("diary_entries", Activity.MODE_PRIVATE);
        //SharedPreferences runningTotals = getSharedPreferences("running_totals", Activity.MODE_PRIVATE);

        diaryEditor = sharedPrefs.edit();

        //set empty array if no previous data exists
        String diaryJSONString = sharedPrefs.getString("diary","[]");

    }

    //TODO: add a way to load data from shared prefs
    //TODO: implement threads for saving/fetching data

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
