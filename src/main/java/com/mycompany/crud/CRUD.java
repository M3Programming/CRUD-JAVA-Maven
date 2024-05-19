/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.crud;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author MJ
 */
public class CRUD {
    
    public static Connection connectdb(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            //String url is the MySQL Database URL
            String url="jdbc:mysql://localhost:3306/student?zeroDateTimeBehavior=CONVERT_TO_NULL";
            String username = "root";//username in MYSQL Connection
            String password = "1234";//password in MySQL Connection
            //register the connection
            Connection conn = DriverManager.getConnection(url,username,password);
            return conn;
            
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    return null;    
    }

    public static void main(String[] args) {
        
    }
}
