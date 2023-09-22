package ders04;

import java.util.Scanner;

public class c01datasacating {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz:");
        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();
        int bolum=(int)(sayi1/sayi2);
        System.out.println("Sayilarin bolumu:"+bolum);
    }
}
