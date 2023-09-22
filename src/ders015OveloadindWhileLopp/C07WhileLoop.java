package ders015OveloadindWhileLopp;

import java.util.Scanner;

public class C07WhileLoop {
    // Soru 5- Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin.
    // While loop kullanarak verilen sayinin istenen ussunu hesaplayip yazdiran bir method olusturun.
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int sayi=6;
        int ussu=5;
        usHesaplama(sayi,ussu);


        } public static void usHesaplama(int sayi,int ussu) {
        int sonuc=1;
        while (ussu >0) {
            sonuc*=sayi;
            ussu--;
        }
        System.out.println(sonuc);
    }

    }

