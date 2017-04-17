/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ducky.oo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class Unit47Read {

    public static void main(String[] args) {
        File file = new File("Tutorial.txt");
        try (FileReader fr = new FileReader(file)) {
            try (BufferedReader br = new BufferedReader(fr)) {
                String line = "";
                int i = 1;
                while ((line = br.readLine()) != null) {
                    System.out.println(i+" : "+line);i++;
                }
                br.close();
            }
            fr.close();
        } catch (IOException ex) {
            Logger.getLogger(Unit47Read.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
