package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //list of addresses
        HashMap<String, String> addresses = new HashMap<>();
        while (true) {
            String address = reader.readLine();
            if (address.isEmpty()) break;
            String family = reader.readLine();
            addresses.put(address, family);
        }

        String city = reader.readLine();
        for (Map.Entry<String,String> entity: addresses.entrySet()
             ) {
            if(city.equals(entity.getKey())){
                System.out.println(entity.getValue());
            }
        }
    }
}
