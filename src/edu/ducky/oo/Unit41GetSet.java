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
public class Unit41GetSet {

    public static void main(String[] args) {
        Unit41 varible = new Unit41();
        
        varible.setNumber(10);
        System.out.println(varible.getNumber());
        
        varible.setStr("day la bai tap ve set va get");
        System.out.println(varible.getStr());
        
        varible.setIsType(true);
        System.out.println(varible.getIsType());
    }
}

class Unit41 {

    private int number;
    private String str;
    private boolean isType;
    
    public int getNumber() {
        return number;
    }
    
    public String getStr() {
        return str;
    }
    
    public boolean getIsType() {
        return isType;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public void setIsType(boolean isType) {
        this.isType = isType;
    }
}
