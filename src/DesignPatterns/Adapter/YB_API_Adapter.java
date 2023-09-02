package DesignPatterns.Adapter;

public class YB_API_Adapter implements BankApi{

    YB_API_Adapter ybApiAdapter = new YB_API_Adapter();

    @Override
    public double getBalance(String accNumber) {
        return 0;
    }

    @Override
    public boolean sendMoney(String fromAcc, String toAcc, double amt) {
        System.out.println("YB API: SENDING " + amt + " rs from " + fromAcc + " to " + toAcc);
        return false;
    }
}
