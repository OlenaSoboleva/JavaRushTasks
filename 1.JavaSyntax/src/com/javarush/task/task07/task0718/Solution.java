package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;
        while (i < 10) {
            list.add(reader.readLine());
            i++;
        }

        for (int j = 1; j < list.size(); j++) {
            if(list.get(j).length()<list.get(j-1).length()){
                System.out.println(j);
                break;
            }
        }
    }
}

