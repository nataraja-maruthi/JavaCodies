package com.nats.numbers;

/**
 * Created by nataraja.maruthi on 9/1/17.
 */
public class Palindrome {

    public static void main(String[] args) {
        System.out.println(1%10);
        int number = 1221;
        System.out.println(isPalindrome(number));
        System.out.println(isPalindromeFinal(number));
    }

    public static boolean isPalindrome(int number) {
        int result = 0;
        int givenNumber = number;
        while (number>0) {
            int rem = number%10;
            result = result*10+rem;
            number = number/10;
        }
        return givenNumber==result;
    }

    public static boolean isPalindromeFinal(int number) {
        if (number < 0 || (number % 10 == 0 && number != 0)) {
            return false;
        }
        int reverseNum=0;
        while (number>reverseNum) {
            reverseNum = reverseNum *10 + number%10;
            number = number/10;
        }

        return number==reverseNum || number == reverseNum/10;

    }


}