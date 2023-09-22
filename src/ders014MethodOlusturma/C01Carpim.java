package ders014MethodOlusturma;

import java.util.Scanner;

public class C01Carpim {
    // main method icerisinde kullanicidan iki sayi alin
    // bu iki sayiyi parametre olarak kabul edip, carpimlarini main method'a döndüren bir method olusturun
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen iki sayi giriniz:  ");
        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();
        System.out.println(carpimMethodu(sayi1,sayi2));
        double sonuc=carpimMethodu(8,2);
        System.out.println(sonuc);
    }
        public static double carpimMethodu (double sayi1, double sayi2) {
        System.out.println("carpim metodu calisti mi");
        return sayi1*sayi2;
    }
}
