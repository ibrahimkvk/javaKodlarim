package ders09;

import java.util.Scanner;

public class C06Soru2 {
    public static void main(String[] args) {
        // Soru 5 : Kullanicidan isim ve soyismini ayri ayri alin.
        //	- ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde yazdirin
        //	- esit veya soyisim daha uzun ise
        //    ismi ilk harf buyuk digerleri kucuk, soyismi buyuk harflerle yazdirin.
        Scanner scan =new Scanner((System.in));
        System.out.println("lutfen isminizi giriniz");
        String isim=scan.nextLine();
        String soyisim=scan.nextLine();
        String yazilacak;
        if (isim.length()>soyisim.length()) {
              yazilacak=isim.substring(0,1).toUpperCase()
                              +isim.substring(1).toLowerCase() +" "
                              +soyisim.substring(0,1).toUpperCase()
                              + soyisim.substring(1).toLowerCase();
            System.out.println(yazilacak);
        } else  {
            yazilacak =isim.substring(0,1).toUpperCase()
                    +isim.substring(1).toLowerCase() +" "
                    +soyisim.toUpperCase();
            System.out.println(yazilacak);

        }
    }
}
