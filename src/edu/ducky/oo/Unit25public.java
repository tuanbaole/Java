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
public class Unit25public {

    public static void main(String[] args) {
        Boss varible = new Boss();

        varible.address();

        varible.age();

        varible.name();
    }
}

class Boss {

    public String name = "Letuanbao";
    /* public la xu dung duoc o moi noi khi tro vao class Boss*/

    protected int age = 18;
    /*protected la co the goi den moi noi trong package va cac extension con mo rong*/

    String address = "HaNoi";
    /* Default chi su dung duy nhat trong package va khong co extension implements*/

    private String job = "Programmer";

    /* private chi su dung trong class Boss */
    public void name() {
        System.out.println(name);
    }

    protected void age() {
        System.out.println(age);
    }

    void address() {
        System.out.println(address);
    }

    private void job() {
        System.out.println(job);
    }

}
