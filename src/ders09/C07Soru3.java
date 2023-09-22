package ders09;

import java.util.Scanner;

public class C07Soru3 {
    public static void main(String[] args) {
        // Soru 4 : Kullanicidan bir sifre isteyip,
        // asagidaki sartlari kontrol edin ve
        // kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        // eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin
        // - ilk harf kucuk harf olmali
        // - son karakter rakam olmali
        // - sifre bosluk icermemeli
        // - uzunlugu en az 10 karakter olmali
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen sifrenizi giriniz");
        String sifre=scan.nextLine();
        int a=0;
        if (!(sifre.length()>=10)) {
            System.out.println("lutfen  sifrenizde en az 10 karakter olsun");
            a++;
        }
        if (sifre.contains(" ")) {
            System.out.println("Lutfen sifrenizde bosluk olmasin");
            a++;
        }
        if (!(sifre.charAt(0)>'a' && sifre.charAt(0)<'z')) {
            System.out.println("Lutfen sifrenizin ilk harfi kucuk yazin");
            a++;
        }
        if (!(sifre.charAt(sifre.length()-1) >='0' && sifre.charAt(sifre.length()-1)<='9')) {
            System.out.println("Lutfen sifrenizin son u rakam ile bitsin");
            a++;
        }
        if (a==0) {
            System.out.println("sifreniz basari ile kaydedilmistir...");
        }
    }
}
