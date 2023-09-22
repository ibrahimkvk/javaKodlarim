package ders021_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_remove {
    public static void main(String[] args) {

        int[] arr ={2,4,6,5,8,5,9,12,32,45,32,6};

        List<Integer> sayilar=new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {

            sayilar.add(arr[i]);

        }
        sayilar.remove(4);
        System.out.println(sayilar);
        sayilar.remove(3);
        System.out.println(sayilar);





        // listemiz integer lardan olusuyorsa biz int bir deger
        // yazdigimizdan hep index kabul ettiginden istedigimiz elementi
        // obje olarak girip sildirmek icin onceden tanimlamamiz gerekir

        Integer silinecekSayi=45;
        sayilar.remove(silinecekSayi);
        System.out.println(sayilar);

        // tum 5 lerden kurtulmak istersek

        silinecekSayi=32;

        while ( sayilar.contains(silinecekSayi)) {
            sayilar.remove(silinecekSayi);
        }
        System.out.println(sayilar);

        silinecekSayi=33;
        System.out.println(sayilar.remove(silinecekSayi));

        sayilar.remove(0);
        System.out.println(sayilar);

        sayilar.clear();
        System.out.println(sayilar);

        List<String> sinif=new ArrayList<>();
        sinif.add("ibrahim");
        sinif.add("muzeyyen");
        sinif.add("sekere");
        sinif.add("rukiye");
        sinif.add("ali");
        System.out.println(sinif);


        List<String> silinecekIsim= new ArrayList<>();
        silinecekIsim.add("muzeyyen");
        silinecekIsim.add("ali");
        sinif.remove(silinecekIsim);
        System.out.println(silinecekIsim);

        System.out.println(sinif.equals(silinecekIsim));
    }
}