/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ducky.oo;

import java.util.HashMap;

/**
 *
 * @author IT
 */
public class Unit49Map {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("name", "bao");
        map.put("blog", "StudyAndShare");
        map.put(5, "VietName");
        System.out.println(map.get("name"));
        System.out.println(map.get("blog"));
        System.out.println(map.get(5));
        map.remove("name");
        System.out.println(map.get("name"));
        map.clear();
        System.out.println(map.get("name"));
    }
}
