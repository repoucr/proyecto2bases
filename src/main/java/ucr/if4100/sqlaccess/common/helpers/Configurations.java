/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucr.if4100.sqlaccess.common.helpers;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 *
 * @author Equipo
 */
public class Configurations {

    public static Properties getPropertiesManager() {
        Properties properties = new Properties();
        try {

            ClassLoader loader = Thread.currentThread().getContextClassLoader();
            InputStream stream = loader.getResourceAsStream("custom.properties");
            properties.load(stream);
            stream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return properties;
    }

    private static String getDataBaseName() {
        return getPropertiesManager().getProperty("databaseName");
    }

    private static String getUserName() {
        return getPropertiesManager().getProperty("user");
    }

    private static String getPassword() {
        return getPropertiesManager().getProperty("password");
    }

    public static String getConnectionString() {
        Properties propertiesManager = getPropertiesManager();
        String connectionString = propertiesManager.getProperty("connectionString");
        String formattedConnection = String.format(connectionString, getDataBaseName(), getUserName(), getPassword());
        return formattedConnection;
    }

}
