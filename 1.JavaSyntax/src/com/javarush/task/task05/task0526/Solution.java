package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man man1= new Man("Alex",25,"addressAlex");
        Man man2= new Man("Gleb",30,"addressGleb");

        System.out.println(man1);
        System.out.println(man2);

        Woman woman1= new Woman("Lena",25,"addressLena");
        Woman woman2= new Woman("Olga",30,"adrdessOlga");

        System.out.println(woman1);
        System.out.println(woman2);
    }

    public static class Man{
        String name;
        int age;
        String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
        public String toString() {
            return name + " " + age + " " + address;
        }
    }

    public static class Woman{
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
        public String toString() {
            return name + " " + age + " " + address;
        }
    }
}
