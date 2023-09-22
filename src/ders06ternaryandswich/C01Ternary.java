package ders06ternaryandswich;

import java.util.Scanner;

public class C01Ternary {
    // kullanicidan bir sayi alin
    // sayi pozitif ise sayinin iki katini degise sayiya on ekleyin ve yazdirin
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi= scan.nextInt();
        if(sayi>0) {
            System.out.println("sayinin iki kati:" +(sayi*2));
        } else {
            System.out.println("Sayinin 10 faslasi"+(sayi+10));
        }
        System.out.println(sayi>0 ? sayi*2 : sayi+10);

    }
}
