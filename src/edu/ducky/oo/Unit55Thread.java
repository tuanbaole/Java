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
public class Unit55Thread {
    public static void main(String[] args) {
        Thread55 thread55 = new Thread55();
        Thread thread = new Thread(thread55);
        Thread thread2 = new Thread(thread55);
        thread.setName("Name");
        thread2.setName("Ducky");
        thread.start();
        thread2.start();
    }
}

class Thread55 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(Thread.currentThread().getName() + " " + i);
                Thread.sleep(100);

            } catch (InterruptedException ex) {
                Logger.getLogger(Thread55.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

}
