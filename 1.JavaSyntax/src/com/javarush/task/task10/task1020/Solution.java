package com.javarush.task.task10.task1020;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[30];
        for (int i = 0; i < 30; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

//        for (int i=0;i<array.length;i++ ) {
//            System.out.println(i+" "+array[i]);
//
//        }

        sort(array);
//        System.out.println();
//
//        for (int i=0;i<array.length;i++ ) {
//            System.out.println(i+" "+array[i]);
//
//        }

        System.out.println(array[9]);
        System.out.println(array[10]);
    }

    public static void sort(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i; j < array.length; j++) {

                if (array[j] < array[i]) {
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
    }
}
