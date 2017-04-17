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
public class Unit22 {
    
    public static void main(String[] agrs) {
       
        A strA1 = new A();
        strA1.addName("letuanbao");
        System.out.println(strA1.getName());
        
        A strA2 = new A();
        strA2.addName("ducky");
        System.out.println(strA2.getName());
        
        B strb = new B();
        
    }
    
}

class A {
    private String name; // khai bao 1 bien
    
    public void addName(String name) {
        this.name = name; // this.name la chi private String name
    }
    
    public String getName() {
        return name;
    }
    
}

class B {

}