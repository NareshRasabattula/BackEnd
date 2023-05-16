package com.durga.geeksforgeeks.mathematics;

/**
 * @author DurgaNaresh
 * @Created 16/05/2023 - 9:11 AM
 * Hard work definitely pays off.
 * There is no substitute of hard work.
 * There is no shortcut to success.
 */
public class PalindromeNumber {

    static boolean palindromeNumber(int number){
        int reverse =0;
        int temp = number;
        while (temp != 0){
            int lastDigit = temp%10;
            reverse = reverse*10+lastDigit;
            temp = temp/10;
        }
        return (reverse == number);
    }

    public static void main(String[] args) {
        int number = 363;
        int number1 = 367;
        System.out.println("PalindromNumber:" + palindromeNumber(number));
        System.out.println("PalindromNumber:" + palindromeNumber(number1));
    }
}
