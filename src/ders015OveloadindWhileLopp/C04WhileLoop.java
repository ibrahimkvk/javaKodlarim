package ders015OveloadindWhileLopp;

import java.util.Scanner;

public class C04WhileLoop {
    //kullanicidan toplaamak uzere sayilar alin
    //kullanici 0 i girgignde sayi alma islemi dursun
    //kullanicidan kac sayi aldini ve sayilarin toplamimi bulun;
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
         int girilenSayi=5;
         int sayac=0;
         int toplam=0;
         while (girilenSayi!=0) {
            System.out.println("lufen tamsayilar girin.Bu islem sifir girinceye kadar devam etsin ");
             girilenSayi= scan.nextInt();
             sayac++;
             toplam=toplam+girilenSayi;


         }
        System.out.println("Girilen " + sayac +" adet sayinin toplami "+toplam+"  olur ");
        }

    }

