package com.javarush.task.task07.task0710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
В начало списка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<String>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;
        while (i < 10) {
            strings.add(0, reader.readLine());
            i++;
        }

        for (String string : strings) {
            System.out.println(string);
        }

    }
}
