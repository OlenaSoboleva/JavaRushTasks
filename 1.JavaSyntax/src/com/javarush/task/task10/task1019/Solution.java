package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Integer> map = new HashMap<>();

        while (true) {
            String ids = reader.readLine();
            if (ids.isEmpty()) break;
            int id = Integer.parseInt(ids);
            String name = reader.readLine();
            map.put(name, id);
        }
        for (Map.Entry<String, Integer> entity : map.entrySet()
                ) {

            System.out.println(entity.getValue() + " " + entity.getKey());

        }
    }
}
