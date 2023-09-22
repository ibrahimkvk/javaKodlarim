package ders020_multiDimensionArrays;

public class C02_MDAElementleriToplama {
    public static void main(String[] args) {
        int [] arr={3,4,5,6};
        int toplam=0;
        for (int i = 0; i <arr.length ; i++) {
            toplam+=arr[i];

        }
        System.out.print("tek katli array in toplami:  "+ toplam);
        toplam=0;

        int[][] arr1= {{1,2},{3,4,5,6},{2,1}};


        for (int i = 0; i <arr1.length ; i++) {
            for ( int j=0; j<arr1[i].length; j++){
                toplam= toplam+arr1[i][j];
            }


        }
        System.out.println("\n2 katli array lerin toplami:  "  +toplam );
    }

}
