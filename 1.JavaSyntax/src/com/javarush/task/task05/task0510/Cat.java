package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    private String name = null;
    private int age = 2;
    private int weight = 5;
    private String address = null;
    private String color = "black";


    public void initialize(String name) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.address = address;
        this.color = color;
    }

    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.address = address;
        this.color = color;
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.address = address;
    }

    public void initialize(int weight, String color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.address = address;
        this.color = color;
    }

    public void initialize(int weight, String color, String address) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.address = address;
        this.color = color;

    }

    public static void main(String[] args) {

    }
}
