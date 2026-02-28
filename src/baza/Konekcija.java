/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baza;
;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
import java.io.FileInputStream;


/**
 *
 * @author milos
 */
public class Konekcija {
    
    private static Konekcija instance;
    private Connection connection;
    private Konekcija(){
        System.out.println("Java trazi fajl na ovoj putanji: " + new java.io.File(".").getAbsolutePath());
    try {
        Properties properties = new Properties();
        FileInputStream fis;
            fis = new FileInputStream("DB_Properties.txt");
            properties.load(fis);
            String url = properties.getProperty("db.url");
            String user = properties.getProperty("db.user");
            String password = properties.getProperty("db.password");
            connection = DriverManager.getConnection(url,user,password);
            connection.setAutoCommit(false);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Konekcija.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | SQLException ex) {
            Logger.getLogger(Konekcija.class.getName()).log(Level.SEVERE, null, ex);
        }    
}
    public static Konekcija getInstance(){
        if(instance==null){
            instance = new Konekcija();
        }
        return instance;
    }

    public Connection getConnection() {
        
        return connection;
    }
    
    }
