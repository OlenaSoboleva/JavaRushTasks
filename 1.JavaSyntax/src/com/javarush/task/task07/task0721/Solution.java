package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = 20;
        int[] list = new int[20];
        int maximum;
        int minimum;

        for (int i = 0; i < n; i++) {
            list[i] = Integer.parseInt(reader.readLine());
        }
        maximum = list[0];
        minimum = list[0];
        for (int i = 0; i < list.length; i++)
            if (list[i] > maximum) {
                maximum = list[i];
            } else if (list[i] < minimum) {
                minimum = list[i];
            }


        System.out.println(maximum + " " + minimum);
//        System.out.println(minimum);
    }
}
