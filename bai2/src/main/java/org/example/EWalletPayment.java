package org.example;

public class EWalletPayment extends Payment implements Refundable {
    public EWalletPayment(double amount) {
        super(amount);
    }

    @Override
    public void pay() {
        System.out.println("Xử lý thanh toán: Trừ tiền từ VÍ ĐIỆN TỬ.");
    }

    @Override
    public void refund() {
        System.out.println("Xử lý hoàn tiền: Hoàn trả lại vào VÍ ĐIỆN TỬ.");
    }
}
