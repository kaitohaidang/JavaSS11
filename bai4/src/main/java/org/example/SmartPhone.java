package org.example;

public class SmartPhone extends Device implements Connectable,Chargeable {
    public SmartPhone(int id, String name) {
        super(id, name);
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
        System.out.println("  Bắt sóng WiFi thành công.");
    }

    @Override
    public void charge() {
        System.out.println(" Đang sạc pin qua cổng Type-C.");
    }
}

