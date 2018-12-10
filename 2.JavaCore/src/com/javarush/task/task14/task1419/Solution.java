package com.javarush.task.task14.task1419;

import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }


        try {
          int i = 1-2-3;
            int[] a =new int[i];

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            FileInputStream f = new FileInputStream("test");
            f.read();

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            ArrayList<String> os = new ArrayList<>();
            Object o = new Object();
            os.add(String.valueOf(((int) o)));

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            Object o = null;
            o.equals("test");

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            String s = "test";
            Integer.parseInt(s);

        } catch (Exception e) {
            exceptions.add(e);
        }

        try
        {   Object szStr[] = new String[10];
            szStr[0] = new Character('*');
        }catch (Exception e) {
            exceptions.add(e);
        }


        try
        {        String szShortString = "123";
            char chr = szShortString.charAt(10);
        }catch (Exception e) {
            exceptions.add(e);
        }


        try {
            int[] array = new int[0];
            int a = array[1];
        } catch (ArrayIndexOutOfBoundsException e) {
            exceptions.add(e);
        }

        try {
            URL url = new URL("");
        } catch (MalformedURLException e) {
            exceptions.add(e);
        }

//        try {
//            Socket socket = new Socket("123", 8080);
//        } catch (IOException e) {
//            exceptions.add(e);
//        }
        //напишите тут ваш код

    }
}
