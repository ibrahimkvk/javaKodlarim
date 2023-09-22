package ders014MethodOlusturma;

public class C04Tekrar {

    // bu iki sayinin carpim sonucunu yeni kod yazmadan konsola yazdirin
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println(C01Carpim.carpimMethodu(a,b));
        String c="hadi";
        String d="hayirlisi";
        System.out.println(C02StringConcate.birlestir(c,d));
        String e="azmet ve basar!";
        System.out.println(C03stringTersCevirme.tersi(e));
    }

}
