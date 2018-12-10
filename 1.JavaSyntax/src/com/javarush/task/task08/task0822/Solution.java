package com.javarush.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        int min=array.get(0) ;
        for (Integer number: array
             ) {
            if(min>number){
                min=number;
            }
        }
        return min;
    }

    public static List<Integer> getIntegerList() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        List<Integer> list = new ArrayList<>();
        int i = 0;
        while (i < n) {
            list.add(Integer.parseInt(reader.readLine()));
            i++;
        }

        return list;
    }
}
