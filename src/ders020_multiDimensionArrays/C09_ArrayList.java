package ders020_multiDimensionArrays;

import ders018_arrays.C04_ArrayElementleriniToplama;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C09_ArrayList {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        C04_ArrayElementleriniToplama abc=new C04_ArrayElementleriniToplama();

        List<Integer> sayilar=new ArrayList<>();
        // list primitive data turu kabul etmez
        // list bir interface oldugu icin direk obje olusturulamaz
        // onun yerine sag tarfa ArrayList yazariz
        sayilar.add (4);
        sayilar.add (5);
        System.out.println(sayilar);
    }



}
