package com.javarush.task.task07.task0715;

import java.util.ArrayList;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<String>();
        String[] data = {"мама", "мыла", "раму"};
        String s = "именно";
        for (int i = 0; i < data.length; i++) {
            strings.add(data[i]);
            strings.add(s);
        }

        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }

    }


}
