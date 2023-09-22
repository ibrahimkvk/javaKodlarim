package ders019_arrays;

import java.util.Arrays;

public class C01_ElemanlariSagaKaydirma {
    public static void main(String[] args) {
        // Soru 3- Verilen bir array’deki tum elementleri bir saga kaydirip,
        // sondaki elementi de basa tasiyacak bir method olusturun, array’i yeni haliyle kaydedin.
        // Orn : input : [4,5,6,7] array’in son hali. : [7,4,5,6]


        int[] arr={3,5,3,7,1,9,4,0,4,2,7};
        arr =sagaKaydirma(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] sagaKaydirma(int[] arr) {
        int bos=arr[arr.length-1];

        for (int i = arr.length-2; i >=0 ; i--) {
            arr[i+1]=arr[i];

        } arr[0]=bos;

        return arr;
    }

    }

