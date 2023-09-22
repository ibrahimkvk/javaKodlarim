package ders018_arrays;

import java.util.Arrays;

public class C03_ArrayElemetnleriniArtirme {
    public static void main(String[] args) {
        //Soru 1- Verilen bir int array’in tum elemanlarini 2 artirip
        // bize donduren bir method olusturun.
        // eski array i yeni haliyle yazdirin
        int [] arr= {2,4,6,8};
        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[i] + 2;

        }
        System.out.println(Arrays.toString(arr));// [4,6,8,10]
        arr=elementlerini2Artir(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static int[] elementlerini2Artir(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[i]+2;
        } return arr;
    }
}
