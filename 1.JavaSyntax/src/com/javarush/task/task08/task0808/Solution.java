package com.javarush.task.task08.task0808;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* 
10 тысяч удалений и вставок
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // ArrayList
        ArrayList arrayList = new ArrayList();
        insert10000(arrayList);
        get10000(arrayList);
        set10000(arrayList);
        remove10000(arrayList);

        // LinkedList
        LinkedList linkedList = new LinkedList();
        insert10000(linkedList);
        get10000(linkedList);
        set10000(linkedList);
        remove10000(linkedList);
    }

    public static void insert10000(List list) {
        Date beginTime = new Date();

        for (int i = 0; i < 10000; i++) {
            list.add( i );
        }
        Date endTime = new Date();
        long msDelay = endTime.getTime() - beginTime.getTime();
        System.out.println(msDelay);

    }

    public static void get10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.get(i);
        }

    }

    public static void set10000(List list) {
//        Date beginTime = new Date();
        for (int i = 0; i < 10000; i++) {
            list.set( i,i);
        }
//        Date endTime = new Date();
//        long msDelay = endTime.getTime() - beginTime.getTime();
//        System.out.println(msDelay);

    }

    public static void remove10000(List list) {
        for (int i = 0; i < list.size(); i++) {

            list.clear();
        }

    }
}
