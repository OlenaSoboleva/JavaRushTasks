package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        ArrayList<Character> glasnie = new ArrayList<>();
        ArrayList<Character> isNotGlasnie = new ArrayList<>();
        String[] clearString = string.split("[^\\S]");
        String s = "";
        for (int k = 0; k < clearString.length; k++) {
            s = s + clearString[k];
        }
         for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                glasnie.add(s.charAt(i));
            } else {
                isNotGlasnie.add(s.charAt(i));
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char c : glasnie) {
            sb.append(c).append(" ");
        }

        StringBuilder sbs = new StringBuilder();
        for (char c : isNotGlasnie) {
            sbs.append(c).append(" ");
        }

        System.out.println(sb.toString());
        System.out.println(sbs.toString());
    }

    // метод проверяет, гласная ли буква

    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}