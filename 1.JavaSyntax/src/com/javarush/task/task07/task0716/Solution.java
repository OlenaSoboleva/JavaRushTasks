package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) throws Exception {
//        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();

        list.add("роза"); //0
        list.add("лоза"); //1
        list.add("лира"); //2

        list = fix(list);

        list.forEach(System.out::println);
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        ArrayList<String> listNew = new ArrayList<String>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).contains("л") && !list.get(i).contains("р")) {
                listNew.add(list.get(i));
                listNew.add(list.get(i));

            } else if (list.get(i).contains("р") && !list.get(i).contains("л")) {
                continue;
            } else {
                listNew.add(list.get(i));
            }
        }

        return listNew;
    }
}