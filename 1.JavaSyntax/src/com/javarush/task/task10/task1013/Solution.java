package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public Solution() {
    }

    public static class Human {
        private  String name;
        private String sex;
        private int age;
        private String job;
        private String ocupacity;
        private long salary;

        public Human(int age, String job) {
            this.age = age;
            this.job = job;
        }

        public Human(int age, String ocupacity, long salary) {
            this.age = age;
            this.ocupacity = ocupacity;
            this.salary = salary;
        }



        public Human(String name, int age, long salary) {
            this.name = name;
            this.age = age;
            this.salary = salary;
        }



        public Human(String sex, int age, String job) {
            this.sex = sex;
            this.age = age;
            this.job = job;
        }


        public Human(String job, String ocupacity, long salary) {
            this.job = job;
            this.ocupacity = ocupacity;
            this.salary = salary;
        }



        public Human(String ocupacity, long salary) {
            this.ocupacity = ocupacity;
            this.salary = salary;
        }


        public Human(String name) {
            this.name = name;
        }

        public Human(String name, String sex) {
            this.name = name;
            this.sex = sex;
        }


        public Human(String name, String sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human() {

        }
    }
}
