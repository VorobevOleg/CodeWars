package com.codewars;

//        Move the first letter of each word to the end of it, then add "ay" to the end of the word.
//        Leave punctuation marks untouched.
//
//        Examples
//
//        pigIt('Pig latin is cool'); // igPay atinlay siay oolcay
//        pigIt('Hello world !');     // elloHay orldway !


public class PigLatin {
    public static String pigIt(String str) {
        String[] splitStr = str.split(" ");
        String rezultStr = "";
        for (int i = 0; i < splitStr.length; i++) {
            if (Character.isLetter(splitStr[i].charAt(0))) {
                    rezultStr += splitStr[i].substring(1) + splitStr[i].charAt(0) + "ay ";
            } else {
                rezultStr += splitStr[i];
            }
        }
        rezultStr = rezultStr.trim();
    return rezultStr;
    }
}

//  best practices:
//  public class PigLatin {
//      public static String pigIt(String str) {
//          return str.replaceAll("(\\w)(\\w*)", "$2$1ay");
//      }
//  }