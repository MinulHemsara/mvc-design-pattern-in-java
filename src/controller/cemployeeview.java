
package controller;

import model.*;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author minul
 */
public class cemployeeview {
    ResultSet rst;
    public ResultSet getemployeedetails() 
    {
        memployeeview mev = new memployeeview();
        rst = mev.searchemployeedetails();
        return rst;
    }
}
