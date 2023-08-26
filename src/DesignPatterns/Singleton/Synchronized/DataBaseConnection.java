package DesignPatterns.Singleton.Synchronized;

public class DataBaseConnection {
    private static DataBaseConnection dataBaseConnection = null;

    private DataBaseConnection(){}

    public static synchronized DataBaseConnection getInstance(){
        if(dataBaseConnection == null){
            dataBaseConnection = new DataBaseConnection();
        }
        return  dataBaseConnection;
    }

//    WILL WORK IN MULTI THREAD
//    ISSUES -
//    1. SLOW PERFORMANCE.


}
