package com.company;

public class Atoi {

    public static void main(String[] args){
        
    }

    private static int convert(String s) {
        s = s.trim();
        char[] c = s.toCharArray();
        if((c[0] != '+') && (c[0] != '-') && (c[0] >'9' || c[0] <'0')){
            return 0;
        }
    int i = 0, sign = 1;
    if(c[i] == '-'){
        sign = -1;
        i++;
    }
    else if(c[i] == '+'){
        sign = 1;
        i++;
    }
    int sum = 0;
    int mul = 1;
    for(int j = c.length-1;j>=i;j--){
        if(c[j] >'9' || c[j] <'0'){
            j--;
            continue;
        }
        c[j]= (char) Character.getNumericValue(c[j]);
        sum = sum + c[j] * mul;
        mul = mul * 10;
    }
    sum =  sum * sign;
    if(sum > Integer.MAX_VALUE){
        return Integer.MAX_VALUE;
    }
    else if(sum<Integer.MIN_VALUE){
        return Integer.MIN_VALUE;
    }
    return sum;
    }
}
