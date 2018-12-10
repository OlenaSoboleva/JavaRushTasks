package com.javarush.task.task05.task0518;

/* 
Регистрируем собачек
*/


public class Dog {
    private String name = null;
    private int height = 2;
    private String color = "black";

    public Dog(String name) {
        this.name = name;
        this.height = height;
        this.color = color;
    }
    public Dog(String name,int height) {
        this.name = name;
        this.height = height;
        this.color = color;
    }
    public Dog(String name,int height,String color ) {
        this.name = name;
        this.height = height;
        this.color = color;
    }

    public static void main(String[] args) {

    }
}
