/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ducky.oo;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class Unit45FileFordel {

    public static void main(String[] args) {
        File file = new File("taoFile.txt");
        try {
            file.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(Unit45FileFordel.class.getName()).log(Level.SEVERE, null, ex);
        }

        File theDir = new File("Tao Fordel");

        // if the directory does not exist, create it
        if (!theDir.exists()) {
            System.out.println("creating directory: " + theDir.getName());
            boolean result = false;
            try {
                theDir.mkdir();
                result = true;
            } catch (SecurityException se) {
                //handle it
            }
            if (result) {
                System.out.println("DIR created");
            }
        }
    }
}
