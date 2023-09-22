package ders02_scanner;

import java.util.Scanner;

public class c02dikdortgenalan {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Lutfen dikdortgenin boyunu giriniz: ");
        double boy= scan.nextDouble();
        System.out.print("Lutfen dikdortgenin enini giriniz: ");
        double en= scan.nextDouble();
        System.out.println("Dikdortgenin alani:  "  +(boy*en));
    }
}
