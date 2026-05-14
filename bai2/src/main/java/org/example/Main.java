package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Payment[] payments = new Payment[3];
        payments[0] = new CashPayment(150000);
        payments[1] = new CreditCardPayment(500000);
        payments[2] = new EWalletPayment(250000);
        for (Payment payment : payments) {
            payment.printAmount();
            payment.pay();
            if (payment instanceof Refundable) {
                ((Refundable) payment).refund();
            } else {
                System.out.println("Lưu ý: Hình thức này không hỗ trợ hoàn tiền tự động.");
            };
        }
    }
}