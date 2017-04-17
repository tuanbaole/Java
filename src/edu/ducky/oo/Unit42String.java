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
public class Unit42String {

    public static void main(String[] args) {
        String str = "StudyAndShare";
        System.out.println(str.charAt(6));
        System.out.println(str.indexOf("Share"));
        System.out.println(str.substring(5));
        System.out.println(str.substring(5, 10));
        System.out.println(str);
        System.out.println("--------------");
        String log = "TuanBao job programmer         ";
        System.out.println(log);
        System.out.println(log.trim());
        System.out.println(log.toLowerCase());
        System.out.println(log.toUpperCase());
        
        String[] ar = log.trim().split(" ");
        for (String ar1 : ar) {
            System.out.println(ar1);
        }
    }
}

class Unit42 {

}
