package DesignPatterns.Adapter;

public interface BankApi {
    double getBalance(String accNumber);
    boolean sendMoney(String fromAcc, String toAcc, double amt);
}
