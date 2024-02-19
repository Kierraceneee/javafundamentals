package com.fundamentals.main;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Java");
        houseExample();
        basicStatements();
    }

    // Single Comment
    /* Multi-line
        Comment
    */

    public static void houseExample() {
        House myHouse = new House();
        myHouse.doorFunction();
        myHouse.entranceDoorColor = "Red";
        myHouse.foundationType = "Concrete";
        myHouse.roofStyle = "Cedar Shingle";
        myHouse.totalWindows = 30;
        System.out.println(myHouse.entranceDoorColor);
    }
    static void basicStatements() {
        System.out.println("This is my first sentence.");
        System.out.println("I am new to Java.");
        System.out.println("This Java course is cool.");
        System.out.println("I am learning stuff every day.");
    }

}




