package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;


public class Solution {
    public static void main(String[] args) throws Exception {
        Reader reader = new BufferedReader(new InputStreamReader((System.in)));


        Scanner sc = new Scanner(System.in);


   //     int intNum = sc.nextInt();

        double sum = 0;
        double count = 0;
        double res = 0;
        boolean isExit = false;
        while (!isExit) {
            int x = Integer.parseInt(sc.nextLine());
            if (x == -1) {
                break;
            }
            count++;
            sum = sum + x;
        }
        System.out.println(sum / count);
    }
}

