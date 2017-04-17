/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ducky.basic;

/**
 *
 * @author Admin
 */
public class Studen {
    public void showStuden(){
        System.out.println("day la thuoc tinh khong tra ve ket qua");
    }
    
    public int addNumber(int a,int b){
        int sum = a + b; 
        return sum;
    }
    
    public static void main(String[] args){
        Studen st = new Studen();
        st.showStuden();
        int result = st.addNumber(3, 4);
        System.out.println("day la cach su dung ham "+ result);
    }
    
}
