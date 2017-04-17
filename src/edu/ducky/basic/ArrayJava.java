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
public class ArrayJava {
    public static void main(String[] agrs) {
        int [] arrayInt1 = new int[5];
        int [] arrayInt2 = {2,3,4,5,6,7,8};
        int [][] arrayInt4 = {{10,20},{12,13},{03,04}};
        
        for (int i = 0; i < arrayInt4.length; i++) {
            for (int j = 0; j < arrayInt4[i].length; j++) {
                System.out.println(arrayInt4[i][j]);
            }
        }
        
        
    }
}
