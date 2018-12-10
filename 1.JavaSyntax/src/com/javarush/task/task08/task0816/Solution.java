package com.javarush.task.task08.task0816;

import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone1", new Date("JUNE 1 1980"));
        map.put("Stallone2", new Date("JULY 1 1980"));
        map.put("Stallone3", new Date("AUGUST 1 1980"));
        map.put("Stallone4", new Date("SEPTEMBER 1 1980"));
        map.put("Stallone5", new Date("OCTOBER 1 1980"));
        map.put("Stallone6", new Date("NOVEMBER 1 1980"));
        map.put("Stallone7", new Date("DECEMBER 1 1980"));
        map.put("Stallone8", new Date("JANUARY 1 1980"));
        map.put("Stallone9", new Date("FEBRUARY 1 1980"));
        map.put("Stallone10", new Date("MARCH 1 1980"));
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        HashSet<Integer> seasonSummer = new HashSet<>();
        seasonSummer.add(6);
        seasonSummer.add(7);
        seasonSummer.add(8);

        for (Iterator<Map.Entry<String, Date>> it = map.entrySet().iterator(); it.hasNext(); ) {
            Map.Entry<String, Date> entries = it.next();
            for (Integer n : seasonSummer) {
                if (n == entries.getValue().getMonth() + 1) {
                    it.remove();
                }
            }
        }
    }

    public static void main(String[] args) {

    }
}
