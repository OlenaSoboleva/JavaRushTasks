package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("v");
        list.add("n");
//        int i = 0;
//        while (i < 5) {
//            list.add(reader.readLine());
//            i++;
//        }

        System.out.println(list.size());

        for (int j = 0; j < list.size(); j++) {
            System.out.println(list.get(j));
        }

    }
}
