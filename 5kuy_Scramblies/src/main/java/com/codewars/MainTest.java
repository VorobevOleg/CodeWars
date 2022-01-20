package com.codewars;

/*
        Description:

        Complete the function scramble(str1, str2) that returns true if a portion of str1 characters can be
        rearranged to match str2, otherwise returns false.

        Notes:

        Only lower case letters will be used (a-z). No punctuation or digits will be included.
        Performance needs to be considered

        Input strings s1 and s2 are null terminated.

        Examples

        scramble('rkqodlw', 'world') ==> True
        scramble('cedewaraaossoqqyt', 'codewars') ==> True
        scramble('katas', 'steak') ==> False
*/

public class MainTest {
    public static void main(String[] args) {

        System.out.println(Scramblies.scramble("rkqodlw","world"));
        System.out.println(Scramblies.scramble("cedewaraaossoqqyt","codewars"));
        System.out.println(Scramblies.scramble("katas","steak"));
        System.out.println(Scramblies.scramble("scriptjavx","javascript"));
        System.out.println(Scramblies.scramble("scriptingjava","javascript"));
        System.out.println(Scramblies.scramble("scriptsjava","javascripts"));
        System.out.println(Scramblies.scramble("javscripts","javascript"));
        System.out.println(Scramblies.scramble("aabbcamaomsccdd","commas"));
        System.out.println(Scramblies.scramble("commas","commas"));
        System.out.println(Scramblies.scramble("sammoc","commas"));


//        testing(Scramblies.scramble("rkqodlw","world"), true);
//        testing(Scramblies.scramble("cedewaraaossoqqyt","codewars"),true);
//        testing(Scramblies.scramble("katas","steak"),false);
//        testing(Scramblies.scramble("scriptjavx","javascript"),false);
//        testing(Scramblies.scramble("scriptingjava","javascript"),true);
//        testing(Scramblies.scramble("scriptsjava","javascripts"),true);
//        testing(Scramblies.scramble("javscripts","javascript"),false);
//        testing(Scramblies.scramble("aabbcamaomsccdd","commas"),true);
//        testing(Scramblies.scramble("commas","commas"),true);
//        testing(Scramblies.scramble("sammoc","commas"),true);


    }
}
