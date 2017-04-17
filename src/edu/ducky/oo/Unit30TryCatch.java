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
public class Unit30TryCatch {

    public static void main(String[] args) {
        String str = "JavaAndShare";
        try {
            // Error StringIndexOutOfBoundsException
            // System.out.println(str.substring(50));
            int a = 5;
            int b = 0;
            int c = a / b;
            System.out.println(c);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e.toString());
            System.out.println("StringIndexOutOfBoundsException");
        } catch (ArithmeticException e) {
            System.out.println(e.toString());
            System.out.println("ArithmeticException");
        } catch (Exception e) {
            System.out.println(e.toString());
        } finally {
            System.out.println("Lenh nay van thuc hien du dieu gi co xay rax");
        }
    }
}
