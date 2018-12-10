package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {

        ArrayList<Human> parents1 = new ArrayList<Human>();
        ArrayList<Human> parents2 = new ArrayList<Human>();
        ArrayList<Human> children1 = new ArrayList<Human>();
        Human mother = new Human("Lena", false, 36, children1);
        Human father = new Human("Alex", true, 36, children1);
        parents1.add(mother);
        parents2.add(father);
        Human son1 = new Human("Yuriy", true, 10, new ArrayList<Human>());
        Human son2 = new Human("Oleg", true, 7, new ArrayList<Human>());
        Human son3 = new Human("Vlad", true, 2, new ArrayList<Human>());
        children1.add(son1);
        children1.add(son2);
        children1.add(son3);
        Human griendfather1 = new Human("Yuriy", true, 64, parents1);
        Human griendmother1 = new Human("Larisa", true, 63, parents1);

        Human griendmother2 = new Human("valentina", true, 62, parents2);
        Human griendfather2 = new Human("Yuriy", true, 64, parents2);

        System.out.println(griendfather1.toString());
        System.out.println(griendmother1.toString());
        System.out.println(griendfather2.toString());
        System.out.println(griendmother2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(son1.toString());
        System.out.println(son2.toString());
        System.out.println(son3.toString());
    }

    public static class Human {
        String name;
        Boolean sex;
        Integer age;
        ArrayList<Human> children;


        public Human(String name, Boolean sex, Integer age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public Human() {
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
