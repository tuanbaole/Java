/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ducky.oo;
import java.io.IOException;
import java.io.PrintStream;
/**
 *
 * @author Admin
 */
public class Unit36OverRide extends Tutorial36 {

    public static void main(String[] args) {
        Unit36OverRide str = new Unit36OverRide();
        int b = str.add(10);
        System.out.println(b);
    }

    @Override
    public int add(int a) {
        return a + 7;
    }
    
    @Override
     public Unit36OverRide created() {
        return new Unit36OverRide();
    }
}

class Tutorial36 {

    public int add(int a) {
        return a + 5;
    }

    public Tutorial36 created() throws IOException{
        return new Tutorial36();
    }

}
