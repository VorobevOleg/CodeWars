package com.codewars;

public class Solution {
    public static String camelCase(String input) {

        if (input.equals("") || input == null) {
            return "";
        } else {
            String result = "";
            char[] arrChar = input.toCharArray();

            for (int i = 0; i < arrChar.length - 1; i++) {
                result += arrChar[i];
                if (Character.isLowerCase(arrChar[i]) && Character.isUpperCase(arrChar[i + 1])) {
                    result += " ";
                }
            }
            result += arrChar[arrChar.length - 1];
            return result;
        }
    }

}
