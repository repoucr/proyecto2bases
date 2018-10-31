/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucr.if4100.sqlaccess.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import ucr.if4100.sqlaccess.common.helpers.Configurations;

/**
 *
 * @author Equipo
 */
public class DatabaseConnection {

    public static Connection getDatabaseConnection() throws ClassNotFoundException, SQLException{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionString = Configurations.getConnectionString();
        
        return DriverManager.getConnection(connectionString);
    }
    
}
