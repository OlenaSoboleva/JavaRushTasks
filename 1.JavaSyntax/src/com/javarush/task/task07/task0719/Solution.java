package com.javarush.task.task07.task0719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Вывести числа в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;
        while (i < 10) {
            list.add(Integer.parseInt(reader.readLine()));
            i++;
        }

        for (int j = list.size()-1; j >=0; j--) {
                System.out.println(list.get(j));
        }
    }
}
