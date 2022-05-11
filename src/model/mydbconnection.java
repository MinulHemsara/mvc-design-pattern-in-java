/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author minul
 */
public class mydbconnection 
{
    public  static Connection con;
    
    public static Connection createdbconnection()
    {   
        try
        {
        String  dbpath   = "jdbc:mysql://localhost/company";
        con = DriverManager.getConnection(dbpath,"root","");
        }
    
    catch(SQLException e)
    {
        JOptionPane.showMessageDialog(null, e.getMessage());
    }
        return con;
    }
}
