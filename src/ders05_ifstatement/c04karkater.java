package ders05_ifstatement;

import java.util.Scanner;

public class c04karkater {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz:");
        char krk=scan.next().charAt(0);
        if (krk>='A' && krk<='Z') {
            System.out.println("girilen karakter buyuk harf");
        }
        else {
            System.out.println("girilen karakter buyuk harf degil");
        }
    }
}
