package com.example.kilojoulecounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;


import static java.lang.Double.parseDouble;


public class addData extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_data);
    }


    public void saveEntry(View view){

        // find views by id
        EditText breakfast = findViewById(R.id.editTextbreakfast);
        EditText lunch = findViewById(R.id.editTextlunch);
        EditText dinner = findViewById(R.id.editTextdinner);
        EditText snacks = findViewById(R.id.editTextsnacks);
        EditText sport = findViewById(R.id.editTextsport);
        EditText gym = findViewById(R.id.editTextgym);
        EditText jogging = findViewById(R.id.editTextjog);

        //get the values added

        //TODO: check if the edit is empty or not

        //TODO: get previously stored amount

        double bf = (breakfast.getText().toString().equals("")) ? 0 : parseDouble( breakfast.getText().toString());
        double lun = (lunch.getText().toString().equals("")) ? 0 :parseDouble( lunch.getText().toString());
        double din = (dinner.getText().toString().equals("")) ? 0 :parseDouble( dinner.getText().toString());
        double snac = (snacks.getText().toString().equals("")) ? 0 :parseDouble( snacks.getText().toString());
        double spor = (sport.getText().toString().equals("")) ? 0 :parseDouble( sport.getText().toString());
        double gy = (gym.getText().toString().equals("")) ? 0 :parseDouble( gym.getText().toString());
        double jog = (jogging.getText().toString().equals("")) ? 0 :parseDouble( jogging.getText().toString());

        // add values to an array
        ArrayList<Double> values = new ArrayList<>();

        values.add(bf);
        values.add(lun);
        values.add(din);
        values.add(snac);
        values.add(spor);
        values.add(gy);
        values.add(jog);

        //double dailyAmount = dailyNKI(values);


    }
}
