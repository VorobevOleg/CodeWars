package com.codewars;

/*
Complete the solution so that the function will break up camel casing, using a space between words.
        Example

        "camelCasing"  =>  "camel Casing"
        "identifier"   =>  "identifier"
        ""             =>  ""
*/

public class MainTest {
    public static void main(String[] args) {
        System.out.println(Solution.camelCase("camelCasing"));
        System.out.println(Solution.camelCase("camelCasingTest"));
        System.out.println(Solution.camelCase("camelcasingtest"));
    }
}
