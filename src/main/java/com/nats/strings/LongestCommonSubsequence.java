package com.nats.strings;

/**
 * Created by nataraja.maruthi on 1/14/18.
 */
public class LongestCommonSubsequence {

    public static void main(String[] args) {
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";
        System.out.println(lcs(s1,s2));
    }

    public static String lcs(String s1, String s2) {
        int l1= s1.length();
        int l2= s2.length();
        int arr[][] = new int[l1+1][l2+1];
        for (int i = l1-1;i>=0;i--) {
            for (int j=l2-1;j>=0;j--) {
                if (s1.charAt(i)==s2.charAt(j))
                    arr[i][j] = arr[i+1][j+1]+1;
                else
                    arr[i][j] = Math.max(arr[i+1][j],arr[i][j+1]);
            }
        }

        int i = 0,j=0;
        StringBuffer sb = new StringBuffer();
        while (i<l1 && j<l2) {
            if (s1.charAt(i)==s2.charAt(j)) {
                sb.append(s1.charAt(i));
                i++;j++;
            }
            else if(arr[i+1][j]>=arr[i][j+1]) {
                i++;
            } else {
                j++;
            }
        }
        return sb.toString();
    }
}
