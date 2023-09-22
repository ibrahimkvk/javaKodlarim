package ders019_arrays;

import java.util.Arrays;

public class C08_ArrayaElemanEklemeMetodu {
    public static void main(String[] args) {
        // verilen bir integer arraya istenen bir elemenet ekleyip
        //yeni halini bize donduren bir metod olusturun
        int[] arr={2,23,0,56,1,1,45,7,3};
        int ekSayi=34;
        arr=elemanEkleme(arr,ekSayi);
        System.out.println(Arrays.toString(arr));

    }
    public static int[] elemanEkleme(int[] arr,int ekSayi) {
        int[] arr2=new int[arr.length+1];

        for (int i = 0; i < arr.length; i++) {

            arr2[i]=arr[i];

        }
        System.out.println(Arrays.toString(arr2));
        arr2[arr2.length-1]=ekSayi;
        return arr2;
    }
    }
