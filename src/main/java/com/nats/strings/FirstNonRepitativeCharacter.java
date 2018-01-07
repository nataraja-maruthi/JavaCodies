package com.nats.strings;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by nataraja.maruthi on 1/6/18.
 */
public class FirstNonRepitativeCharacter {
    public static void main(String[] args) {
        String str = "ataraja";
        Map<Character,Integer> map = new HashMap();
        for (int i=0;i<str.length();i++)
        {
           if (map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
           } else {
               map.put(str.charAt(i),1);
           }
        }

        for (int i=0;i<str.length();i++)
        {
            if (map.get(str.charAt(i))==1) {
                System.out.println("char is : " + str.charAt(i));
                break;
            }
        }

    }
}
