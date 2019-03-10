/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shree.model;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

/**
 *
 * @author shree
 */
public class Login {
    
    private boolean userValidated = Boolean.FALSE;
    
    public void setUserValidation(boolean value) {
        this.userValidated = value;
    }
    
    public boolean getUserValidation() {
        return userValidated;
    }
    
    public boolean validateUser(String userName, String password) {
        
        String user = userName;
        String pass = password;
        
        Connection con = null;
        Statement stmt = null;
        ResultSet resultSet = null;

        try {
            con = DBConnection.createConnection();
            stmt = con.createStatement();
            resultSet = stmt.executeQuery("select * from profilebook.userinfo where username='" + userName +
                                          "' and password='" + password +"';");
            
            if(resultSet.next()) {                
                return Boolean.TRUE;
            }
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        
        return Boolean.FALSE;
    }
    
}
