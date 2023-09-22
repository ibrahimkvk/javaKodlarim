package ders02_scanner;

import java.util.Scanner;

public class c05degistirme {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int sayi1= scan.nextInt();
        System.out.print("Bir sayi daha giriniz: ");
        int sayi2=scan.nextInt();
        System.out.println("1. sayi: " +sayi1 +"\n2. sayi: " +sayi2);
        int gecis=0;
        gecis=sayi2;
        sayi2=sayi1;
        sayi1=gecis;
        System.out.println("degistirilmis hali: \n1. sayi " + sayi1+"  \n2.sayi: " +sayi2);
    }
}
