/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ducky.oo;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Unit48ArList {

    public static void main(String[] args) {
        ArrayList a1 = new ArrayList();
        a1.add(new String("StudyAndShare"));
        a1.add(new Long(333));
        a1.add(new Integer(5));
        System.out.println(a1.get(0));
        System.out.println(a1.get(1));
        System.out.println(a1.get(2));
        a1.remove(1);
        if (a1.contains(333)) {
            System.out.println("Account found");
        } else {
            System.out.println("Account not found");
        }
        
        Object[] array = a1.toArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
