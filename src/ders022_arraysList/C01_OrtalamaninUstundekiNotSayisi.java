package ders022_arraysList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01_OrtalamaninUstundekiNotSayisi {

    public static void main(String[] args) {
        // Ogretmenden ogrenci notlarini alip bir list olusturun
        // ogretmen 100'den buyuk bir sayi girip, bitirdiginde
        // sinif sayisini, sinif ortalamasini ve kac kisinin ortalamanin ustunde not aldigini yazdirin
        listeOlustur();


    }

    public static List<Double> listeOlustur () {

        Scanner scan=new Scanner(System.in);

        List<Double> notlar=new ArrayList<>();

        Double ogrnciNotlar=5.0;
        int sayac=0;
        double ort=0;
        double ogreniNotTplm=0;


        while (ogrnciNotlar<=100) {



            System.out.println("lutfen ogrenci notlarini giriniz " +
                    "\n100 den buyuk sayi girdiginizde islem bitsin");

            ogrnciNotlar=scan.nextDouble();

            if(ogrnciNotlar<=100) {
                notlar.add(ogrnciNotlar);
                sayac++;
                ogreniNotTplm+=ogrnciNotlar;
                ort=ogreniNotTplm/sayac;
            }

        }
        System.out.println(notlar);
        System.out.println("ogrenci sayisi:  " +sayac);
        System.out.println("notlarin ortalamasi:  " +ort);
        return notlar;


    }

}
