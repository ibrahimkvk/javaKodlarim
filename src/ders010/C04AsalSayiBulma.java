package ders010;

import java.util.Scanner;

public class C04AsalSayiBulma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("bir sayi giriniz asal mi bakalim:  ");
        int sayi = scan.nextInt();
        int bayrak = 0;
        for (int i = 2; i <= sayi - 1; i++) {
            if (sayi % i == 0) {
                bayrak++;
                break;
            }
        }
        System.out.println(bayrak);
        if (bayrak == 0) {
            System.out.println("girdininiz sayi asal sayi");
        } else {
            System.out.println("girdigin sayi asal degil beya");
        }
    }
}
