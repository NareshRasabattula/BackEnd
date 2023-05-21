package com.durga.patterns;

import java.util.Scanner;

/**
 * @author DurgaNaresh
 * @Created 20/05/2023 - 5:51 PM
 * Hard work definitely pays off.
 * There is no substitute of hard work.
 * There is no shortcut to success.
 */
public class PatternPrograms {
    public static void pattern1(String patternType, int size){
        for (int i = 0; i <= size; i ++){
             for (int j = 0; j <= i; j ++){
                PatternProgramsUtil.patternDecision(patternType,j);
             }
            System.out.println();
        }
        System.out.println();
    }

    public static void pattern2(String patternType, int size){
        for (int i = 0; i <= size; i ++){
            for (int j = 0; j <= i; j ++){
                PatternProgramsUtil.patternDecision(patternType,i);
            }
            System.out.println();
        }
    }

    public static void pattern3(String patternType, int size){
        for (int i = 0; i <= size; i ++){
            for (int j = 0; j <= i; j ++){
                PatternProgramsUtil.patternDecision(patternType,j);
            }
            System.out.println();
        }
        for (int i = size; i >= 1; i --){
           for (int j = 0; j < i; j ++){
               PatternProgramsUtil.patternDecision(patternType,j);
           }
            System.out.println();
        }
    }

}
