package com.intiformation.app.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

    private static final String URL = "jdbc:mysql://localhost:8889/Java_Paradise";
    private static final String USER = "root";
    private static final String PASSWORD = "root";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static  ConnectionManager instance;
    private Connection connection = null;

    private ConnectionManager() throws SQLException {
        try {
            loadDriver();
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void loadDriver() {
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            System.out.println("Driver MySQL introuvable");
        }
    }


    public Connection getConnection() {
        return connection;
    }

    public static ConnectionManager getInstance() throws SQLException {
        if (instance == null) {
            System.out.println("instance est null");
            instance = new ConnectionManager();
        } else if (instance.getConnection().isClosed()) {
            System.out.println("new instance");
            instance = new ConnectionManager();
        }

        return instance;
    }

    public void closeConnection() {
        try {
            this.connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}




