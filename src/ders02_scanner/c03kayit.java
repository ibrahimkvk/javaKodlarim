package ders02_scanner;

import java.util.Scanner;

public class c03kayit {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen adinizi giriniz: ");
        String isim=scan.nextLine();
        System.out.print("Lutfen soyadinizi giriniz:  ");
        String soyad=scan.nextLine();
        System.out.print("Lutfen yasinizi giriniz:  ");
        int yas= scan.nextInt();
        System.out.println("*************************");
        System.out.println("Adiniz: " +isim+ "\nSoyadiniz: " +soyad+ "\nYasiniz: " +yas
                +"\nKaydiniz basriyla kaydedildi...");
    }
}
