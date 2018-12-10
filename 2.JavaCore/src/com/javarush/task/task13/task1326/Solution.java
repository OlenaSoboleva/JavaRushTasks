package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/


import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        InputStream inStream = new FileInputStream(bf.readLine());
        BufferedReader reader = new BufferedReader(new InputStreamReader(inStream));
        ArrayList<Integer> list = new ArrayList<>();
        String line;
        while ((line = reader.readLine()) != null) {
            if (Integer.parseInt(line) % 2 == 0) {
                list.add(Integer.parseInt(line));
            }
        }
        inStream.close();
        bf.close();

        int temp;
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i; j < list.size(); j++) {
                if (list.get(j) < list.get(i)) {
                    temp = list.get(j);
                    list.set(j,  list.get(i));
                    list.set(i, temp);
                }
            }
        }

        for (Integer s : list) {
            System.out.println(s);
        }
    }
}
