package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<String, String>();

        for (int i = 0; i < 10; i++) {
            map.put(i + " surname",i +   " name");
//
//            map.put("Stallone1", "Stallone1");
//            map.put("Stallone2", "Stallone2");
//            map.put("Stallone3", "Stallone1");
//            map.put("Stallone4", "Stallone1");
        }
        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        Set<String> copy = new HashSet<String>();
        int count = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            for (Map.Entry<String, String> pair2 : map.entrySet()
                    ) {
                String name = pair.getValue();
                if (pair2.getValue().equals(name)) {
                    count++;
                }
            }
            if (count > 1) {
                copy.add(pair.getValue());
                count = 0;
            }
        }

//        for (Iterator<Map.Entry<String, String>> it = map.entrySet().iterator(); it.hasNext(); ) {
//            Map.Entry<String, String> pair = it.next();
            for (String items : copy
                    ) {
//                if (pair.getValue().equals(items)) {
//                    it.remove();
//                }

                removeItemFromMapByValue(map,items);
            }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
//        HashMap<String, String> copy = createMap();
//        removeTheFirstNameDuplicates(copy);
////        removeItemFromMapByValue(copy," name");
//        for (Map.Entry<String, String> pair : copy.entrySet()) {
//            String key = pair.getKey();                      //ключ
//            String value = pair.getValue();                  //значение
//            System.out.println(key + ":" + value);
//        }
    }
}
