/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shree.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author shree
 */
public class Register {
    public static boolean addUser(String firstName, String lastName,
            String userName, String emailAdd, String password) {
        
        String first = firstName;
        String last = lastName;
        String user = userName;
        String email = emailAdd;
        String pass = password;
        
        Connection con = null;
        PreparedStatement preStmt = null;
        
        
        try {
            con = DBConnection.createConnection();
            Statement stmt = con.createStatement();
            stmt.executeUpdate("CREATE DATABASE IF NOT EXISTS profilebook;");
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS profilebook.userinfo ("
                            + "user_id INT NOT NULL AUTO_INCREMENT,"
                            + "first_name VARCHAR(30) NOT NULL,"
                            + "last_name VARCHAR(30) NOT NULL,"
                            + "username VARCHAR(30) NOT NULL,"
                            + "email VARCHAR(30) NOT NULL,"
                            + "password VARCHAR(30) NOT NULL,"
                            + "PRIMARY KEY(user_id) );");
            
            preStmt = con.prepareStatement("insert into profilebook.userinfo values (default, ?, ?, ?, ?, ?)");
            
            preStmt.setString(1, first);
            preStmt.setString(2, last);
            preStmt.setString(3, user);
            preStmt.setString(4, email);
            preStmt.setString(5, pass);
            preStmt.executeUpdate();
            
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        
        return Boolean.FALSE;
    }
}
