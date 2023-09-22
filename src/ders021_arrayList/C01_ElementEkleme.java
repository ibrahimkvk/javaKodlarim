package ders021_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C01_ElementEkleme {
    public static void main(String[] args) {

        List<Integer> sayilar= new ArrayList<>();
        System.out.println(sayilar);

        sayilar.add(10);
        System.out.println(sayilar);
        sayilar.add(20);
        System.out.println(sayilar);
        sayilar.add(0,5);
        System.out.println(sayilar);
        List<Integer> eklenecekListe=new ArrayList<>();
        eklenecekListe.add(5);
        eklenecekListe.add(4);
        eklenecekListe.add(23);
        eklenecekListe.add(1);
        sayilar.addAll(eklenecekListe);
        System.out.println(sayilar);// sayialr basindaki 5 ten sonra eklenecek listeye ekleyin
        sayilar.addAll(1,eklenecekListe);
        System.out.println(sayilar);
    }
}
