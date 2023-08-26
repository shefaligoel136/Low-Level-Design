package DesignPatterns.Singleton.SingleThread;

public class DataBaseConnection {

    private static DataBaseConnection dataBaseConnection  = null;

    private DataBaseConnection(){}

    public static DataBaseConnection getInstance(){
        if(dataBaseConnection == null){
            dataBaseConnection = new DataBaseConnection();
        }
        return  dataBaseConnection;
    }

//    THIS WILL WORK ONLY FOR SINGLE THREAD BUT NOT MULTIPLE

}
