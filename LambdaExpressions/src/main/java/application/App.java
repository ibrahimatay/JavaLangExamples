package application;

/*
* https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html
* https://www.oracle.com/webfolder/technetwork/tutorials/obe/java/Lambda-QuickStart/index.html
* */

import interfaces.Addition;
import interfaces.ConnectionBuilder;
import interfaces.HelloSay;
import interfaces.Subtraction;
import models.Connection;
import models.SqlServerConnection;

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        tuple();
        foreachLoop();
        multipleStatements();
        referenceType();
    }

    public static void tuple(){
        Addition addition = (a, b)-> a + b;
        Subtraction subtraction = (a, b)-> a - b;

        System.out.println(addition.valus(1,2));
        System.out.println(subtraction.valus(15,4));
    }

    public static void foreachLoop(){
        List<Integer> arrays = Arrays.asList(1,2,4,5,6,7,8,9);

        arrays.forEach((n)->{
            System.out.println(n);
        });
    }

    public static void multipleStatements(){
        HelloSay say = (message) -> {
            String templateMessage = "Hello ";
            return templateMessage+message;
        };

        System.out.println(say.Hello("İbrahim"));
    }

    public static void referenceType(){
        ConnectionBuilder connectionBuilder = (connectionString) -> {
            SqlServerConnection sqlServerConnection = new SqlServerConnection();
            sqlServerConnection.setDatabaseName(connectionString.getDatabaseName());
            sqlServerConnection.setUserId(connectionString.getUserId());
            sqlServerConnection.setPassword(connectionString.getPassword());
            sqlServerConnection.setServerAddress(connectionString.getServerAdress());

            return sqlServerConnection;
        };

        Connection connection = new Connection();
        connection.setUserId("dbo");
        connection.setPassword("123456");
        connection.setDatabaseName("HR");
        connection.setServerAdress("127.0.0.1");


        System.out.println(connectionBuilder.build(connection).getConnectionString());
    }
}
