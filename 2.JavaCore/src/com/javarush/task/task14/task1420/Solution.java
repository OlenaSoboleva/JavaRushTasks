package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            int a = Integer.parseInt(reader.readLine());
            int b = Integer.parseInt(reader.readLine());

            Nod(a, b);

        } catch (Exception e) {
            System.out.println( e);
        }


    }

    public static void Nod(int a, int b) {
        while (!(a == 0 || b == 0)) {
            try {
                if (a > b) {
                    a = a % b;
                } else b = b % a;
            } catch (Exception e) {
            }

        }
        System.out.println(a + b);
    }
}
