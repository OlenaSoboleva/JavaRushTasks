package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        for (int i = 0; i < 10; i++) {
            map.put(i + " surname", i + 495);
        }
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        for (Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator(); it.hasNext(); ) {
            Map.Entry<String, Integer> entries = it.next();
            if (entries.getValue() < 500) {
                it.remove();
            }
        }
    }

    public static void main(String[] args) {
//        HashMap<String, Integer> copy = createMap();
//        removeItemFromMap(copy);
//        for (Map.Entry<String, Integer> pair : copy.entrySet()) {
//            String key = pair.getKey();                      //ключ
//            Integer value = pair.getValue();                  //значение
//            System.out.println(key + ":" + value);
//        }
    }
}