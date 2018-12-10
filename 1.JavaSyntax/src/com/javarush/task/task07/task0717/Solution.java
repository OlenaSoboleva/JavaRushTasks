package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // Считать строки с консоли и объявить ArrayList list тут
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;
        while (i < 10) {
            list.add(reader.readLine());
            i++;
        }

        ArrayList<String> result = doubleValues(list);

        for (int j = 0; j < result.size(); j++) {
            System.out.println(result.get(j));
        }

    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        ArrayList<String> listNew = new ArrayList<String>();
        for (int j = 0; j < list.size(); j++) {
            listNew.add(list.get(j));
            listNew.add(list.get(j));
        }
        return listNew;
    }
}
