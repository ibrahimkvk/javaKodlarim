package ders020_multiDimensionArrays;

public class C06_MDA_Soru {
    public static void main(String[] args) {
        // verilen iki katli bir array de
        // her bir inner arraey in son elementlerinin
        // toplamini yazdiran bir method olusturun
        int[][] arr ={{2,3,4},{7,8,9},{10,11,32}};

        sonlarinToplami(arr);

    }
    public static void sonlarinToplami(int[][] arr)  {
        int toplam=0;

        for (int i = 0; i <arr.length ; i++) {

          toplam+=arr[i][arr[i].length-1];

            }
        System.out.println("Inner arreylerin toplami : " +toplam);

        }

    }

