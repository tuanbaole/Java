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
public class Unit24Interface {

    public static void main(String[] args) {
        Manger str = new Manger();
        str.show();
    }
}

interface Human {

    public final static String Person = "Chung toi yeu viet nam";
    String People = "viet nam trong toi";

    public abstract void show();

    void add();

}

class Manger implements Human {

    @Override
    public void show() {
        System.out.println("NOI DUNG :" + Person);
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
