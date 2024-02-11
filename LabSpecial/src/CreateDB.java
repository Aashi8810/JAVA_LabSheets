
import java.sql.Connection; 
import java.sql.DatabaseMetaData; 
import java.sql.DriverManager; 
import java.sql.SQLException; 

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aashi
 */
public class CreateDB {
    public static void createNewDatabase(String fileName) throws 
ClassNotFoundException {   
    
        String url = "jdbc:sqlite:src/" + fileName;   
    
        try {   
            Class.forName("org.sqlite.JDBC"); 
            Connection conn = DriverManager.getConnection(url);   
            if (conn != null) {   
                DatabaseMetaData meta = conn.getMetaData();   
                System.out.println("The driver name is " + meta.getDriverName());   
                System.out.println("A new database has been created.");   
            }   
    
        } catch (SQLException e) {   
            System.out.println(e.getMessage());   
        }   
    }   
    public static void main(String[] args) throws ClassNotFoundException {   
        createNewDatabase("empmaster.db");   
    } 
       
}
