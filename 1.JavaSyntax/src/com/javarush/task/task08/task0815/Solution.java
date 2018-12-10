package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<String, String>();

        for (int i = 0; i < 10; i++) {
            map.put(i + " surname", i + " name");
        }
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int count = 0;
        for (Map.Entry<String, String> entries : map.entrySet()
                ) {
            if (entries.getValue().contains(name)) {
                count++;
            }
        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int count = 0;
        for (Map.Entry<String, String> entries : map.entrySet()
                ) {
            if (entries.getKey().contains(lastName)) {
                count =1;
                break;
            }
            else count= 0;
        }
        return count;
    }

    public static void main(String[] args) {
//        System.out.println( getCountTheSameLastName(createMap(),"1 surname"));
    }
}
