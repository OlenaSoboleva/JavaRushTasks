package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String[] splited = s.split("\\s+");

        for (String el : splited
                ) {
            if (el.length() != 0) {
                System.out.print(el.substring(0, 1).toUpperCase(Locale.getDefault()) + el.substring(1) + " ");
            }
        }
    }
}
