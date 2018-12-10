package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings = new ArrayList<>();


    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;
        while (i < 5) {
            strings.add(reader.readLine());
            i++;
        }

        int max = strings.get(0).length();
        for (String string : strings) {
            if (string.length() > max) {
                max = string.length();
            }

        }

        for (String string : strings) {
            if (max == string.length()) {
                System.out.println(string);
            }
        }

    }
}
