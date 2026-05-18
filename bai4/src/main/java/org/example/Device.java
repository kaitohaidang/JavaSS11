package org.example;

public abstract class Device {
    protected int id;
    protected String name;
    public Device(int id, String name) {
        this.id=id;
        this.name=name;
    }
    void TurnOn() {
        System.out.println("bat len");
    }
    void TurnOff() {
        System.out.println("tat di");
    }
}
