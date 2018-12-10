package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import static com.javarush.task.task14.task1411.Person.*;

/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key;
        key = reader.readLine();

            while ((key.equals("user")||key.equals("loser")||key.equals("coder")||key.equals("proger")))
        //тут цикл по чтению ключей, пункт 1
        {

            if(key.equals("user")){
                doWork(new User());

            }
            else if(key.equals("loser")){
                doWork( new Loser());

            }
            else  if(key.equals("coder")){
                doWork(new Coder());

            }
            else if(key.equals("proger")){
                doWork( new Proger());

            }
            //создаем объект, пункт 2

//            doWork(person); //вызываем doWork
            key = reader.readLine();
        }
    }

    public static void doWork(Person person) {
        if (person instanceof User){
            User user = (User) person;
            user.live();
        }

        else if (person instanceof Loser){
            Loser loser = (Loser) person;
            loser.doNothing();
        }

        else if (person instanceof Coder){
            Coder coder = (Coder) person;
            coder.coding();
        }

        else if (person instanceof Proger){
            Proger proger = (Proger) person;
            proger.enjoy();
        }
    }
}
