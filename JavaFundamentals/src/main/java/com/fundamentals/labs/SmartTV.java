package com.fundamentals.labs;

//TASK ONE
public class SmartTV extends Television {
    private String remoteStyle;

    public SmartTV(String remoteStyle){
        this(142,650,4,false, remoteStyle);
    }

    public SmartTV(int screenSize, int price, int numPorts, boolean isMountable, String remoteStyle){
        super(screenSize, price, numPorts, isMountable);
        this.remoteStyle = remoteStyle;
    }

    public String getRemoteStyle() {
        return remoteStyle;
    }

    public void remote(){
        System.out.println("Where's the remote?");
    }

    //TASK THREE
    @Override
    public void turnOn(){
        super.turnOn();
        System.out.println("This TV won't turn off.");
    }

    public static void main(String[] args){
        SmartTV mySmartTV = new SmartTV("Smart");
        mySmartTV.turnOn();
    }
}
