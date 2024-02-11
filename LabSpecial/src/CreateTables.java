/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException; 
import java.sql.Statement; 
/**
 *
 * @author aashi
 */
public class CreateTables {
    public static void createNewTable() {   
         
           
        // SQL statement for creating a new table   
        String sql = "CREATE TABLE IF NOT EXISTS students (\n"   
                + " index_No text PRIMARY KEY NOT NULL,\n"
                + " name text,\n"   
                + " subject_1 text,\n"
                +"subject_2 text,\n"
                +"subject_3 text,\n"
                +"GPA float\n"
                + ");";   
           
        try{   
            Connection conn = Connect.getConnection(); 
            Statement stmt = conn.createStatement();   
            stmt.execute(sql);   
        } catch (SQLException e) {   
            System.out.println(e.getMessage());   
        }   
    }   
    
    /**  
     * @param args the command line arguments  
     */   
    public static void main(String[] args) {   
        createNewTable();   
    }  
}
