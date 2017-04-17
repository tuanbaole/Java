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
public class Unit37Enum2 {

    enum COLOR {
        BLUE(3), RED(4);
        private int value;

        COLOR(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    };

    public static void main(String[] args) {
        COLOR c = COLOR.RED;
        System.out.println(c + " : " + c.getValue());
    }
}
