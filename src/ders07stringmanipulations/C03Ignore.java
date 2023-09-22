package ders07stringmanipulations;

public class C03Ignore {
    public static void main(String[] args) {
        String str1="Ali";
        String str2="ali";
        String str3="ALI";
        System.out.println(str1.equals(str2));//false
        System.out.println(str1.equals(str3));//false
        System.out.println(str2.equals(str3));//false
        System.out.println(str1.equalsIgnoreCase(str2));//true
        System.out.println(str2.equalsIgnoreCase(str3));//true
        System.out.println(str1.equalsIgnoreCase(str3));//true

    }


}
