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
public class Unit34OverLoad2 extends Tutorial {

    /* 
        *overload la 2 ham cung ten nhung co kieu bien tra ve khac nhau 
        * muc dinh la goi ten 1 ham tuy bien cho nhieu loai
     */
    public static void main(String[] args) {
        Unit34OverLoad2 str = new Unit34OverLoad2();

        System.out.println(str.add(3, 4));
        System.out.println(str.add(3.5f, 4.8f));
        System.out.println(str.add("le tuan ", "bao"));
        // c1 new Tutorial();
        // Tutorial overLoad = new Tutorial();
        // System.out.println(overLoad.add("le tuan", "bao"));
    }

    public int add(int a, int b) {
        return a + b;
    }

    public float add(float a, float b) {
        return a + b;
    }
}

class Tutorial {

    public String add(String a, String b) {
        return a + b;
    }
}
