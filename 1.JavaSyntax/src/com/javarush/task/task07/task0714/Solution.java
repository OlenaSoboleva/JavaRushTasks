package com.javarush.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Слова в обратном порядке
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
        strings.remove(2);

        for (int j=strings.size()-1;j>=0 ;j--) {
            System.out.println(strings.get(j));
        }
    }
}


