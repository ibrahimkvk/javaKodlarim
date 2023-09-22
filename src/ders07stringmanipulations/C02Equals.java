package ders07stringmanipulations;

public class C02Equals {
    public static void main(String[] args) {
        String str1="Ali";
        String str2="ali";
        String str3= new String("ali");
        String str4="Ali";
        System.out.println(str1==str2);
        System.out.println(str1==str4);
        System.out.println(str2==str3);
        System.out.println(str1.equals(str2));// false
        System.out.println(str3.equals(str4));//false
        System.out.println(str1.equals(str4));//true
        System.out.println(str2.equals(str3));//true

    }
}
