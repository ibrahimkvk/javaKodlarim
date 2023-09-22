package ders05_ifstatement;

import java.util.Scanner;

public class C03eskenarucgen {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir ucgenin kenar uzunlarini giriniz: ");
        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();
        double kenar3= scan.nextDouble();
        if (kenar1<=0 || kenar2<=0 || kenar3<=0) {
            System.out.println("Gecersiz giris...");
        }
         else if (kenar1==kenar2 && kenar1==kenar3) {
            System.out.println("girilen ucgen eskenar ucgen");
        }
        else {
            System.out.println("girilen ucgen eskenar ucgen degil");
        }
    }
}
