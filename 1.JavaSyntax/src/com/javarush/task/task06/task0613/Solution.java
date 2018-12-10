package com.javarush.task.task06.task0613;

/* 
Кот и статика
*/

public class Solution {
    public static void main(String[] args) {
      int i=10;
        while (i>0){
            Cat cat = new Cat();
            i--;
        }
        System.out.println(Cat.catCount);
    }

    public static class Cat {
        public static int catCount;

        public Cat() {
            Cat.catCount++;
        }
    }
}
