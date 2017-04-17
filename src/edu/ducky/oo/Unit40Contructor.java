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
public class Unit40Contructor {

    public static void main(String[] args) {
        UnitB str1 = new UnitB();

        UnitD str2 = new UnitD(10);
    }
}

/*
    * ham contruction khi khoi tao thi tinh thua ke 
      cua 1 ham con cung phai khoi tao 1 ham nhu vay 
 */
// cach 1 : dung ham contruction khi duoc thua ke
class UnitA {

    public UnitA(int number) {
        System.out.println(number);
    }
}

class UnitB extends UnitA {

    public UnitB() {
        super(3);
    }
}

/* cach2 */
class UnitC {

    public UnitC() {
        System.out.println("Day la ham contruction mac dinh");
    }

    public UnitC(int number) {
        System.out.println(number);
    }
}

class UnitD extends UnitC {

    public UnitD(int number) {
        super(number);
    }
}
