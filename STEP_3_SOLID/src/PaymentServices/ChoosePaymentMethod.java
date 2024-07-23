package PaymentServices;

public class ChoosePaymentMethod {
    public OrderService chooseOrderService(int customerAnswerForPaymentMethod) {
        // 1 for online and 2 for on-site and 3 for phone
        if (customerAnswerForPaymentMethod == 1) {
            return new OnlineOrderService();
        } else if (customerAnswerForPaymentMethod == 2) {
            return new OnSiteOrderService();
        } else if (customerAnswerForPaymentMethod == 3) {
            return new PhoneOrderService();
        } else {
            throw new IllegalArgumentException("This order type is not valid: " + orderType);
        }
    }
}