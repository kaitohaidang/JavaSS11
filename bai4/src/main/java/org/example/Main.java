package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Device[] devices = new Device[]{
                new SmartPhone(1, "iPhone 15 Pro Max"),
                new Laptop(2, "MacBook Pro M3"),
                new Televison(3, "Samsung Smart TV 4K")
        };
        for (Device device : devices) {
            device.TurnOn();

            if (device instanceof Connectable) {
                ((Connectable) device).connectWifi();
            }
            if (device instanceof Chargeable) {
                ((Chargeable) device).charge();
            }
            device.TurnOff();
            System.out.println();
        }
    }
}