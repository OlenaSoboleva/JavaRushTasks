package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Date date = new Date();
        SimpleDateFormat readerDateFormat = new SimpleDateFormat("MM/dd/yyyy");
        SimpleDateFormat newDateFormat = new SimpleDateFormat("MMM dd, yyyy");
        date = readerDateFormat.parse(reader.readLine());

        System.out.println( newDateFormat.format(date).toUpperCase());


    }
}
