/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ducky.oo;

/**
 *
 * @author Admin
 */
public class Unit43String {
    public String varStr = "Beautiful lan1 lan2 lan3";
    
    public static void main(String[] args) {
        Unit43String str = new Unit43String(); 
        System.out.println(str.varStr);
        String varStr = "Beautiful lan1 lan2 lan3";
        System.out.println(varStr.length());
        System.out.println(varStr.replace("lan","VietName"));
        System.out.println(varStr.replaceFirst("lan","VietName"));
        System.out.println(varStr.replaceAll("lan","VietName"));
        String ducky = "Ducky";
        // c1 
        if (ducky == "Ducky") {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        // c2
        if (ducky.equals("Ducky")) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        
    }
    
}
