package com.fundamentals.main;

import com.fundamentals.practice.HousePhone;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Java");
        //houseExample();
        //basicStatements();
        phoneExample();
    }

    // Single Comment
    /* Multi-line
        Comment */


    public static void houseExample() {
        House myHouse = new House("Concrete", "Red", "Cedar Shingle", 30);
        myHouse.doorFunction();
        System.out.println(myHouse.entranceDoorColor);
    }

    public static void phoneExample(){
        int[] keys ={0,1,2,3,4,5,6,7,8,9};
        HousePhone myTelephone = new HousePhone(7, keys, 0, "LCD");
        myTelephone.sendCall();
    }
    static void basicStatements() {
        System.out.println("This is my first sentence.");
        System.out.println("I am new to Java.");
        System.out.println("This Java course is cool.");
        System.out.println("I am learning stuff every day.");
    }



}




