package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static int algorithm1(int n) {
        int steps = 1;

        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = (n * 3) + 1;
            }
            steps++;
        }

        return steps;
    }

    public static int algorithm2(int a, int b) {
        int max = 0;
        for (int i = a; i <= b; i++) {
            int result = algorithm1(i);
            if (result > max) {
                max = result;
            }
        }
        return max;
    }


    public static Boolean isPalindrom(String str) {
        int length = str.length() - 1;

        for (int i = 0; i <= length; i++) {
            if (str.charAt(i) != str.charAt(length - i)) {
                return false;
            }
        }
        return true;
    }


    public static boolean isPrime(int n) {
        for (int i = 2; i <= (Math.sqrt(n) + 1); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static List<Integer> getPrimes(int a, int b) {
        List<Integer> resultList = new ArrayList<>();
        for (int i = a; i <= b; i++) {
            if (isPrime(i)) {
                resultList.add(i);
            }
        }
        return resultList;
    }


    public static List<String> printRelations(List<Figure> figureList, List<Point> pointList) {
        List<String> resultList = new ArrayList<>();

//        for (int pointIndex = 0; pointIndex < pointList.size(); pointIndex++){
//            boolean contained = false;
//            Point p = pointList.get(pointIndex);
//            for (int figureIndex = 0; figureIndex < figureList.size(); figureIndex++){
//                Figure f = figureList.get(figureIndex);
//                if (f.containsPoint(p)){
//                    contained = true;
//                    resultList.add("Point " + (pointIndex+1) + " is contained in figure " + (figureIndex+1));
//                }
//            }
//            if (!contained){
//                resultList.add("Point " + (pointIndex+1) + " is not contained in any figure");
//            }
//        }

        // samodzielna proba rozwiazania zadania ponizej

        for (int p = 0; p < pointList.size(); p++) {
            boolean contained = false;
            for (int i = 0; i < figureList.size(); i++) {
                if (figureList.get(i).containsPoint(pointList.get(p))) {
                    contained = true;
                    resultList.add("Point " + (p + 1) + " is contained in figure " + (i + 1));
                }
            }

            if (!contained) {
                resultList.add("Point " + (p + 1) + " is not contained in any figure");
            }
        }

        return resultList;
    }

}
