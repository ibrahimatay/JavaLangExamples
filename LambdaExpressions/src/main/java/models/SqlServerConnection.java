package models;

public class SqlServerConnection {
    private String databaseName;
    private String userId;
    private String password;
    private String serverAddress;

    public void setServerAddress(String serverAddress) {
        this.serverAddress = serverAddress;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConnectionString(){
        return "data source="+serverAddress+";"+
                "database="+databaseName+ ";"+
                "user id=" +userId+";"+
                "password="+password;

    }
}
