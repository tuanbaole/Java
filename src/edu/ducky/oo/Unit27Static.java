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
public class Unit27Static {
    /*
        ham nay noi ve static trong java
        static the hien trong class ma khong can goi den new StaticUnit(); 
    */
    public static void main(String[] args) {
        StaticUnit str = new StaticUnit();
        str.number = 10;
        System.out.println("hien thi number1:" + str.number);
        System.out.println("hien thi area1:" + StaticUnit.area);
        
        StaticUnit.area = 300;
        System.out.println("hien thi area1:" + StaticUnit.area);
        StaticUnit.show();

    }
}

class StaticUnit {

    static int area = 100; 
    int number;

    public static void show() {
        System.out.println("Su dung ham nay ma khong can goi new StaicUnit");
    }

}
