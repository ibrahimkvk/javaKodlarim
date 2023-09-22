package ders020_multiDimensionArrays;

import java.util.Arrays;

public class C08_MDA_Soru {
    public static void main(String[] args) {
        //  Verilen 2 katli bir array’de
        // her bir ic array’deki elementleri toplayip,
        // yeni olusturacagimiz tek katli bir array’e bu toplamlari atayin.
        //  input :      int[][] arr =  {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};
        //  output:                       [10, 3, 12, 10, 9]
        int [][] arr={{1,1,1,1},{2,3,4,5},{6,5,4,3},{3,2,1,7}};

        int [] tplm=new int [arr.length];
        int toplam=0;

        for (int i = 0; i <arr.length; i++) {
            toplam=0;

            for (int j = 0; j <arr[i].length ; j++) {
                toplam+=arr[i][j];

                tplm[i]=toplam;



            }


        }
        System.out.println(Arrays.toString(tplm));
    }
}
