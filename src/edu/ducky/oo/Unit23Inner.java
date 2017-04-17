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
public class Unit23Inner {

    public static void main(String[] args) {
        Inner str = new Inner();
        str.println();
        
        C str2 = new C();
        str2.getInner();
        
        C str3 = new C();
        str2.getClassInner();
    }

}

class Inner {

    public void println() {
        Out result = new Out();
        result.out();
    }

    class Out {

        public void out() {
            System.out.println("Inner join class in java");
        }
    }

}

class C {

    public void getInner() {
        Inner varible = new Inner();
        varible.println();
    }
    
    public void getClassInner() {
        Inner.Out varible = new Inner().new Out();
        varible.out();
    }
}
