package ders03_dataCasting;

import java.util.Scanner;

public class c02datacasting {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str1="123";
        String str2="45";
        System.out.println(Integer.parseInt(str1)+ Integer.parseInt(str2));
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MAX_EXPONENT);
        System.out.println(Long.MIN_VALUE);
    }
}
