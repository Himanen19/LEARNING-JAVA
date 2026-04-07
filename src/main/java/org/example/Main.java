package org.example;


import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

           System.out.println(getEvenDigitSum(2000));
    }


    public static boolean isPalindrome (int number) {
        int reverse = 0;
        int xnumber = number;
        while (reverse < number) {
            if(xnumber == 10 ) {
              return false;
            }
            else { reverse += xnumber % 10;
            }
            xnumber = xnumber / 10;
            if(reverse < number) {
                reverse *= 10;
            }

        }

return reverse == number ;
    }
 public static int getEvenDigitSum(int number) {

        if(number < 0) {
            return -1;
        }
        int lastDigit = number;
         int total = 0;
        while(lastDigit > 0) {
            int lastD = lastDigit % 10;
            if(lastD % 2 == 0) {
            total += lastD; }
            lastDigit /= 10;
        }
        return total;
 }

}


