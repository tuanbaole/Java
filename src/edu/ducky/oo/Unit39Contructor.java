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
public class Unit39Contructor {

    public static void main(String[] args) {
        Box str1 = new Box();
        System.out.println(str1.getInt());
        System.out.println(str1.getString());
        Box str2 = new Box(20,"RED");
        System.out.println(str2.getInt());
        System.out.println(str2.getString());
    }
}

class Box {

    private int number;

    private String str;

    public Box() {
        number = 100;
        str = "hello world";
    }

    public Box(int number,String str) {
        this.number = number;
        this.str = str;
    }

    public int getInt() {
        return number;
    }

    public String getString() {
        return str;
    }

}
