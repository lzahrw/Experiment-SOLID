package PaymentServices;

public class PhoneOrderService implements OrderService {
    @Override
    public void orderRegister(String customerName) {
        System.out.println("phone order registered for " + customerName);
    }
    @Override
    public void orderPayment(int foodPrice) {
        System.out.println("phone Payment with Price : " + foodPrice + " Tomans!");
    }
}