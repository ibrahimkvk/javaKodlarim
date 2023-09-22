package ders018_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C06_KullaniciyaArrayOlusturma {
    public static void main(String[] args) {
        // Soru 5- Kullanicidan array’in boyutunu
        // ve elementlerini alip array’i olusturan
        // ve bize donduren bir method olusturun.
        int[]kullaniciArrayi=arrayOlustur();
        System.out.println(Arrays.toString(kullaniciArrayi));

    }
   public static int[] arrayOlustur() {
        Scanner scan =new Scanner(System.in);
       System.out.println("Olustulacak array in boyutunu giriniz");
       int uzunluk=scan.nextInt();
       int [] kullaniciArrayi=new int[uzunluk];
       for (int i = 0; i <uzunluk ; i++) {
           System.out.println("Olusturulacak Array in elemanlarini giriniz");
           kullaniciArrayi[i]= scan.nextInt();

       } return kullaniciArrayi;
   }

    }
