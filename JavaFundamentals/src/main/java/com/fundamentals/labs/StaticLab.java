package com.fundamentals.labs;

public class StaticLab {


    //TASK ONE
    public static double voltage(double I,double R){
        double V = (I * R);
        return (V);
    }

    public static double current(double V, double R){
        double C = (V / R);
        return (C);
    }

    public static double resistance(double V, double I){
        double R = (V / I);
        return (R);
    }


    public static void main(String[] args){
        StaticLab myLab = new StaticLab();
        System.out.println(voltage(100,350));
        System.out.println(current(21,100));
        System.out.println(resistance(654, 8));
    }






















}
