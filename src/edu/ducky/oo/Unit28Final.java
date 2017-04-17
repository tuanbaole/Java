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
public class Unit28Final extends test {
    final float pi = 3.14f; // final dung de dinh nghia 1 cai gi do khong the thay doi
    float r = 6.28f;
    public static void main(String[] args) {
        Unit28Final str = new Unit28Final();
        str.r = 88.66f;
        // Error vi pi la 1 hang so
        // str.pi = 315f;
        System.out.println(str.pi);
        str.show();
    }

}

class test {
    final void show() {
        System.out.println("khong thang nao duoc sua ham nay cua tao");
    }
}
