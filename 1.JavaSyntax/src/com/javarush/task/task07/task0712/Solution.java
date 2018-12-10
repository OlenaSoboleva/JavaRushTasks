package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;
        while (i < 10) {
            strings.add(reader.readLine());
            i++;
        }

        int min = strings.get(0).length();
        int max = strings.get(0).length();
        for (String string : strings) {
                if (string.length() < min) {
                    min = string.length();
                }
            if (string.length() > max){
                max = string.length();
            }
        }
        for (String string : strings) {
            if (string.length() == max ||string.length() == min) {
                System.out.println(string);
                break;
            }

        }

    }
}
