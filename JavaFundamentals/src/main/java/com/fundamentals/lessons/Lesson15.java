package com.fundamentals.lessons;

public class Lesson15 implements Lesson15interface {
    // Abstraction - Abstract Classes and Interfaces

    @Override
    public void turnOnDevice(){
        System.out.println("Device is turned on.");
    }

    public static void main(String[] args){
        Lesson15 myLesson = new Lesson15();
        System.out.println(Lesson15.LED);
        myLesson.turnOnDevice();
        myLesson.increaseVolume(22);
        System.out.println(Lesson15interface.isEnergyEfficient(LED));
    }

}
