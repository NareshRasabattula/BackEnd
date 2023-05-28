package com.durga.patterns;

/**
 * @author DurgaNaresh
 * @Created 20/05/2023 - 5:51 PM
 * Hard work definitely pays off.
 * There is no substitute of hard work.
 * There is no shortcut to success.
 */
public class PatternPrograms {

    private static final int alphabet = 65;

    public static void patternDecision(String patternType, int value){
        if(patternType.equalsIgnoreCase("N"))
            System.out.print(value+" ");
        else if (patternType.equalsIgnoreCase("A"))
            System.out.print((char)(alphabet + value)+" ");
        else
            System.out.print("*");
    }
    public static void pattern1(String patternType, int size){
        System.out.println("** Printing the pattern1... **");
        for (int i = 0; i <= size; i ++){
             for (int j = 0; j <= i; j ++){
                patternDecision(patternType,j);
             }
            System.out.println();
        }
        System.out.println();
    }

    public static void pattern2(String patternType, int size){
        System.out.println("** Printing the pattern2... **");
        for (int i = 0; i <= size; i ++){
            for (int j = 0; j <= i; j ++){
                patternDecision(patternType,i);
            }
            System.out.println();
        }
    }

    public static void pattern3(String patternType, int size){
        System.out.println("** Printing the pattern3... **");
        for (int i = 0; i <= size; i ++){
            for (int j = 0; j <= i; j ++){
                patternDecision(patternType,j);
            }
            System.out.println();
        }
        for (int i = size; i >= 1; i --){
           for (int j = 0; j < i; j ++){
               patternDecision(patternType,j);
           }
            System.out.println();
        }
    }

    public static void pattern4(String patternType,int rows)
    {
        System.out.println("** Printing the pattern4... **");
        for (int i = rows; i >= 0; i--)
        {
            for (int j = 0; j <= i; j++)
            {
                patternDecision(patternType,j);
            }
            System.out.println();
        }

        for (int i = 0; i <= rows; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                patternDecision(patternType,j);
            }
            System.out.println();
        }
    }

    public static void pattern5(String patternType,int rows)
    {
        System.out.println("** Printing the pattern5... **");
        for (int i = rows; i >= 0; i--)
        {
            for (int j = i; j >= 0; j--)
            {
                patternDecision(patternType,j);
            }
            System.out.println();
        }

        for (int i = 0; i <= rows; i++)
        {
            for (int j = i; j >= 0; j--)
            {
                patternDecision(patternType,j);
            }
            System.out.println();
        }
    }


    public static void pattern6(String patternType,int rows)
    {
        System.out.println("** Printing the pattern6... **");
        for (int i = 0; i <= rows; i++)
        {
            for (int j = rows; j > i; j--)
            {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++)
            {
                patternDecision(patternType,k+1);
            }
            System.out.println();
        }
    }

    public static void pattern7(String patternType,int rows)
    {
        System.out.println("** Printing the pattern7... **");
        for (int i = 0; i <= rows; i++)
        {
            for (int j = rows; j >= i; j--)
            {
                patternDecision(patternType,j);
            }
            System.out.println();
        }
    }

    public static void pattern8(String patternType,int rows)
    {
        System.out.println("** Printing the pattern8... **");
        for (int i = rows; i >= 0; i--)
        {
            for (int j = rows; j >= i; j--)
            {
                patternDecision(patternType,j);
            }
            System.out.println();
        }
    }

    public static void pattern9(String patternType,int rows)
    {
        System.out.println("** Printing the pattern9... **");
        for (int i = rows; i >= 0; i--)
        {
            for (int j = 0; j <= i; j++)
            {
                patternDecision(patternType,j);
            }
            System.out.println();
        }
    }

    public static void pattern10(String patternType,int rows)
    {
        int k = 1;
        System.out.println("** Printing the pattern10... **");
        for (int i = 0; i <= rows; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                patternDecision(patternType,k);
                k++;
            }
            System.out.println();
        }
    }

    public static void pattern11(String patternType,int rows)
    {
        System.out.println("** Printing the pattern11... **");
        for (int i = 0; i <= rows; i++)
        {
            for (int j = i; j >= 0; j--)
            {
                patternDecision(patternType,j);
            }
            System.out.println();
        }
    }

    public static void pattern12(String patternType,int rows)
    {
        System.out.println("** Printing the pattern12... **");
        for (int i = 1; i <= rows; i++)
        {
            int temp = i;
            for (int j = i; j >= 1; j--)
            {
                patternDecision(patternType,temp);
                temp = temp + rows;
            }
            System.out.println();
        }
    }

    public static void pattern13(String patternType,int rows)
    {
        System.out.println("** Printing the pattern13... **");
        for (int i = 1; i <= rows; i++)
        {
            for (int j = rows; j > i; j--)
            {
                System.out.print(" ");
            }

            int temp = 1;
            for (int k = 1; k <= i; k++)
            {
                patternDecision(patternType,temp);
                temp = temp * (i - k) / (k);
            }
            System.out.println();
        }
    }

    public static void pattern14(String patternType,int rows)
    {
        System.out.println("** Printing the pattern14... **");
        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                patternDecision(patternType,j);
            }
            for (int k = i - 1; k >= 1; k--)
            {
                patternDecision(patternType,k);
            }
            System.out.println();
        }
    }

    public static void pattern15(String patternType,int rows)
    {
        System.out.println("** Printing the pattern15... **");
        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j < i; j++)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= rows - i + 1; k++)
            {
                patternDecision(patternType,k);
            }
            System.out.println();
        }
    }

    public static void pattern16(String patternType,int rows)
    {
        System.out.println("** Printing the pattern16... **");
        for (int i = 1; i <= rows; i++)
        {
            for (int j = rows; j > i; j--)
            {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++)
            {
                patternDecision(patternType,k);
            }
            System.out.println();
        }
        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= rows - i; k++)
            {
                patternDecision(patternType,k);
            }
            System.out.println();
        }
    }

    public static void pattern17(String patternType,int rows)
    {
        System.out.println("** Printing the pattern17... **");
        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j < i; j++)
            {
                System.out.print(" ");
            }

            for (int k = i; k <= rows; k++)
            {
                patternDecision(patternType,k);
            }
            System.out.println();
        }
        for (int i = rows; i >= 1; i--)
        {
            for (int j = 1; j < i; j++)
            {
                System.out.print(" ");
            }

            for (int k = i; k <= rows; k++)
            {
                patternDecision(patternType,k);
            }
            System.out.println();
        }
    }

    public static void pattern18(String patternType,int rows)
    {
        System.out.println("** Printing the pattern18... **");
        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j < i; j++)
            {
                System.out.print(" ");
            }
            for (int k = i; k <= rows; k++)
            {
                patternDecision(patternType,k);
            }
            System.out.println();
        }
        for (int i = rows; i >= 1; i--)
        {
            for (int j = 1; j < i; j++)
            {
                System.out.print(" ");
            }
            for (int k = i; k <= rows; k++)
            {
                patternDecision(patternType,k);
            }
            System.out.println();
        }
    }

    public static void pattern19(String patternType,int rows)
    {
        System.out.println("** Printing the pattern19... **");
        for (int i = rows; i >= 1; i--)
        {
            for (int j = 1; j < i; j++)
            {
                System.out.print(" ");
            }

            for (int k = i; k <= rows; k++)
            {
                patternDecision(patternType,k);
            }
            System.out.println();
        }

    }

    public static void  pattern20(String patternType,int rows)
    {
        System.out.println("** Printing the pattern20... **");
        for (int i = 1; i <= rows; i++)
        {
            for (int j = rows; j > i; j--)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++)
            {
                patternDecision(patternType,k);
            }
            for (int l = i - 1; l >= 1; l--)
            {
                patternDecision(patternType,l);
            }
            System.out.println();
        }
    }

    public static void pattern21(String patternType,int rows)
    {
        System.out.println("** Printing the pattern21... **");
        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                patternDecision(patternType,j % 2);
            }
            System.out.println();
        }
    }

    public static void pattern22(String patternType,int rows)
    {
        System.out.println("** Printing the pattern22... **");
        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j < i; j++)
            {
                System.out.print("0 ");
            }
            patternDecision(patternType,i);
            for (int k = i; k < rows; k++)
            {
                System.out.print("0 ");
            }
            System.out.println();
        }
    }

    public static void pattern23(String patternType,int rows)
    {
        System.out.println("** Printing the pattern23... **");
        for (int i = 1; i <= rows; i++)
        {
            for (int j = rows; j > i; j--)
            {
                System.out.print(1 + " ");
            }

            for (int k = 1; k <= i; k++)
            {
                patternDecision(patternType,i);
            }
            System.out.println();
        }
    }

    public static void pattern24(String patternType,int rows)
    {
        System.out.println("** Printing the pattern24... **");
        for (int i = 1; i <= rows; i++)
        {
            for (int j = i; j <= rows; j++)
            {
                patternDecision(patternType,j);
            }
            for (int k = rows - 1; k >= i; k--)
            {
                patternDecision(patternType,k);
            }
            System.out.println();
        }
    }

    public static void pattern25(String patternType,int rows)
    {
        System.out.println("** Printing the pattern25... **");
        for (int i = 1; i <= rows; i++)
        {
            for (int j = rows; j > i; j--)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++)
            {
                patternDecision(patternType,i);
            }
            System.out.println();
        }
    }

    public static void pattern26(String patternType,int rows)
    {
        System.out.println("** Printing the pattern26... **");
        for (int i = rows; i >= 1; i--)
        {
            for (int j = i; j < rows; j++)
            {
                patternDecision(patternType,j);
            }
            for (int k = rows - i; k < rows; k++)
            {
                System.out.print(5 + " ");
            }
            System.out.println();
        }
    }

    public static void pattern27(String patternType,int rows)
    {
        int k;
        System.out.println("** Printing the pattern27... **");
        for (int i = 1; i <= rows; i++)
        {
            k=i;
            for (int j = 1; j <= i; j++)
            {
                patternDecision(patternType,k);
                k = k + rows - j;
            }
            System.out.println();
        }
    }

    public static void pattern28(String patternType,int rows)
    {
        System.out.println("** Printing the pattern28... **");
        int temp = 1;
        for(int i=1; i<=rows/2+1; i++)
        {
            for(int j=1;j<=i;j++)
            {
                patternDecision(patternType,temp*j);
            }
            System.out.println();
            temp++;
        }
        for(int i=1; i<=rows/2; i++)
        {
            for(int j=1;j<=rows/2+1-i;j++)
            {
                patternDecision(patternType,temp*j);
            }
            System.out.println();
            temp++;
        }
    }

    public static void pattern29(int rows)
    {
        System.out.println("** Printing the pattern29... **");
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                int i1 = 1 + j * rows - (j - 1) * j / 2;
                if (j % 2 == 0)
                {
                    System.out.print(i1 + i - j + " ");
                } else
                {
                    System.out.print(i1 + rows - 1 - i + " ");
                }
            }
            System.out.println();
        }
    }

    public static void pattern30(int rows)
    {
        System.out.println("** Printing the pattern30... **");
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < rows; j++)
            {
                if (j % 2 == 0)
                    System.out.print((rows * (j)) + i + 1 + " ");
                else
                    System.out.print((rows * (j + 1)) - i + " ");
            }
            System.out.print("\n");
        }
    }

    public static void pattern31(int rows)
    {
        int temp = 0;
        System.out.println("** Printing the pattern31... **");
        for (int i = rows; i >= 1; i--)
        {
            for (int j = rows ; j >= i; j--)
            {
                System.out.print(j + " ");
                temp =j;
            }
            for (int k = rows - i+1; k < rows; k++)
            {
                System.out.print(temp + " ");
            }
            System.out.println();
        }
    }

    public static void pattern32(int rows)
    {
        System.out.println("** Printing the pattern32... **");
        for (int i = 1; i <= rows; i++)
        {
            int a = 0;
            int b = 1;

            for (int j = 1; j <= i; j++)
            {
                int c = a + b;
                System.out.print(c + " ");
                a = b;
                b = c;
            }
            System.out.println();
        }
    }

    public static void pattern33(int rows)
    {
        System.out.println("** Printing the pattern33... **");
        for (int i = rows; i >= 1; i--)
        {
            for (int j = i; j <= rows; j++)
            {
                System.out.print(j + " ");
            }
            for (int k = rows-1; k >= i; k--)
            {
                System.out.print(k + " ");
            }
            System.out.println();
        }

        for (int i = 2; i <= rows; i++)
        {
            for (int j = i; j <= rows; j++)
            {
                System.out.print(j + " ");
            }
            for (int k = rows-1; k >= i; k--)
            {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }

    public static void pattern34(int rows)
    {
        System.out.println("** Printing the pattern34... **");
        for (int i = 1; i <= rows; i++)
        {
            int j = i;

            for (int k = 1; k <= rows; k++)
            {
                System.out.print(j + " ");
                j++;
                if (j > rows)
                    j = 1;
            }
            System.out.println();
        }
    }

    public static void pattern35(int rows)
    {
        System.out.println("** Printing the pattern35... **");
        for (int i = 1; i <= rows; i++)
        {
            for (int j = i; j <= rows; j++)
            {
                System.out.print(j + " ");
            }
            for(int k = i-1; k >= 1; k--)
            {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }

    public static void pattern36(int rows)
    {
        System.out.println("** Printing the pattern36... **");
        for (int i = 1; i <= rows; i++)
        {
            int j = (i * 2) - 1;

            for (int k = 1; k <= rows; k++)
            {
                System.out.print(j + " ");
                j += 2;
                if (j > (rows * 2) - 1)
                    j = 1;
            }
            System.out.println();
        }
    }

    public static void pattern37(int rows)
    {
        System.out.println("** Printing the pattern37... **");
        for (int i = 1; i <= rows; i++)
        {
            int j = (i * 2) - 1;

            for (int k = i; k <= rows; k++)
            {
                System.out.print(j + " ");
                j += 2;
            }
            for (int l = (i * 2) - 3; l >= 1; l-=2)
            {
                System.out.print(l + " ");
            }
            System.out.println();
        }
    }

    public static void pattern38(int rows)
    {
        System.out.println("** Printing the pattern38... **");
        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j);
            }

            for (int j= i*2 ; j < rows*2; j++)
            {
                System.out.print(" ");
            }
            for (int l = i; l >= 1; l--)
            {
                System.out.print(l);
            }
            System.out.println();
        }
    }

    public static void pattern39(int rows)
    {
        int currentRow = 1;
        int counter = 1;
        System.out.println("** Printing the pattern39... **");
        for (int i=1; i<= rows; i++)
        {
            if (i % 2 == 0)
            {
                int reverse = currentRow + counter - 1;
                for (int j = 0; j<i; j++)
                {
                    System.out.print(reverse--  +" ");
                    counter++;
                }
            }
            else
            {
                for (int j = 1; j<=i; j++)
                {
                    System.out.print(counter  +" ");
                    counter++;
                }
            }
            System.out.println();
            currentRow++;
        }
    }

    public static void pattern40(int rows)
    {
        int currentRow = 1;
        int counter = 1;
        System.out.println("** Printing the pattern40... **");
        for (int i=1; i<= rows; i++)
        {
            if (i % 2 == 0)
            {
                for (int j = 1; j<=i; j++)
                {
                    System.out.print(counter  +" ");
                    counter++;
                }
            }
            else
            {
                int reverse = currentRow + counter - 1;
                for (int j = 0; j<i; j++)
                {
                    System.out.print(reverse--  +" ");
                    counter++;
                }
            }
            System.out.println();
            currentRow++;
        }
    }

    public static void pattern41(int rows)
    {
        System.out.println("** Printing the pattern41... **");
        for (int i = rows; i >= 1; i--)
        {
            for (int j = rows; j >= 1+rows-i; j--)
            {
                System.out.print(j);
            }
            for (int j= i*2 ; j < rows*2-1; j++)
            {
                System.out.print(" ");
            }
            for (int l = 1+rows-i; l <=rows; l++)
            {
                if(l!=1)
                    System.out.print(l);
            }
            System.out.println();
        }
    }

    public static void pattern42(int rows)
    {
        System.out.println("** Printing the pattern42... **");
        for (int i = rows; i >= 1; i--)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j);
            }

            for (int j= i*2 ; j < rows*2-1; j++)
            {
                System.out.print(" ");
            }
            for (int l = i; l >= 1; l--)
            {
                if(l!=rows)
                    System.out.print(l);
            }
            System.out.println();
        }
    }

    public static void pattern43(int rows)
    {
        System.out.println("** Printing the pattern43... **");
        // Top Half
        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j + " ");
            }
            for (int k = i - 1; k >= 1; k--)
            {
                System.out.print(k + " ");
            }
            System.out.println();
        }

        // Bottom Half
        for (int i = rows-1; i >= 1; i--)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j + " ");
            }
            for (int k = i - 1; k >= 1; k--)
            {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }

    public static void pattern44(int rows)
    {
        System.out.println("** Printing the pattern44... **");
        // Top Half
        for (int i = 1; i <= rows; i++)
        {
            int temp = i;
            for (int j = 1; j <= i; j++)
            {
                System.out.print(temp + " ");
                temp = temp + 1;
            }
            temp = temp - 2;
            for (int k = i - 1; k >= 1; k--)
            {
                System.out.print(temp + " ");
                temp = temp - 1;
            }
            System.out.println();
        }

        // Bottom Half
        for (int i = rows - 1; i >= 1; i--)
        {
            int temp = i;
            for (int j = 1; j <= i; j++)
            {
                System.out.print(temp + " ");
                temp = temp + 1;
            }
            temp = temp - 2;
            for (int k = i - 1; k >= 1; k--)
            {
                System.out.print(temp + " ");
                temp = temp - 1;
            }
            System.out.println();
        }
    }

    public static void pattern45(int rows)
    {
        System.out.println("** Printing the pattern45... **");
        int temp = 1;
        for (int i = 1; i <= rows; i++)
        {
            for (int k = 1; k <= i; k++)
            {
                System.out.print(temp + " ");
            }
            temp++;
            System.out.println();
        }

        for (int i = rows - 1; i >= 1; i--)
        {
            for (int k = i; k >= 1; k--)
            {
                System.out.print(temp + " ");
            }
            temp++;
            System.out.println();
        }
    }

    public static void pattern46(int rows)
    {
        System.out.println("** Printing the pattern46... **");
        for (int i = 1; i <= rows; i++)
        {
            for (int k = i; k >= 1; k--)
            {
                System.out.print(k + " ");
            }
            for (int l = 2; l <= i; l++)
            {
                System.out.print(l + " ");
            }
            System.out.println();
        }

        for (int i = rows - 1; i >= 1; i--)
        {
            for (int k = i; k >= 1; k--)
            {
                System.out.print(k + " ");
            }
            for (int l = 2; l <= i; l++)
            {
                System.out.print(l + " ");
            }
            System.out.println();
        }
    }
    public static void pattern47(int rows)
    {
        System.out.println("** Printing the pattern47... **");
        for (int i = 1; i <= rows; i++)
        {
            for (int j = rows; j > i; j--)
            {
                System.out.print(" ");
            }
            int val1 = 1;
            for (int k = 1; k <= i; k++)
            {

                System.out.print(val1 + " ");
                val1 = val1 * 2;
            }
            val1 = val1 / 4;
            for (int l = i - 1; l >= 1; l--)
            {
                System.out.print(val1 + " ");
                val1 = val1 / 2;
            }
            System.out.println();
        }
    }

    public static void pattern48(int rows)
    {
        System.out.println("** Printing the pattern48... **");
        for (int i = rows; i >= 1; i--)
        {
            for (int j = i; j <= rows; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void pattern49(int rows)
    {
        System.out.println("** Printing the pattern49... **");
        int temp = 2;
        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                while (!isPrime(temp))
                {
                    temp++;
                }
                System.out.print(temp + " ");
                temp++;
            }
            System.out.println();
        }
    }

    public static boolean isPrime(int num) {
        boolean flag = false;
        for (int k = 2; k <= num / 2; k++) {

            if (num % k == 0) {
                flag = true;
                break;
            }
        }
        return !flag;
    }

    public static void pattern50(int rows)
    {
        System.out.println("** Printing the pattern50... **");
        System.out.println("0");
        for (int i = rows; i >= 1; i--)
        {
            for (int j = i; j <= rows; j++) { System.out.print(j); } System.out.print("0"); for (int k = rows; k >= i; k--)
        {
            System.out.print(k);
        }
            System.out.println();
        }
    }

    public static void pattern51(int rows)
    {
        System.out.println("** Printing the pattern51... **");
        int temp = 1;
        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(temp + " ");
                temp++;
            }
            int temp1 = temp - 1;
            for (int k = 2; k <= i; k++)
            {
                System.out.print(--temp1 + " ");
            }
            System.out.println();
        }
    }

    public static void pattern52(int rows)
    {
        System.out.println("** Printing the pattern52... **");
        int temp = 1;
        for (int i = 1; i <= rows; i++) { for (int l = rows; l > i; l--)
        {
            System.out.print(" ");
        }
            for (int j = 1; j <= i; j++)
            {
                System.out.print(temp + " ");
                temp++;
            }
            int temp1 = temp - 1;
            for (int k = 2; k <= i; k++)
            {
                System.out.print(--temp1 + " ");
            }
            System.out.println();
        }
    }

    public static void pattern53(int rows)
    {
        int temp = 1;
        System.out.println("** Printing the pattern53... **");

        for (int i = 1; i <= rows; i++) { for (int l = rows; l > i; l--)
        {
            System.out.print(" ");
        }
            for (int j = 1; j <= (i * 2 - 1); j++)
            {
                System.out.print((int) Math.pow(temp, 2) + " ");
                temp++;
            }
            System.out.println();
        }
    }

    public static void pattern54(int rows)
    {
        System.out.println("** Printing the pattern54... **");
        int temp = 1;
        for (int i = 1; i <= rows; i++) { for (int l = rows; l > i; l--)
        {
            System.out.print(" ");
        }
            for (int j = 1; j <= i; j++)
            {
                if (temp >= 10) {
                    temp = 0;
                }
                System.out.print(temp + " ");
                temp++;
            }
            int temp1 = temp - 1;
            for (int k = 2; k <= i; k++)
            {
                if (temp1 == 0)
                {
                    temp1 = 10;
                }
                System.out.print(--temp1 + " ");
            }
            System.out.println();
        }
    }

    public static void pattern55(int rows)
    {
        int currentRow = 1;
        int counter = 1;
        System.out.println("** Printing the pattern55... **");
        for (int i = 1; i <= rows; i++) { for (int l = rows; l > i; l--)
        {
            System.out.print(" ");
        }
            if (i % 2 == 0)
            {
                int reverse = currentRow + counter - 1;
                for (int j = 0; j < i; j++)
                {
                    System.out.print(reverse-- + " ");
                    counter++;
                }
            } else
            {
                for (int j = 1; j <= i; j++)
                {
                    System.out.print(counter + " ");
                    counter++;
                }
            }
            System.out.println();
            currentRow++;
        }
    }

    public static void pattern56(int rows)
    {
        System.out.println("** Printing the pattern56... **");
        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print((int) Math.pow(j, i) + " ");
            }
            System.out.println();
        }
    }

    public static void pattern57(int rows)
    {
        System.out.println("** Printing the pattern57... **");
        for (int i = 0; i < rows; i++)
        {
            int num = 1;
            for (int j = 0; j <= i; j++)
            {
                if(i ==0 || j ==0)
                    num = 1;
                else
                    num = num * (i - j + 1)/ j;
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void pattern58(int rows)
    {
        System.out.println("** Printing the pattern58... **");
        for (int i = 0; i <= rows; i++)
        {
            int x = 0;
            int y = 1;
            System.out.print(y+" ");
            for (int j = 0; j < i; j++)
            {
                int z = x + y;
                System.out.print(z + " ");
                x = y;
                y = z;
            }
            System.out.println();
        }
    }

    public static void pattern59() {
        System.out.println("** Printing the pattern59... **");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern60()
    {
        System.out.println("** Printing the pattern60... **");
        int start = 8;
        for(int i=2; i<=4; i++)
        {
            int temp = start;
            for(int j=1; j<=i; j++)
            {
                System.out.print(temp+" ");
                temp = temp *10;
            }
            System.out.println();
            start = start + 4;
        }
    }

    public static void pattern61(){
        System.out.println("** Printing the pattern61... **");
        int j, n=5, k = 0;

        for (int i = 1; i <= n; i++)
        {
            if (i % 2 != 0)
            {
                for (j = k + 1; j < k + i; j++)
                {
                    System.out.print(j + "*");
                }
                System.out.println(j++);
                k = j;
            }

            else
            {
                k = k + i - 1;
                for (j = k; j > k - i + 1; j--)
                {
                    System.out.print(j + "*");
                }
                System.out.println(j);
            }
        }
    }

    public static void pattern62(){
        System.out.println("** Printing the pattern62... **");
        for (int i=1; i<=5;i++)
        {
            int c = 0;
            int a = 0;
            int b = 1;

            for(int j=1; j<=i; j++)
            {
                c = a + b;
                System.out.print(c+" ");
                a = b;
                b = c;
            }
            if (i!=1)
                System.out.print(a + c);
            System.out.println();
        }
    }

}
