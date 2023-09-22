package ders020_multiDimensionArrays;

import java.util.Arrays;

public class C07_Soru {
    public static void main(String[] args) {
        // Soru 2- Verilen 2 katli bir array’de ayni index’e sahip elementleri toplayip,
        //         yeni olusturacagimiz tek katli bir array’e bu toplamlari atayin.
        //      input :      int[][] arr =  {{3,4,5}, {2,3,6,7}};
        //      output:                      [5, 7, 11

        int[][] arr= {{2,4,6,4,12,4},{1,3,5,3}};
        // inner 2 array olcagini dusunelim
        int ortak=arr[0].length<arr[1].length ? arr[0].length :arr[1].length;
         int[] toplam_arr= new int[ortak];
        for (int i = 0; i <ortak ; i++) {
            toplam_arr[i]=arr[0][i]+arr[1][i];
        }
        System.out.println(Arrays.toString(toplam_arr));


        }

    }

