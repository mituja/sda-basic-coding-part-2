package com.company;

public class Decoder {

    public static String decode(String str) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            char Char = (char) (str.charAt(i) - 7);
            newStr = newStr + Char;
        }

        return newStr;
    }

    //alternatywny sposób
    public static String decodeAlternative(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            int asciiNum = str.charAt(i) - 7;
            sb.append((char) asciiNum);
        }
        return sb.toString();
    }
}
