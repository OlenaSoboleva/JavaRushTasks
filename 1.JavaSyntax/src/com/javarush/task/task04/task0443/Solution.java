package com.javarush.task.task04.task0443;


/* 
Как назвали, так назвали
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
//
//        String delimiters = "\\W";
//        String sAge = reader.readLine();
//        String nAge[]=sAge.split(delimiters);

        int y= Integer.parseInt(reader.readLine());
        int m= Integer.parseInt(reader.readLine());
        int d= Integer.parseInt(reader.readLine());
//        int[] age = new int[3];
//        for (int i = 0; i < 3; i++) {
//            age[i] = Integer.parseInt(nAge[i]);
//        }

        System.out.println("Меня зовут "+name+".");
//        System.out.println("Я родился "+age[2]+"."+age[1]+"."+age[0]);
        System.out.println("Я родился "+d+"."+m+"."+y);
    }
}
