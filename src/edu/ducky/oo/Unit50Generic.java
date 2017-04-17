/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ducky.oo;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author IT
 */
public class Unit50Generic {

    public static void main(String[] args) {
        // ham Arraylist de lay su dung 1 class
        ArrayList<Unit50A> al = new ArrayList<Unit50A>();
        al.add(new Unit50A());
        for (int i = 0; i < al.size(); i++) {
            al.get(i).go();
            al.get(i).test();
        }

        HashMap<String, Unit50B> map = new HashMap<String, Unit50B>();
        map.put("Ducky",new Unit50B());
        map.put("Bao",new Unit50B());
    }
}

class Unit50A {

    public void go() {
        System.out.println("Public void go");
    }

    public void test() {
        System.out.println("Public void test");
    }
}

class Unit50B {

    public void show() {
        System.out.println("Public void show");
    }
}
