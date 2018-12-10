package com.javarush.task.task08.task0827;

/*
Работа с датой
*/

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution {
    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOdd("JANUARY 2 2020"));
    }

    public static boolean isDateOdd(String date) throws ParseException {

        Date endDate =new SimpleDateFormat("MMM dd yyyy").parse(date);
        Date yearStartTime = (Date) endDate.clone();
        yearStartTime.setDate(1);
        yearStartTime.setMonth(0);
        long msTimeDistance = endDate.getTime() - yearStartTime.getTime();
        long msDay = 24 * 60 * 60 * 1000;  //сколько миллисекунд в одних сутках

        int dayCount = (int) (msTimeDistance/msDay); //количество целых дней
        int n = dayCount%2;
        boolean result=false;
        if(n>0){
            result= false;
        }
        else {
            result= true;
        }
        return result;
    }
}
