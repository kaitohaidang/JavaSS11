package org.example;

public class Laptop extends Device implements Chargeable,Connectable{
    public Laptop(int id, String name) {
        super(id,name);
    }

    @Override
    void TurnOn() {
        super.TurnOn();
    }

    @Override
    void TurnOff() {
        super.TurnOff();
    }

    @Override
    public void connectWifi() {
        System.out.println("   -> Kết nối mạng WLAN thành công.");
    }

    @Override
    public void charge() {
        System.out.println("   -> Đang cắm sạc Adapter.");
    }
}
