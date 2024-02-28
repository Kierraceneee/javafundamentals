package com.fundamentals.labs;

import java.sql.SQLOutput;

public class NumbersLab {

    //TASK ONE
    public void localVariable() {
        // Binary value of 29;
        short myBinary = 0b11101;
        System.out.println(myBinary);
        // Hexadecimal value of 29;
        byte myHexadecimal = 0x1D;
        System.out.println(myHexadecimal);
    }

    // TASK TWO
    public void byteToInt(){
        byte myByte = 29;
        int intValue = (int) myByte;
        System.out.println("Byte value is " + myByte);
        System.out.println("Converted to int is " + intValue);
        //INT TO FLOAT
    }
    public void shortToLong(){
        short myShort = 165;
        long longValue = (long) myShort;
        System.out.println("Short value is " + myShort);
        System.out.println("Converted to long is " + longValue);
    }

    public void intToFloat(){
        int myInt = 274;
        float floatValue = (float) myInt;
        System.out.println("Int value is " + myInt);
        System.out.println("Converted to float is " + floatValue);
    }

    //TASK THREE
    public void doubleToLong(){
        double myDouble = 3451;
        float floatValue = (float) myDouble;
        System.out.println("Double value is " + myDouble);
        System.out.println("Converted to float " + floatValue);
    }

    public void floatToInt(){
        float myFloat = 67399;
        int intValue = (int) myFloat;
        System.out.println("Float value is " + myFloat);
        System.out.println("Converted to int " + intValue);
    }

    public void longToShort(){
        long myLong = 747289;
        short shortValue = (short) myLong;
        System.out.println("Long value is " + myLong);
        System.out.println("Converted to short " + shortValue);
    }




    public static void main(String[] args){
        NumbersLab myLab = new NumbersLab();
        myLab.localVariable();
        myLab.byteToInt();
        myLab.shortToLong();
        myLab.intToFloat();
        myLab.doubleToLong();
        myLab.floatToInt();
        myLab.longToShort();
    }
}
