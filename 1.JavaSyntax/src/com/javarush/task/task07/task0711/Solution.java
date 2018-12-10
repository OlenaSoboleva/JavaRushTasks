package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удалить и вставить
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

        int j = 0;
        while (j < 13) {
            strings.add(0,strings.get(strings.size()-1));
            strings.remove(strings.size()-1);
            j++;
        }

        for (String string : strings) {
            System.out.println(string);
        }
    }
}
