package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        String end = "end";

        while (true) {
            String s = reader.readLine();
            if (s.equals(end)) {
                break;
            }
            list.add(s);
        }
        for (int k = 0; k < list.size(); k++) {
            System.out.println(list.get(k));
        }
    }
}