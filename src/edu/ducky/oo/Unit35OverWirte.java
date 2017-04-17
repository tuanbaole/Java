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
public class Unit35OverWirte extends Tutirial{
     public static void main(String[] args) {
        Unit35OverWirte str = new Unit35OverWirte(); 
        str.add();
    }
     
    @Override
    public void add() {
         System.out.println("Khi ghi de thi tu khoa public >= class trong ham ghi de");
    }
}

class Tutirial {
    protected void add() {
         System.out.println("Over Wirte nghia la ghi de len 1 ham");
    }
}
