package com.fundamentals.labs;

//TASK ONE
public class Plasma extends Television {
    private String mountType;

    public Plasma(String mountType){
        this(55,70, 11, true, mountType);
    }

     public Plasma(int screensize, int price, int numPorts, boolean isMountable, String mountType){
         super(screensize, price, numPorts, isMountable);
         this.mountType = mountType;
     }

    public String getMountType() {
        return mountType;
    }

    public void resolution(){
        System.out.println("The resolution on this TV is horrid.");
    }

    // TASK THREE
    @Override
    public void turnOn(){
         super.turnOn();
         System.out.println("This TV won't turn on.");
    }

    public static void main(String[] args){
         Plasma myPlasma =  new Plasma("Wall");
         myPlasma.turnOn();
    }
}
