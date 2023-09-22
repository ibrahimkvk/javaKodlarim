package ders021_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C09_Fibonacci {
    public static void main(String[] args) {

        // kullanicidan pozitif bir tam sayi alip o tam sayidan
        // kucuk fibonacci sayilarini bir liste olarak kaydedin ve yazdirin
        // fibonacci sayilari o,1,1,2,3,5,8,13,21,34,55,89,144,........
        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen bir pozitif tam sayi giriniz:");

        int girilenSayi=scan.nextInt();

        if(girilenSayi<0) {
            System.out.println("Girdiginiz sayi sifirdan buyuk olmali");

        } else if(girilenSayi==0) {
            System.out.println("Sifirdan kucuk Fibonacci sayisi yoktur");

        } else if(girilenSayi==1) {
            System.out.println("Bir den kucuk fibonacci sayisisadece 0 dir");

        } else {
            fibonacciSayilariniYazdir(girilenSayi);
        }

    }

        public static void fibonacciSayilariniYazdir(int girilenSayi) {

            List<Integer> fibonacciSayilari=new ArrayList<>();

            fibonacciSayilari.add(0);
            fibonacciSayilari.add(1);
            fibonacciSayilari.add(1);

             int yeniFibonacciSayisi=0;

             int index=3;

             while(yeniFibonacciSayisi<girilenSayi) {

                 yeniFibonacciSayisi=fibonacciSayilari.get(index-2)+ fibonacciSayilari.get(index-1);

                 if(yeniFibonacciSayisi<girilenSayi){
                     fibonacciSayilari.add(yeniFibonacciSayisi);
                     index++;

                 }

             }
            System.out.println(fibonacciSayilari);


    }
}
