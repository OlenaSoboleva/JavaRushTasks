package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.ArrayList;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String file = bf.readLine();
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        String data;
        ArrayList<String> list = new ArrayList<>();

        while (!(data = bf.readLine()).equals("exit")) {
            list.add(data);
        }

        list.add(data);

        for (String s : list) {
            bw.write(String.format("%s%n", s));
        }

        bw.close();
        bf.close();
    }
}
