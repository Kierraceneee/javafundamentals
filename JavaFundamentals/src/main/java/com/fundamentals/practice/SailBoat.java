package com.fundamentals.practice;

public class SailBoat extends Boat{
    private String sailType;

    public SailBoat(String boatColor){
        this("Yellow", "Full", 55, "Square", "Triangle");
    }

    public SailBoat(String boatColor, String rudderType,
                    int boatSize, String frameType, String sailType){
        super(boatColor, rudderType, frameType, boatSize);
        this.sailType = sailType;
    }

    public String getSailType(){
        return sailType;
    }

    public void maintenance(){
        System.out.println("This boat needs maintenance.");
    }

    public void maintenance(String boatColor){
        System.out.println("This "+ boatColor + " boat needs maintenance.");
    }

    @Override
    public void boatFunction(){
        System.out.println("This boat sails across the sea.");
    }
    public static void main(String[] args){
        SailBoat mySailBoat = new SailBoat("Red");
        System.out.println(mySailBoat.getSailType());
        System.out.println(mySailBoat.getFrameType());
    }
}
