package com.nats.numbers;

import java.util.Arrays;

public class nextGreater 
{
    
 
    public static void main(String[] args) 
    {
        char digits[] = { '5','3','4','9','7','6' };
        int n = digits.length;
        findNext(digits, n);
    }

	private static void findNext(char[] digits, int n) {
		int i;
		for ( i = n-1; i >0; i--) {
			if (digits[i]>digits[i-1]) {
				break;
			}
		}
		if (i==0) {
			System.out.println("This is the biggest num, No new biggest num possible");
		} else {
			int x = digits[i-1], min = i;
			for (int j = i+1; j < digits.length; j++) {
				if (digits[j]<digits[min] && digits[j]>x) {
					min=j;
				}
			}
			swap(digits,i-1,min);
			Arrays.sort(digits,i,n);
			System.out.print("Next number with same" +
                    " set of digits is ");
			for (i = 0; i < n; i++)
			System.out.print(digits[i]);
		}
		
	}

	private static void swap(char[] digits, int i, int min) {
		char temp = digits[i];
		digits[i] = digits[min];
		digits[min] = temp;
	}
}