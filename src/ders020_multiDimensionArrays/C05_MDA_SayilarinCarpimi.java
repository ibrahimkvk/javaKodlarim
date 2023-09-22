package ders020_multiDimensionArrays;

public class C05_MDA_SayilarinCarpimi {
    public static void main(String[] args) {
        // verilen iki katli bir array de bulunan
        // tum sayilarin carpimini bize donduren bir method olusturun
        int[][] arr = {{1, 2}, {3, 2, 1}, {5},{45,21}};
        System.out.println(sayilarinCarpimi(arr));

    }

    public static int sayilarinCarpimi(int[][] arr) {
        int carpim = 1;
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                carpim *= arr[i][j];
            }

        }
        return carpim;
    }
}


