/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ducky.basic;

/**
 *
 * @author Admin
 */
public class Demo {

    private String age;
    private int number;

    final private String MY_FINAL = "VIETNAM";

    public Demo() {
        //do something
//        System.out.println("day la ham contruction");
    }

    public void index() {
        Demo show = new Demo();
        String MY_FINAL = "HELLO";
        System.out.println(MY_FINAL);
    }

    public void show() {
        Demo show = new Demo();
    }

    public static void main(String[] args) {
        Demo show = new Demo();
        show.index();
        show.show();
        System.out.println(show.number);
//        System.out.println(this.age);
        System.out.println(show.MY_FINAL);
    }
}
