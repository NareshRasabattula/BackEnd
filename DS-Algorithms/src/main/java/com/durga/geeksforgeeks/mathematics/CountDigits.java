package com.durga.geeksforgeeks.mathematics;

/**
 * @author DurgaNaresh
 * @Created 16/05/2023 - 8:43 AM
 * Hard work definitely pays off.
 * There is no substitute of hard work.
 * There is no shortcut to success.
 */
public class CountDigits {

    static int countDigits(int number){
        if(number/10 == 0)
            return 1;
        return 1 + countDigits(number/10);
    }

    static int countDigitsMethodOne(int number){
        int res =0;
        while(number  > 0){
            number = number/10;
            res ++;
        }
        return res;
    }

    public static void main(String[] args) {
        int number = 2123423;
        System.out.println("Digits Count:"+ countDigits(number));
        System.out.println("Digits Count:"+ countDigitsMethodOne(number));
    }
}
