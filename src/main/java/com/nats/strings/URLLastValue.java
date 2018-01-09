package com.nats.strings;

/**
 * Created by nataraja.maruthi on 1/7/18.
 */
public class URLLastValue {
    public static void main(String[] args) {
        String url = "http://getIndiaCitiesPin/state/city";
        System.out.println(url.substring(url.lastIndexOf("/")+1,url.length()));
        String str = "i can seae the world with your eyes";
        System.out.println(str.split("e").length-1);
        System.out.println(str.length()-str.replaceAll("e","").length());
    }
}
