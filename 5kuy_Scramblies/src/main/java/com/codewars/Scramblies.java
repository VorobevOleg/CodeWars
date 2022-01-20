package com.codewars;

public class Scramblies {
    public static boolean scramble(String str1, String str2) {
        char[] arrStr1 = str1.toCharArray();
        char[] arrStr2 = str2.toCharArray();
        int checkCount = 0;

        for (int i = 0; i < arrStr2.length; i++) {
            for (int j = 0; j < arrStr1.length; j++) {
                if (arrStr2[i] == arrStr1[j]) {
                    checkCount ++;
                    arrStr1[j] = 0;
                    break;
                }
            }
        }
        return checkCount == str2.length();
    }
}
