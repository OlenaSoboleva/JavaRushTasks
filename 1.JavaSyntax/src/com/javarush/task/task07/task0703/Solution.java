package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[10];
        int[] mas = new int[10];
        for(int i=0;i<10;i++){
            array[i] = reader.readLine();
            mas[i]=array[i].length();
        }

        for (int y=0;y<10;y++){
            System.out.println(mas[y]);
        }
    }
}
