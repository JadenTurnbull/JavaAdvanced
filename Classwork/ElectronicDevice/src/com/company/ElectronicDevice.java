package com.company;

public abstract class ElectronicDevice {

    public abstract void turnOn();
    public abstract void turnOff();

    public void setState(PowerState state) {
        switch(state) {
            case OFF:
                System.out.println(state.getDescription());
                break;
            case ON:
                System.out.println(state.getDescription());
                break;
            case SUSPEND:
                System.out.println(state.getDescription());
                break;
        }
    }


}
