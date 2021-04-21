/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api;

import java.net.InetAddress;

/**
 *
 * @author asus
 */
public class getAllbyName {
    public static void main (String[] args) {  
        try {  
            InetAddress[] add =  InetAddress.getAllByName("https://siakad.epizy.com");   //iki link e sing endi
            System.out.println(add);  
                     
        }  
        catch (Exception e) {  
            System.out.println("Google not found");  
        }  
    }
}
