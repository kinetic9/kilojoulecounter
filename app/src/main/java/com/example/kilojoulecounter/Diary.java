package com.example.kilojoulecounter;

import  java.util.ArrayList;

public class Diary {

    public static double dailyNKI(ArrayList<Double> values ){

        double sum0 = (values.get(0) + values.get(1) + values.get(2)
                + values.get(3)) - (values.get(4) + values.get(5) + values.get(6));

        return sum0;
    }

    public static double averageNKI(){

        return 0;
    }

    public static double categoryTotal(){
        return  0;
    }
}
