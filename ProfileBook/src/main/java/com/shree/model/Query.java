/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shree.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author shree
 */
public class Query {
    public static String executeQuery(String queryid) {
        
        String id = queryid;
        
        Connection con = null;
        Statement stmt = null;
        ResultSet resultSet = null;
        
        String firstNameDB = "";
        String lastNameDB = "";
        String result = "";
        
        try {
            con = DBConnection.createConnection();
            stmt = con.createStatement();
            resultSet = stmt.executeQuery("select first_name,last_name from userinfo where user_id='" + id +"';");
            
            while (resultSet.next()) {                 
                firstNameDB = resultSet.getString("first_name");
                lastNameDB = resultSet.getString("last_name");
                
                result += firstNameDB + " " + lastNameDB + " ";
            }
            
            if ((result.trim().length() == 0)){
                return "user Not Found";
            }
            else{
                return result;
            }
            
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        
        return "user Not Found";
    }
    
}
