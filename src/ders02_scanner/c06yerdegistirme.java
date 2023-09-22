package ders02_scanner;

import java.util.Scanner;

public class c06yerdegistirme {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Lutfen 1. sayiyi  giriniz:");
        int sayi1= scan.nextInt();
        System.out.print("Lutfen 2.sayiyi giriniz: ");
        int sayi2= scan.nextInt();//a=10 b=20
        sayi1=sayi1+sayi2;//a=30 b=20
        sayi2=sayi1-sayi2;//a=30 b=10
        sayi1=sayi1-sayi2;//a=20 b=10
        System.out.print("degiskenler degistirildi..."+ "\n 1. sayi: "+sayi1 +"\n 2.sayi: "+sayi2);

    }
}
