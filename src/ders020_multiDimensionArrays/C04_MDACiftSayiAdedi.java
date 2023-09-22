package ders020_multiDimensionArrays;

public class C04_MDACiftSayiAdedi {
    public static void main(String[] args) {
        // verilen iki katli bir int array in cift sayi adedini bulan kodu yaziniz
        int [][] arr={{2,3,1},{8},{8,3,5,7,},{1,0,2,6,9,21}};
        int sayac=0;
        for (int i = 0; i <arr.length ; i++) {

            for(int j=0; j<arr[i].length; j++) {
                if(arr[i][j]%2==0) {
                    sayac++;

                }
            }

        }
        System.out.println("array deki cift eleman sayisi:  " +sayac);

    }
}
