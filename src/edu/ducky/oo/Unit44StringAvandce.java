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
public class Unit44StringAvandce {

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();

        builder.append("StudyAndShare2011");
        System.out.println(builder);

        builder.deleteCharAt(13);
        System.out.println(builder);

        builder.delete(13, 16);
        System.out.println(builder);

        builder.insert(5, "2011");
        System.out.println(builder);

        builder.insert(5, "2011");
        System.out.println(builder);

        builder.reverse();
        System.out.println(builder);

    }
}
