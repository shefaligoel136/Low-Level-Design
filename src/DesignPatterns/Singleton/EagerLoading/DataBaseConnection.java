package DesignPatterns.Singleton.EagerLoading;

public class DataBaseConnection {
    private static DataBaseConnection dataBaseConnection  = new DataBaseConnection();

    private DataBaseConnection(){}

    public static DataBaseConnection getInstance(){
        return  dataBaseConnection;
    }

//    WILL WORK IN MULTI THREAD
//    ISSUES -
//    1. MORE SINGLETON CLASSES LIKE THIS WILL INCREASE APP STARTUP TIME
//    2. CANNOT PASS ATTRIBUTES TO CONSTRUCTOR


}
