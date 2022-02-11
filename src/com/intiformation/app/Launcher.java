package com.intiformation.app;

import com.intiformation.app.util.ConnectionManager;

import java.sql.SQLException;

public class Launcher {

    public static void main(String[] args) throws SQLException {
        ConnectionManager connectionManager = ConnectionManager.getInstance() ;
        connectionManager.closeConnection();
        connectionManager.getInstance();
    }


}
