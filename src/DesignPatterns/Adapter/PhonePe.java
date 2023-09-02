package DesignPatterns.Adapter;

public class PhonePe {
    public static void main(String[] args) {
       BankApi bankApi = new Icici_Api_Adapter();

       String fromAccNo = "111111";
       String toAccNo = "999999";

       double amt = 100.0;

       bankApi.sendMoney(fromAccNo, toAccNo, amt);

    }
}
