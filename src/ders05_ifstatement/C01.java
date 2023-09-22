package ders05_ifstatement;

import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen iki sayi giriniz; ");
        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();
        if(sayi1>100) {
            System.out.println("ilk sayi 100 den buyuk ");
        }
        if (0==sayi2%10) {
            System.out.println("2. sayi cift sayi");
        }
        if(sayi1>sayi2) {
            System.out.println("1. sayi 2. sayidan buyuktur");
        }

    }
}
