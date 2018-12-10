package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<String>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;
        while (i < 5) {
            strings.add(reader.readLine());
            i++;
        }

        int min = strings.get(0).length();
        for (String string : strings) {
            if (string.length() < min) {
                min = string.length();
            }

        }

        for (String string : strings) {
            if (min == string.length()) {
                System.out.println(string);
            }
        }
    }
}
