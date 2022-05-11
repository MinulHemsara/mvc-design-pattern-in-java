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
public class memployee 
{   public void saveemployee(String title,String first_name)
{
    try{
        Statement st = mydbconnection.createdbconnection().createStatement();
        int row_count = st.executeUpdate("insert into employee values('"+title+"','"+first_name+"')");
        if(row_count>0)
        {
            JOptionPane.showMessageDialog(null, "Record is submited");
        }
    }
        catch(SQLException e)
                {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                
                }
    

}
}
