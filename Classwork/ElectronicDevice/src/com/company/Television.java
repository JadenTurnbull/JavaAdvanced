package com.company;

public class Television extends ElectronicDevice {

    @Override
    public void turnOn() {
        initializeScreen();
        changeChannel(1);
    }

    @Override
    public void turnOff(){
        System.out.println("TV turned off");
    }

    public void changeChannel(int channel){
        System.out.println("Channel changed to " + channel);
    }

    public void initializeScreen(){
        System.out.println("Screen turned on");
    }
}
