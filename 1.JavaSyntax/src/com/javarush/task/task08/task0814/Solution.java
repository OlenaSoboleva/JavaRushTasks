package com.javarush.task.task08.task0814;

import java.util.HashSet;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 1; i <= 20; i++) {
            set.add(i);
        }
        return set;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        HashSet<Integer> setdeleted = new HashSet<>();
        for (Integer n : set) {
            if (n <= 10) {
                setdeleted.add(n);
            }
        }
        return setdeleted;
    }

    public static void main(String[] args) {

    }
}
