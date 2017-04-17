/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ducky.oo;

import java.io.File;
import java.io.IOException;

public class Unit31TryCatch {

    public static void main(String[] args) throws IOException {
        try {
            Thread.sleep(1000); // handle the exception...
            File file = new File("D://test.txt");
            file.createNewFile();
        } catch (InterruptedException | NoClassDefFoundError e) {
            System.out.println(e.toString());
            System.out.println("InterruptedException");
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        System.out.println("ket thuc try catch o day");

    }
}
