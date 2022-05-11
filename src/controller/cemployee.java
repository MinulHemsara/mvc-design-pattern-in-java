/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.*;

/**
 *
 * @author minul
 */
public class cemployee 
{
    public void  getemployee(String title,String first_name)
    {
        memployee me = new memployee();
        me.saveemployee(title, first_name); //connect with model
    
    }
}
