package org.example;

public abstract  class Payment {
    public double amount;
    public Payment(double amount){
        this.amount=amount;
    }
    public abstract void pay();
    public void printAmount() {
        System.out.println("so tien can giao dich "+amount);
    }

}
