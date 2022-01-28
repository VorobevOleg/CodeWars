package com.codewars;

//        In this kata you have to create all permutations of an input string and remove duplicates, if present.
//        This means, you have to shuffle all letters from the input in all possible orders.
//
//        Examples:
//
//        Permutations.singlePermutations("a") `shouldBe` ["a"]
//        Permutations.singlePermutations("ab") `shouldBe` ["ab", "ba"]
//        Permutations.singlePermutations("aabb") `shouldBe` ["aabb","abab","abba","baab","baba","bbaa"]
//
//        The order of the permutations doesn't matter.


import java.util.*;

public class Permutations {
    public static List<String> singlePermutations(String s) {

        Set<String> set = new HashSet<>();

        char[] charArr = s.toCharArray();
        char bufChar;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                bufChar = s.charAt(i);
                charArr[i] = charArr[j];
                charArr[j] = bufChar;
                set.add(String.valueOf(charArr));
                set.add(s.substring(i) + s.substring(0,i));
                charArr = s.toCharArray();
            }
        }

        return new ArrayList<>(set);
    }
}
