package com.javarush.task.task08.task0811;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 
Квартет «Методы»
*/

public class Solution {
    public static List getListForGet() {
        ArrayList list = new ArrayList();

        for (int i = 0; i < 10000; i++) {
            list.get(i);
        }
        return list;
    }

    public static List getListForSet() {
        ArrayList list = new ArrayList();

        for (int i = 0; i < 10000; i++) {
            list.set(i,i);
        }
        return list;

    }

    public static List getListForAddOrInsert() {
        List list = new LinkedList();

        for (int i = 0; i < 10000; i++) {
            list.add(i);
        }
        return list;

    }

    public static List getListForRemove() {
        List list = new LinkedList();

        for (int i = 0; i < 10000; i++) {
            list.clear();
        }
        return list;

    }

    public static void main(String[] args) {

    }
}
