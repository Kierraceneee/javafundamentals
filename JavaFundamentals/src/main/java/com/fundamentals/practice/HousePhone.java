package com.fundamentals.practice;

public class HousePhone extends Telephone{


    public HousePhone(int volume, int[] numberKeys,
                      int sendKey, String screen) {
        super(volume, numberKeys, sendKey, screen);
    }

    @Override
    public void recieveCall(){
        System.out.println("Recieving phone call");
    }

    @Override
    public void sendCall(){
        System.out.println("Sending Phone Call");
    }


}
