package ders019_arrays;

import ders016doWhileLoop.C05;
import ders018_arrays.C03_ArrayElemetnleriniArtirme;
import ders018_arrays.C04_ArrayElementleriniToplama;
import ders018_arrays.C05_ArraydeElemanArama;
import ders018_arrays.C06_KullaniciyaArrayOlusturma;

import java.util.Arrays;

public class C03_MethodlariKullanma {
    public static void main(String[] args) {
        // verilen int bir arrain elemanlarini 2 artirin
        int[] arr={5,2,7,8};
        arr=C03_ArrayElemetnleriniArtirme.elementlerini2Artir(arr);
        System.out.println(Arrays.toString(arr));

        // arr array inin elementlerini toplayip sonucu yazdirin

        int tplm=C04_ArrayElementleriniToplama.ElementlerinToplami(arr);
        System.out.println(tplm);

        // arr array inda 6 elemani var mi
        C05_ArraydeElemanArama.ElemanArama(arr,6);

        // kullanicidab deger olarak array alin
        int[] yeni=C06_KullaniciyaArrayOlusturma.arrayOlustur();
        System.out.println(Arrays.toString(yeni));

    }
}
