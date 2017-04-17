/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ducky.basic;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class DateTime {

    public static void main(String[] args){
        long startMillis = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
        long endMillis = System.currentTimeMillis();
        System.out.println( "Millis : " + (endMillis - startMillis) );
        
        long startNano = System.nanoTime();
        long endNano = System.nanoTime();
        
        System.out.println( "Nano : " + (endNano - startNano) );
        
        // hien thi thoi gian cai cac packed
        DateFormat  dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        String day = dateFormat.format(date);
        System.out.println(day);
        
    }
}
