package com.nats.numbers;

/**
 * Created by nataraja.maruthi on 1/13/18.
 */
public class FindKthCharacterAfterNIteration {
    public static void main(String[] args) {
        int m = 11,n=6,k=4;
        System.out.println(func(m,k,n));
        int binary = 0;
        while (m>0) {
            int rem = m%2;
            binary = binary*10+rem;
            m = m/2;
        }
        String str = new StringBuffer(String.valueOf(binary)).reverse().toString();
        for (int i=0;i<n;i++){
            char[] chars = str.toCharArray();
            StringBuffer stringBuffer = new StringBuffer();
            for (int j = 0;j<chars.length;j++) {
                if (chars[j]==48) {
                    stringBuffer.append("01");
                } else {
                    stringBuffer.append("10");
                }
            }
            str = stringBuffer.toString();
        }
        System.out.println(str.charAt(k));
    }

    static char func(int m, int k, int n){
        String binary = toBin(m);
        String result = new String();
        int itr = 0;
        while(itr<n){
            for(int i = 0; i<binary.length();i++){
                if(binary.charAt(i)== '0')
                    result = result + "01";
                else
                    result = result + "10";
            }
            binary = result;
            result = "";
            itr++ ;
        }
        return binary.charAt(k);
    }
    static String toBin(int m){
        String binary = new String();
        while(m!=1){
            binary = m%2 + binary;
            m = m/2;
        }
        binary = "1" + binary;
        return binary;
    }
}
