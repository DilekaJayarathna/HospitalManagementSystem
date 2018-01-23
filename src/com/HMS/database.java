/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.HMS;
import java.sql.*;
/**
 *
 * @author Dileka
 */
public class database {
    public static Statement getStatement(){
         try{
            Connection co=DriverManager.getConnection("jdbc:mysql://localhost:3306/HMSdata","root","");
            Statement stat=co.createStatement();
            return stat;
            
        }
        catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    public static Connection connect(){
        Connection con=null;
        try{
            Connection co=DriverManager.getConnection("jdbc:mysql://localhost:3306/HMSdata","root","");
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        return con;
    }
}
