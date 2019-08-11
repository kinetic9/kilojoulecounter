package com.example.kilojoulecounter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class DiaryEntry extends AppCompatActivity {
    private List<Diary> diaryList;
    String breakfast, lunch, dinner, snacks, sports, gym, jogging,date;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diary_entry);
        //get the intent that made this one and get the data passed
        Intent intent = getIntent();
        String entry = intent.getStringExtra("entry");

        //extract the incoming data
        int pos  = entry.indexOf(",");
        this.breakfast = entry.substring(0,pos);
        entry = entry.substring(pos+1);
        pos  = entry.indexOf(",");
        this.lunch = entry.substring(0,pos);
        entry = entry.substring(pos+1);
        pos  = entry.indexOf(",");
        this.dinner = entry.substring(0,pos);
        entry = entry.substring(pos+1);
        pos  = entry.indexOf(",");
        this.snacks = entry.substring(0,pos);
        entry = entry.substring(pos+1);
        pos  = entry.indexOf(",");
        this.sports = entry.substring(0,pos);
        entry = entry.substring(pos+1);
        pos  = entry.indexOf(",");
        this.gym = entry.substring(0,pos);
        entry = entry.substring(pos+1);
        pos  = entry.indexOf(",");
        this.jogging = entry.substring(0,pos);
        entry = entry.substring(pos+1);
        pos  = entry.indexOf(",");
        this.date = entry;

        // initiate the textviews

        TextView brkfast = findViewById(R.id.breakfastOut);
        TextView lunc = findViewById(R.id.lunchOut);
        TextView din = findViewById(R.id.dinnerOut);
        TextView snac = findViewById(R.id.snacksOut);
        TextView spo = findViewById(R.id.sportOut);
        TextView gy = findViewById(R.id.gymOut);
        TextView jog = findViewById(R.id.jogOut);
        TextView dat = findViewById(R.id.dateOut);

        // set the values

        brkfast.setText("Breakfast "+breakfast+" kj");
        lunc.setText("Lunch "+lunch+" kj");
        din.setText("Dinner "+dinner+" kj");
        snac.setText("Snacks "+snacks+" kj");
        spo.setText("Sports "+sports+" kj");
        gy.setText("Gym "+gym+" kj");
        jog.setText("Jogging "+jogging+" kj");

        dat.setText(date);



    }


}
