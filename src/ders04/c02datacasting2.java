package ders04;

import java.util.Scanner;

public class c02datacasting2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen iki tam sayi giriniz;");
        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();
        double bolum=((double)sayi1/(double)sayi2);
        System.out.println("bolumun sonucu double oluyor:"+bolum);
    }
}
