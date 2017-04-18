/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ducky.oo;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author IT Br24
 */
public class Unit54Thread {

    public static void main(String[] args) {
        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    System.out.println("Pause");
                    Thread.sleep(3000);
                    System.out.println("Start");
                } catch (InterruptedException ex) {
                    Logger.getLogger(Unit54Thread.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        thread.start();
        MyThread thread2 = new MyThread();
        thread2.start();
    }
}

class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {

                System.out.println("Pasue");
                Thread.sleep(500);
                System.out.println("Start");

            } catch (Exception e) {
            }
        }
    }
}
