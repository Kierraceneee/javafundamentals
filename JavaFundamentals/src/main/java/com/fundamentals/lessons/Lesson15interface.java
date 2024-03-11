package com.fundamentals.lessons;

import javax.swing.*;

public interface Lesson15interface {

    //Static final variable
    String LED = "LED";

    //Static method
    static boolean isEnergyEfficient(String electricType) {
        return electricType.equals(LED);
    }

    //Abstract Method
    void turnOnDevice();

    //default allows for method body
    default void increaseVolume(int value){
        System.out.println("Volume increased to " + value);
    }
}
