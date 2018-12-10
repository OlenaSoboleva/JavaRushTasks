package com.javarush.task.task13.task1318;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String file = bf.readLine();

        InputStream inStream = new FileInputStream(file);
        while (inStream.available() > 0) {

            System.out.print((char) inStream.read());
        }
        inStream.close();
        bf.close();
    }
}