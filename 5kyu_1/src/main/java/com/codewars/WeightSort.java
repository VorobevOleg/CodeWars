package com.codewars;

/*   My friend John and I are members of the "Fat to Fit Club (FFC)". John is worried because each month a list with
the weights of members is published and each month he is the last on the list which means he is the heaviest.

I am the one who establishes the list so I told him: "Don't worry any more, I will modify the order of the list".
It was decided to attribute a "weight" to numbers. The weight of a number will be from now on the sum of its digits.

For example 99 will have "weight" 18, 100 will have "weight" 1 so in the list 100 will come before 99.

Given a string with the weights of FFC members in normal order can you give this string ordered by "weights" of these
numbers?
Example:

"56 65 74 100 99 68 86 180 90" ordered by numbers weights becomes:

"100 180 90 56 65 74 68 86 99"

When two numbers have the same "weight", let us class them as if they were strings (alphabetical ordering) and not
numbers:

180 is before 90 since, having the same "weight" (9), it comes before as a string.

All numbers in the list are positive numbers and the list can be empty.
Notes

it may happen that the input string have leading, trailing whitespaces and more than a unique whitespace between two
consecutive numbers
For C: The result is freed.
*/


import java.util.*;

public class WeightSort {
    public static String orderWeight(String strng) {
        String result = "";
        String[] arrStrng = strng.split(" ");

        Map<Integer, String> map = new HashMap<>();

        for (int i = 0; i < arrStrng.length; i++) {
            int sumTmp = 0;
            char[] arrCharTmp = arrStrng[i].toCharArray();
            int[] arrIntTmp = new int[arrCharTmp.length];

            for (int j = 0; j < arrCharTmp.length; j++) {
                arrIntTmp[j] = Character.getNumericValue(arrCharTmp[j]);
            }

                for (int j = 0; j < arrIntTmp.length; j++) {
                sumTmp += arrIntTmp[j];
            }

            if (!map.containsKey(sumTmp)) {
                map.put(sumTmp, arrStrng[i]);
            } else map.put(sumTmp, map.get(sumTmp) + " " + arrStrng[i]);

        }

        List<Integer> list = new ArrayList<>(map.keySet());

        Integer[] arrKeys;
        arrKeys = list.toArray(new Integer[list.size()]);

        Arrays.sort(arrKeys);


        for (Integer key : map.keySet()) {
            String[] arrTmpStr = map.get(key).split(" ");

            Arrays.sort(arrTmpStr);

            String rez = "";

            for (int i = 0; i < arrTmpStr.length; i++) {
                if (i != arrTmpStr.length - 1) {
                    rez += arrTmpStr[i] + " ";
                } else rez += arrTmpStr[i];
            }
            map.put(key,rez);
        }

        for (int i = 0; i < arrKeys.length; i++) {
            if (i != arrKeys.length - 1) {
                result += map.get(arrKeys[i]) + " ";
            } else result += map.get(arrKeys[i]);
        }

        return result;
    }

}
