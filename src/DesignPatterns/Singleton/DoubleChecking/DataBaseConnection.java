package DesignPatterns.Singleton.DoubleChecking;

public class DataBaseConnection {
    private static DataBaseConnection dataBaseConnection = null;

    private DataBaseConnection(){}

    public static DataBaseConnection getInstance(){
//        DOUBLE-CHECKING LOCK
        if(dataBaseConnection == null){ // I. CHECK
            synchronized (DataBaseConnection.class){ // II. ACQUIRE LOCK
                // NOTE: we can use lock() unlock() also instead of synchronized.
                if(dataBaseConnection == null){ // III. CHECK AGAIN
                    dataBaseConnection = new DataBaseConnection();
                }
            }
        }
        return  dataBaseConnection;
    }
}
