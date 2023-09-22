package ders05_ifstatement;

import java.util.Scanner;

public class c02aayy {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir ay giriniz: ");
        char ilk=scan.next().charAt(0);
        if(ilk=='o' || ilk=='O') {
            System.out.println("OCAK");
        }if(ilk=='s' || ilk=='S') {
            System.out.println("SUBAT");
        }if(ilk=='M' || ilk=='m') {
            System.out.println("MART VE MAYIS");
        }if(ilk=='n' || ilk=='N') {
            System.out.println("NISAN");
        }if(ilk=='H' || ilk=='h') {
            System.out.println("HAZIRAN");
        }if(ilk=='t' || ilk=='T') {
            System.out.println("TEMMUZ");
        }if(ilk=='A' || ilk=='a') {
            System.out.println("AGUSTOS VE ARALIK");
        }if(ilk=='K' || ilk=='k') {
            System.out.println("KASIM");
        }if(ilk=='E' || ilk=='e') {
            System.out.println("EYLUL VE EKIM");
        }

    }
}
