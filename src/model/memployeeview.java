/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.*;
import javax.swing.*;

/**
 *
 * @author minul
 */
public class memployeeview {
    
    ResultSet rst;
    public ResultSet searchemployeedetails()
    {
        try{
       Statement st= mydbconnection.createdbconnection().createStatement();
       rst = st.executeQuery("select * from employee");
    
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return rst;
    }
}
