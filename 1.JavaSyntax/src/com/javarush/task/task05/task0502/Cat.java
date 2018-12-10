package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public String name;
    public int age;
    public int weight;
    public int strength;

   public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
//        if(this.getWeight()>anotherCat.getWeight()){
//                то cat2.fight(cat1) = false
        return this.getWeight()>anotherCat.getWeight();
    }

    public static void main(String[] args) {
        Cat cat1=new Cat();
        Cat cat2=new Cat();
        Cat cat3=new Cat();
        cat1.weight=10;
        cat2.weight=9;
        cat3.weight=11;
//        System.out.println(cat1.fight(cat2));
//        System.out.println(cat2.fight(cat1));
//        System.out.println(cat1.fight(cat2));
//        System.out.println(cat1.fight(cat3));
    }
}
