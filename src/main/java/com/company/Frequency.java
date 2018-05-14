package com.company;

import java.util.HashMap;
import java.util.Map;

public class Frequency {
    public static String getMaxFrequencies(String str) {
        Map<Character, Integer> signMap = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char sign = str.charAt(i);
            if (!Character.isLetterOrDigit(sign)) {
                continue;
            }
            if (signMap.containsKey(sign)) {
                int count = signMap.get(sign);
                signMap.put(sign, count+1);
            } else {
                signMap.put(sign, 1);
            }
        }

        int max = 0;
        for (Integer value : signMap.values()) { //iterowanie po wartościach mapy
            if (value > max) {
                max = value;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, Integer> pair : signMap.entrySet()) { //iterowanie po kluczach i wartościach mapy
            if (pair.getValue() == max) {
                sb.append(pair.getKey());
            }
        }

        sb.append(" " + max);
        return sb.toString();

//            signMap.containsKey(key);
//            signMap.put(key, value);
//            signMap.get(key); zwraca value w int

    }
}
