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
public class Unit33OverLoad {
    /* 
        *overload la 2 ham cung ten nhung co kieu bien tra ve khac nhau 
        * muc dinh la goi ten 1 ham tuy bien cho nhieu loai
    */
    
    public static void main(String[] args) {
        Unit33OverLoad str = new Unit33OverLoad();
        
        System.out.println(str.add(3,4));
        System.out.println(str.add(3.5f,4.8f));
    }

    public int add(int a, int b) {
        return a + b;
    }

    public float add(float a, float b) {
        return a + b;
    }
}
