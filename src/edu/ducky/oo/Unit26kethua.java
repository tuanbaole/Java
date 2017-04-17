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
public class Unit26kethua {

    public static void main(String[] args) {
        ReferentDoc str = new ReferentDoc();
        str.doc();
        
    }
}

interface Referent {

    public void inter();
}

interface Doc extends Referent {

   // public final static String name = "interface vs interface is extentds";

    public void doc();
}

class Book {

    public void show() {
        System.out.println("Ke thua class voi class la extentds");
    }
}

class Doucment extends Book {

}

class ReferentBook implements Referent {

    @Override
    public void inter() {
        System.out.println("Ke thua class voi interface la implements");
    }

}

class ReferentDoc extends ReferentBook implements Referent, Doc {

    @Override
    public void doc() {
        System.out.println("Ke thua da luy thua");
    }

}
