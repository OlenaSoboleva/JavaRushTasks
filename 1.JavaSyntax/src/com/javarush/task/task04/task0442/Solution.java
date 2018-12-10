package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        boolean isExit = false;
        while (!isExit) {
            int x = Integer.parseInt(reader.readLine());
            if (x == -1) {
                isExit=true;
            }
            sum=sum+x;
        }
        System.out.println(sum);
    }
}
