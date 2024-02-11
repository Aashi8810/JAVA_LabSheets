/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aashi
 */
import java.sql.Connection; 
import java.sql.PreparedStatement; 
import java.sql.ResultSet; 
import java.sql.SQLException; 
import java.sql.Statement; 
 
public class DBTest { 
        public static void insert(String index, String name, String subject_1, String subject_2, String subject_3, float GPA) {   
        String sql = "INSERT INTO students(index_No, name, subject_1, subject_2, subject_3, GPA) VALUES(?,?,?,?,?,?)";   
    
        try{   
            Connection conn = Connect.getConnection();   
            PreparedStatement pstmt = conn.prepareStatement(sql);   
            pstmt.setString(1, index);   
            pstmt.setString(2, name);
            pstmt.setString(3, subject_1);
            pstmt.setString(4, subject_2);
            pstmt.setString(5, subject_3);
            pstmt.setFloat(6, GPA);
            pstmt.executeUpdate();   
        } catch (SQLException e) {   
            System.out.println(e.getMessage());   
        }   
    }   
    
    public static void main(String[] args) {   
         
         
        //Retrieve Data 
        String sql = "SELECT * FROM students";   
           
        try {   
            Connection conn = Connect.getConnection();   
            Statement stmt  = conn.createStatement();   
            ResultSet rs    = stmt.executeQuery(sql);   
               
            // loop through the result set   
            while (rs.next()) {   
                System.out.println(rs.getInt("id") +  "\t" +    
                                   rs.getString("name") + "\t" +   
                                   rs.getString("nic"));   
            }   
        } catch (SQLException e) {   
            System.out.println(e.getMessage());   
        }   
    }   
} 
