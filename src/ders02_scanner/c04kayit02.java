package ders02_scanner;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class c04kayit02 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Adinizi giriniz: ");
        char ilkharf=scan.next().charAt(0);
        System.out.print("Soyadinizi giriniz: ");
        String soyad= scan.next();
        System.out.print("Yasinizi giriniz:");
        int yas= scan.nextInt();
        System.out.println("Girilen bilgiler :"+ilkharf +". " +soyad+ ", " +yas );
    }
}
