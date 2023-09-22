package ders05_ifstatement;

import java.util.Scanner;

public class c013nested {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz: ");
        int sayi=scan.nextInt();
        if (1==sayi%2  || -1==sayi%2) {
            if (sayi<0 ) {
                System.out.println("girilen sayi negatif tek sayidir");
            } else if (sayi>0) {
                System.out.println("Girilen sayi pozitif tek sayidir");
            }

        } else if (0==sayi%2)  {
            if (0==sayi%10) {
                System.out.println( "Girilen  10 un kati bir tam sayi");
            } else if(0!=sayi%10) {
                System.out.println("Girilen sayi 10 unkati DEGILDIR..");
            }
        }

    }
}
