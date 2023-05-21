package com.durga.patterns;

import java.util.Scanner;



/**
 * @author DurgaNaresh
 * @Created 20/05/2023 - 7:54 PM
 * Hard work definitely pays off.
 * There is no substitute of hard work.
 * There is no shortcut to success.
 */
public class PatternProgramsUtil {

    private static final int alphabet = 65;
    public static void patternDecision(String patternType, int value){
        if(patternType.equalsIgnoreCase("N"))
            System.out.print(value);
        else if (patternType.equalsIgnoreCase("A"))
            System.out.print((char)(alphabet + value));
        else
            System.out.print("*");
    }
    public static void printPatterns(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = input.nextInt();
        System.out.println("What pattern do you want to print" +
                "For Alphabet[Give input as A for Alphabet] Numeric[Give input N for numeric]");
        String alphabet = input.next();
        if (null != alphabet) {
            //PatternPrograms.pattern1(alphabet, size);
            //PatternPrograms.pattern2(alphabet,size);
            PatternPrograms.pattern3(alphabet,size);
        }else{
            System.out.println("Please choose the pattern");
        }
    }
}
