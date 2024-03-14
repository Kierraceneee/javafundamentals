package com.fundamentals.labs;

public class Television {

    //TASK ONE
    private int screenSize;
    private int price;
    private int numPorts;
    private boolean isMountable;


    public void setScreenSize(int screenSize){
        this.screenSize = screenSize;
    }
    public int getScreenSize(){
        return screenSize;
    }

    public void setPrice(int price){
        this.price = price;
    }
    public int getPrice() {
        return price;
    }

    public void setNumPorts(int numPorts){
        this.numPorts = numPorts;
    }

    public int getNumPorts() {
        return numPorts;
    }

    public void setMountable(boolean isMountable){
        this.setMountable(isMountable);
    }
    public boolean getIsMountable(){
        return isMountable;
    }
    //TASK TWO

    public Television(int screenSize, int price){
        this.screenSize = screenSize;
        this.price = price;
    //I tried to add values to these like
    }

    public Television(int screenSize, int price, int numPorts, boolean isMountable){
        this.screenSize =  screenSize;
        this.price = price;
        this.numPorts = numPorts;
        this.isMountable = isMountable;
    }

    //TASK THREE
    public void theTVisOn(){
        System.out.println("The " + screenSize + " inch TV is on.");
    }

    public static void main(String[] args){
    Television myLab = new Television(32, 331);
    myLab.theTVisOn();
    }
}
