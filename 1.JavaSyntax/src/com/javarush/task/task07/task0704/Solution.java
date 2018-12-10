package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] mas = new int[10];
        for(int i=0;i<10;i++){
            mas[i] = Integer.parseInt(reader.readLine());
        }
        int temp;
        for(int j=0;j<mas.length/2;j++){

            temp=mas[mas.length-j-1];
            mas[mas.length-j-1]=mas[j];
            mas[j]=temp;
        }

        for(int k=0;k<10;k++) {
            System.out.println(mas[k]);
        }
    }
}

