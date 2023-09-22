package ders09;

public class C01NullPointer {
    public static void main(String[] args) {
        String str1="";
        System.out.println(str1);
        String str2="     ";
        System.out.println(str2);
        String str3;
        //System.out.println(str3);//deger atamasi yapmadigi icin yazdiramaz
      //  System.out.println(str3.concat("Java"));// deger atanmadigi icin sonuna bir sey eklenmiyor
        String str4=null;
       // System.out.println(str4);
       // System.out.println(str4.concat("live"));
        System.out.println(str4+"ibrahim");
    }
}
