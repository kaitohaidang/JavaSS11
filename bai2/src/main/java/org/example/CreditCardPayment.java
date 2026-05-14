package org.example;

public class CreditCardPayment extends Payment implements Refundable {
    public CreditCardPayment(double amount) {
        super(amount);
    }

    @Override
    public void pay() {
        System.out.println("Xử lý thanh toán: Trừ tiền từ THẺ TÍN DỤNG.");
    }

    @Override
    public void refund() {
        System.out.println("Xử lý hoàn tiền: Hoàn trả lại vào THẺ TÍN DỤNG.");
    }
}
