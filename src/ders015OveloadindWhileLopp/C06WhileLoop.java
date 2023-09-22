package ders015OveloadindWhileLopp;

import java.util.Scanner;

public class C06WhileLoop {
    /*
        Soru : Kullanicidan sifre isteyin asagidaki sartlari saglamayan sifrelerde hatalari yazdirip,
        kullanicinin yeni sifre girmesi isteyin
        Gecerli bir sifre yazilincaya kadar bu islemi tekrar edin
        gecerli sifre yazilinca “sifreniz basari ile kaydedildi” yazdirin
        sartlar :
        - sifrenin ilk karakteri kucuk harf olmali
        - sifrenin son karakteri sayi olmali
        - sifre en az 8 basamkli olmali
         */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String sifre="";
        boolean gecerliSifre=false;
        int bayrak=0;

        while (gecerliSifre!=true) {
            System.out.println("lutfen sifresini giriniz:  ");
            sifre= scan.nextLine();

              if (!(sifre.charAt(0)>='a' && sifre.charAt(0)<='z')) {
                System.out.println("sifrenin ilk harfi kucuk harfli olmali");
                bayrak++;

            } if (!(sifre.charAt(sifre.length()-1)>='1' && sifre.charAt(sifre.length()-1)<='9')) {
                System.out.println("sifrenin son harfi sayi olmali;");
                bayrak++;

            } if(sifre.length()<8) {
                System.out.println("sifre en az 8 karakter olmali:" );
                bayrak++;

            } if (bayrak==0) {
                System.out.println("sifreniz basariyla kaydedildi ");
                gecerliSifre=true;

        }

        }

    }
}