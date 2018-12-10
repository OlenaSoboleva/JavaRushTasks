package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int x;
        Boolean isExit = false;
        while (!isExit) {
            String name = reader.readLine();
            if (name.equals("сумма")) {
                System.out.println(sum);
                break;
            }
            x = Integer.parseInt(name);
            sum = sum + x;
        }
    }
}
