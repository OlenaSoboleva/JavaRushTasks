package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormatSymbols;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String month = reader.readLine();
        HashMap<Integer,String> mon = new HashMap<>();
        Date date = new Date();
        for(int i=0;i<12;i++){
            mon.put(i, new DateFormatSymbols().getMonths()[i]);
        }
        for (Map.Entry<Integer, String> s : mon.entrySet()) {
        if(s.getValue().equals(month)){
            System.out.println(month +" is "+ (s.getKey()+1)+" month");

        }
    }
}}
