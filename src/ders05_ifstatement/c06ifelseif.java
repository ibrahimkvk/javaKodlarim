package ders05_ifstatement;

import java.util.Scanner;

public class c06ifelseif {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen  pozitif bir tam sayi giriniz   ");
        int sayi = scan.nextInt();
        if (sayi<0) {
            System.out.println("Gecersiz giris....");
        }
        else if (sayi<10) {
            System.out.println("Girilen sayi bir rakam");
        }
        else  if (sayi<100) {
            System.out.println("Girilen sayi iki basamakli bir sayi");
        }
        else {
            System.out.println("Girilen sayi buyuk bir sayi");
    }
}}
