/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ducky.oo;

import java.util.Vector;

/**
 *
 * @author IT
 */
public class Unit51Generic {
    public static void main(String[] args) {
        Vector<Unit51A> vector = new Vector<Unit51A>();
        vector.add(new Unit51A());
        vector.add(new Unit51A());
        vector.add(new Unit51B());
        
        Vector<Unit51B> vector1 = new Vector<Unit51B>();
        vector1.add(new Unit51B());
        vector1.add(new Unit51B());
    }
}

class Unit51A {

}

class Unit51B extends Unit51A {

}