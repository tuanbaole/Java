/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ducky.oo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author IT
 */
public class Unit52Iterator {

    public static void main(String[] args) {
//        Iterator iterator = new iterator();
        // Tao cac mang Integer, Double va Character
        Integer[] intArray = {1, 2, 3, 4, 5};
        int[][] doubleArray = {{50, 60}, {62, 65}, {72, 66}};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};

        System.out.println("Mang intArray bao gom:");
        System.out.println(Arrays.toString(intArray));

        System.out.println("\nMang doubleArray bao gom:");
        System.out.println(Arrays.toString(doubleArray)); // truyen mot mang Double

        System.out.println("\nMang charArray bao gom:");
        System.out.println(Arrays.toString(charArray)); // truyen mot mang Character

        ArrayList<Integer> str = new ArrayList<>();
        str.add(12);
        str.add(15);
        str.add(17);
        str.add(19);
        Iterator iterator = str.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
//        HashMap<Integer,String> map = new HashMap<>();
//        map.put(5,"value");
//        map.put(8,"value");
//        map.put(8,"value");
//        Iterator str = map.entrySet().iterator();
        
    }
}
