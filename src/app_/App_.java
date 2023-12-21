/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author moham
 */
public class App_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        
        Date date = new Date();
        System.out.println(dateFormat.format(date));
    }
    
}
