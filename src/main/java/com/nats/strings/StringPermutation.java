package com.nats.strings;

public class StringPermutation {
	
	
	public static void main(String[] args) {
//		permutation("ABC",0,2);
		permutation2("", "ABC");
	}
	
	private static void permutation2(String prefix,String string) {
		int n = string.length();
		if (n==0) {
			System.out.println(prefix);
		} else {
			for (int i = 0; i < string.length(); i++) {
				permutation2(prefix+string.charAt(i), string.substring(0,i)+string.substring(i+1,n));
			}
		}
		
	}

	private static void permutation(String str, int l, int r)
    {
        if (l == r)
            System.out.println(str);
        else
        {
            for (int i = l; i <= r; i++)
            {
                str = swap(str,l,i);
                permutation(str, l+1, r);               
            }
        }
    }

	public static String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

}
