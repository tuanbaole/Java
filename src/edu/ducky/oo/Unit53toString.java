/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ducky.oo;

/**
 *
 * @author IT
 */
public class Unit53toString {
    public static void main(String[] args) {
        Unit53toString str = new Unit53toString();
        System.out.println(str);
        System.out.println(str.toString());
        StringBuilder builder = new StringBuilder("ham StringBuilder");
        System.out.println(builder.toString());
    }
    
    @Override
    public String toString(){
        return "Day la ham override ghi de le ham toString";
    }
}
