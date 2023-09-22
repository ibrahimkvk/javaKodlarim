package ders010;

import java.util.Scanner;

public class C02Faktoriyel {
    public static void main(String[] args) {
        //kullanicinin verdigi sayinin faktoriyelini bulalim
       // Scanner scan = new Scanner(System.in);
       // System.out.print("bir sayi giriniz: ");
       // int sayi = scan.nextInt();
       // int faktoriyel = 1;
       // for (int i=sayi; i>0; i--) {
       //     faktoriyel=faktoriyel*i;
       // }
       // System.out.println(sayi+" sayisinin  faktoriyeli:  " +faktoriyel);
        // 1de 100e kadar olan sayilarin toplamini bul
        int tplm=0;
        for (int i=0;i<100; i++) {
            tplm=tplm+i;
            System.out.println(tplm);
        }
        System.out.println(tplm);
    }
}