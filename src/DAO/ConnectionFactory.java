package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Administrador
 */
public class ConnectionFactory {

    public Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:sqlserver://192.168.0.100;databaseName=BANCO_FATEC;user=DB_USERNAME;password=DB_PASSWORD");
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}
