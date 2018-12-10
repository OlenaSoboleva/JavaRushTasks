package com.javarush.task.task05.task0511;

/* 
Создать класс Dog
*/

public class Dog {
    private String name = null;
    private int height = 2;
    private String color = "black";

    public void initialize(String name) {
        this.name = name;
        this.height = height;
        this.color = color;
    }
    public void initialize(String name,int height) {
        this.name = name;
        this.height = height;
        this.color = color;
    }
    public void initialize(String name,int height,String color ) {
        this.name = name;
        this.height = height;
        this.color = color;
    }
    public static void main(String[] args) {

    }
}
