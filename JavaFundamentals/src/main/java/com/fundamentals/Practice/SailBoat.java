package com.fundamentals.Practice;

public class SailBoat extends Boat{
    private String boatColor;

    public SailBoat(String boatColor){
        this("Yellow", "Full", 55, "Square");
    }

    public SailBoat(String boatColor, String rudderType,
                    int boatSize, String frameType){
        this.boatColor = boatColor;
        this.frameType = frameType;
        this.boatSize = boatSize;
        this.rudderType = rudderType;
    }

    public String getboatColor(){
        return boatColor;
    }

    public void maintenance(){
        System.out.println("This boat needs maintenance.");
    }

    public void maintenance(String boatColor){
        System.out.println("This "+ boatColor + " boat needs maintenance.");
    }
    public static void main(String[] args){
        SailBoat mySailBoat = new SailBoat("Red");
        System.out.println(mySailBoat.getboatColor());
        System.out.println(mySailBoat.getFrameType());
    }
}
