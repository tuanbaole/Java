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
public class Unit32Throw {

    public static void main(String[] args) throws MyException {
        System.out.println("sadsad");
        doSomething str = new doSomething();
        try {
            str.show();
        } catch (MyException e) {
            System.out.println(e.toString());
        }
    }
}

class MyException extends Exception {

    public MyException(String message) {
        System.out.println(message);
    }
    // doan nay la ngoai le m them vao ham
}

class doSomething {

    public void show() throws MyException {
        int number = 10;
        if (number > 9) {
            throw new MyException("a day roi");
        }
    }
}
