package ders015OveloadindWhileLopp;

import java.util.Scanner;

public class C05WhileLoop {

    /*
          Kullanicidan toplanmak uzere sayi alin
          sayilarin toplami 500'e esit olur veya gecerse
          girilen sayi adedi,
          girilen sayilarin toplamini ve
          "Bu kadar yeter" yazdirin
         */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int girsay=4;
        int sayac=0;
        int tplm=0;
        while (tplm<=500) {
            System.out.print("Lutfen toplanmasi icin sayilar alalim   ");
            girsay=scan.nextInt();
            tplm+=girsay;
            sayac++;
        }
        System.out.println("girilen " + sayac+" adet  sayinin toplami " +tplm+ "   bu kadar yeter...");
    }
}
