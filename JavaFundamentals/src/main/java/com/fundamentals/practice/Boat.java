package com.fundamentals.practice;

public class Boat {
    // ENCAPSULATION
    protected String boatColor;
    protected String rudderType;
    protected int boatSize;
    protected String frameType;

//DEFAULT CONSTRUCTOR- OBJECT 1
    public Boat(){
        boatColor = "Blue";
        frameType = "Square";
        boatSize = 30;
        rudderType = "full";
    }
//CONSTRUCTOR 2- OBJECT 2
    public Boat(String frameType, String boatColor, String rudderType, int boatSize){
        this.frameType =  frameType;
        boatColor = "Green";
        rudderType = "Spade";
        boatSize = 60;

    }
    public String getBoatColor(){
        return boatColor;
    }

    public String getRudderType(){
        return rudderType;
    }
    public String getFrameType(){
        return frameType;
    }

    public int getBoatSize(){
        return boatSize;
    }

    public void boatFunction(){
        System.out.println("This boat floats across the sea.");
    }
    public void boatFunction(String boatColor){
        System.out.println("This " + boatColor + " boat floats across the sea.");
    }

    public static void main(String[] args){

    }
}
