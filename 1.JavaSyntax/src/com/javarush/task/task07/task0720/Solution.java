package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());
        int i = 0;
        while (i < n) {
            list.add(reader.readLine());
            i++;
        }
        int j = 0;
        while (j < m) {
            list.add(list.get(j));
            j++;
        }

        for (int l = 0; l < m; l++) {
            if (list.size() > n)
                list.remove(0);
        }

        for (int k = 0; k < list.size(); k++) {
            System.out.println(list.get(k));
        }
    }
}
