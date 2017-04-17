/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ducky.oo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class Unit46WriteFile extends Exception {

    public static void main(String[] args) {
        File file = new File("Tutorial.txt");
        try {
            file.createNewFile();
            try (FileWriter fw = new FileWriter(file)) {
                try (BufferedWriter bw = new BufferedWriter(fw)) {
                    String data = "1.Day la app java ghi file dau tien cua toi \n";
                    bw.write(data);
                    bw.write(data);
                    bw.write(data);
                    bw.close();
                    fw.close();
                } catch (Exception e) {
                    System.out.println(e.toString());
                }

            } catch (Exception e) {
                System.out.println(e.toString());
            }
        } catch (IOException ex) {
            Logger.getLogger(Unit46WriteFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
