package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> array = new ArrayList<>();
        ArrayList<Integer> arrayNew = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            array.add(Integer.parseInt(reader.readLine()));
        }

        for (int i = 0; i < 10; i++) {
            int n = 1;
            for (int j = i + 1; j < 10; j++) {
                if (array.get(i) == array.get(j)) {
                    n++;
                    arrayNew.add(n);
                } else {
                    n = 1;
                    arrayNew.add(n);
                    break;
                }
            }
        }

        int max = 0;
        for (int i = 0; i < arrayNew.size(); i++
             )  {
            if (arrayNew.get(i) > max) {
                max = arrayNew.get(i);
            }
        }
        System.out.println(max);
    }
}