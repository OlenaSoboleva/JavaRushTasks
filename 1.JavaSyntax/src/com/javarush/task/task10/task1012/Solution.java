package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        String listString = "";

        for (String s : list) {
            listString += s;
        }


        LinkedHashMap<String, Integer> map = new LinkedHashMap();


        for (int i = 0; i < alphabet.size(); i++) {
            int n = 0;
            map.put(alphabet.get(i).toString(), 0);
            for (int j = 0; j < listString.length(); j++) {
                if (alphabet.get(i) == listString.charAt(j)) {
                    n++;
                    map.put(alphabet.get(i).toString(), n);
                }
            }
        }

        for (Map.Entry<String, Integer> entries : map.entrySet()
                ) {
            System.out.println(entries.getKey() + " " + entries.getValue());
        }
    }
}
