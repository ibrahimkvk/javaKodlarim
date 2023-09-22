package ders04;

import java.util.Scanner;

public class c03rakamlartoplami {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen 4 basamakli bir sayi giriniz: ");
        int sayi= scan.nextInt();
        int toplam=0;
        toplam=sayi%10;// sayi 1453 toplamda 3 var
        sayi=sayi/10;// sayi da 145 var
        toplam=toplam+sayi%10;// toplamda 3+5=8 var
        sayi=sayi/10;// sayi 14 oldu
        toplam=toplam+sayi%10;// toplamda 8+4=12 var
        sayi=sayi/10;// sayi  1 oldu
        toplam=(toplam+sayi);
        System.out.println("Girilen sayinin rakamlar toplami: "+toplam);
    }
}
