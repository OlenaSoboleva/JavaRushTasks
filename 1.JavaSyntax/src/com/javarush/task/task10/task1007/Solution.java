package com.javarush.task.task10.task1007;

/* 
Задача №7 на преобразование целых типов
*/

public class Solution {
    public static void main(String[] args) {
        long l =  1234_564_890L;//1234564890
        int x =  0b1000_1100_1010;//2250
        double m = (byte) 110_987_654_6299.123_34;//1.1098765462991233E12
        float f =  l++ + 10 + ++x - (float) m;
        l = (long) (f / 1000);
        System.out.println(l);
    }
}