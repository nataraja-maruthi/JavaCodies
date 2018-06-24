package com.nats.strings;

/**
 * Created by nataraja.maruthi on 1/26/18.
 */
public class StringEvaluateExpression {

    public static void main(String[] args) {
        System.out.println("Done");
        String expr = "123+22-3+44";
        int result = 0;
        int num  = 0;
        int digit = 10;
        char operand = '+';
        for (int i = 0; i < expr.length(); i++) {
            char c = expr.charAt(i);
            if (c-'0'>=0 && c-'0'<=9) {
                num = (num *digit) + c-'0' ;
            } else {
                result = evaluate(result,c,num);
                num = 0;
            }
        }

        System.out.println(result);
    }

    private static int evaluate(int result, char c, int num) {
        switch (c) {
            case '+' : return  result+num;
            case '-' : return  result-num;
            case '*' : return  result*num;
            case '/' : return  result/num;
            default:return result;
        }
    }


}
