package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/

import java.io.*;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[3];
        for(int i=0;i<3;i++){
            arr[i]=Integer.parseInt(reader.readLine());
        }
        Arrays.sort(arr);
        System.out.println(arr[1]);
    }
}
