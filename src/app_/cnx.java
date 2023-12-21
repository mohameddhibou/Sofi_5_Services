/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_;

import java.sql.*;

/**
 *
 * @author moham
 */
public class cnx {
    public static Connection connect(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/sofi5services","root","");
            return c;
        }catch(Exception ex){ex.printStackTrace();}
        return null;
    }
}
