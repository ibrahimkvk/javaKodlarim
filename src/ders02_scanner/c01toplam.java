package ders02_scanner;

import java.util.Scanner;

public class c01toplam {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen bir tam sayi giriniz:  ");
        int a= scan.nextInt();
        System.out.print("lutfen kesirli sayi giriniz:  ");
        double b= scan.nextDouble();
        System.out.println("sayilarin carpimi: " +(a*b));
        System.out.println("sayilarin toplami: " +(a+b));
    }

}
