package com.example.kilojoulecounter;

import  java.util.ArrayList;

public class Diary {

    private double breakfast, sports, gym, snacks, lunch, dinner, jogging;

    public Diary(){

    }



    public Diary(double breakfast, double lunch, double dinner, double snacks, double gym, double jogging, double sports){
        this.breakfast = breakfast;
        this.lunch = lunch;
        this.dinner = dinner;
        this.gym = gym;
        this.sports = sports;
        this.snacks = snacks;
        this.jogging = jogging;
    }

    // Getters

    public double getBreakfast(){
        return breakfast;
    }

    public double getLunch(){
        return lunch;
    }

    public double getDinner(){
        return dinner;
    }

    public double getGym(){
        return gym;
    }

    public double getSports() {
        return sports;
    }

    public double getSnacks() {
        return snacks;
    }

    public double getJogging() {
        return jogging;
    }


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
