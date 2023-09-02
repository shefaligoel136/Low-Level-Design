package DesignPatterns.Adapter;

public class Icici_Api_Adapter implements BankApi{
    Icici_Bank_Api iciciBankApi = new Icici_Bank_Api();

    @Override
    public double getBalance(String accNumber) {
        return 0;
    }

    @Override
    public boolean sendMoney(String fromAcc, String toAcc, double amt) {
        System.out.println("ICICI API: SENDING " + amt + " rs from " + fromAcc + " to " + toAcc);
        return false;
    }
}
