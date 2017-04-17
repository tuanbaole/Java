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
public class Unit37Enum1 {

    enum COLOR {
        RED, YELLOW, BLUE, GREEN
    };

    public static void main(String[] args) {
//        System.out.println(COLOR.YELLOW);
        COLOR c = COLOR.RED;
        System.out.println(c);
        if (COLOR.RED == c) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        switch (c.RED) {
            case RED:
                System.out.println("RED");
                break;
            case BLUE:
                System.out.println("BLUE");
                break;
            case YELLOW:
                System.out.println("YELLOW");
                break;
            case GREEN:
                System.out.println("GREEN");
                break;

        }
    }
}
