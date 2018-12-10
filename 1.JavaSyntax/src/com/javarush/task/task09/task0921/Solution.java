package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> mas = new ArrayList<>();
        Boolean exit=false;
        while (!exit) {
            try {
                mas.add(Integer.parseInt(reader.readLine()));
            } catch (NumberFormatException e) {

                for (Integer i : mas
                        ) {
                    System.out.println(i);
                }
                exit=true;

            } catch (IOException e) {

            }

        }

    }
}
