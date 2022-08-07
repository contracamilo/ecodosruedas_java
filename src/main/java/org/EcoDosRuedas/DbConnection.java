package org.EcoDosRuedas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    public Connection getConnection() throws SQLException {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/EcoDosRuedas", "****", "********");
            if (connection != null) {
                System.out.println("DB connected");
            }
        } catch (SQLException err) {
            System.out.println(err);
        }
        return connection;
    }
}

