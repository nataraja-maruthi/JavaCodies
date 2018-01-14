package com.nats.strings;

/**
 * Created by nataraja.maruthi on 1/7/18.
 */
public class CheckPolindromeCanForm {
    public static void main(String[] args) {
        String str = "aaabbbcc";
        char[] array = new char[256];
        for (int i=0;i<str.length();i++) {
            array[str.charAt(i)]++;
        }
        int odd = 0;
        for (int j = 0;j<array.length;j++) {
            if (array[j]%2==1) {
                odd++;
            }
            if (odd>1) {
                System.out.println("can't form");
                return;
            }
        }
        System.out.println("can form ");
    }
}
