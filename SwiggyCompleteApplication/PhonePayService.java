package newswiggy.SwiggyCompleteApplication;

import newswiggy.SwiggyCompleteApplication.Payment;

public class PhonePayService implements Payment {
    public static int amount= 1000;
    @Override
    public int paymentSerive() {

        return 100;
    }
}
