package com.company;

public class Main {

    public static void main(String[] args) {
	    ElectronicDevice TV = new Television();
        TV.setState(PowerState.ON);
        TV.turnOn();
    }


}
