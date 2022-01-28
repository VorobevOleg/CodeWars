package com.codewars;

//        Write a function, which takes a non-negative integer (seconds) as input and returns the time
//        in a human-readable format (HH:MM:SS)
//
//        HH = hours, padded to 2 digits, range: 00 - 99
//        MM = minutes, padded to 2 digits, range: 00 - 59
//        SS = seconds, padded to 2 digits, range: 00 - 59
//
//        The maximum time never exceeds 359999 (99:59:59)
//
//        You can find some examples in the test fixtures.

public class HumanReadableTime {
    public static String makeReadable(int seconds) {

        int hr = seconds / 3600;
        int mn = (seconds % 3600) / 60;
        int sec = (seconds % 3600) % 60;

        String hrStr = (hr<10 ? "0" : "")+hr;
        String mnStr = (mn<10 ? "0" : "")+mn;
        String secStr = (sec<10 ? "0" : "")+sec;

        return hrStr + ":" + mnStr + ":" + secStr;
    }
}

// best practices:

//    public static String makeReadable(int seconds) {
//        return String.format("%02d:%02d:%02d", seconds / 3600, (seconds / 60) % 60, seconds % 60);
//    }
