package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> strings = new ArrayList<Integer>();
        ArrayList<Integer> thre = new ArrayList<Integer>();
        ArrayList<Integer> two = new ArrayList<Integer>();
        ArrayList<Integer> other = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;
        while (i < 20) {
            strings.add(Integer.parseInt(reader.readLine()));
            i++;
        }

        for (int j=0; j<strings.size();j++) {
            if (strings.get(j)%2==0) {
                two.add(strings.get(j));
            }
            if (strings.get(j)%3==0) {
                thre.add(strings.get(j));
            }
            if(!(strings.get(j)%2==0)&&!(strings.get(j)%3==0)) {
                other.add(strings.get(j));
            }
        }

        printList(thre);
        printList(two);
        printList(other);

    }

    public static void printList(List<Integer> list) {
        for (int j=0; j<list.size();j++) {
            System.out.println(list.get(j));
        }
    }
}
