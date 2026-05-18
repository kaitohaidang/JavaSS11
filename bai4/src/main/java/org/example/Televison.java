package org.example;

public class Televison extends Device implements Connectable {
    public Televison(int id, String name) {
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
        System.out.println("   -> Kết nối WiFi để xem YouTube.");
    }

}
