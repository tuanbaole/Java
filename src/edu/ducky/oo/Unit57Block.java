/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ducky.oo;

/**
 *
 * @author IT Br24
 */
public class Unit57Block {

    {
        System.out.println("Block code 1");
    }

    static {
        System.out.println("Static block code 1");
    }
    
    public Unit57Block(){
        System.out.println("contructor");
    }
    
    public static void main(String[] args) {
        Unit57Block block = new Unit57Block(); 
        /*
            * khi khong khoi tao ham Unit57Block thi chi co cac static moi thuc hien lenh
            * thu tu thuc hien lenh la static > {} > contructor
        */
        
        System.out.println("day la ham public static void main");
    }

    {
        System.out.println("Block code 2");
    }
    
    static {
        System.out.println("Static block code 2");
    }
    
}
