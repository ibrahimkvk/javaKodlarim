package ders026_passByValue;

import java.util.Arrays;

public class C03PassByValueArray {
    public static void main(String[] args) {
        // verilen bir array in elementlerini 5 artirip yazdiran bir method olusturalim
        int[] arr={3,4,5};

        elementleri5Artir(arr);
        elementleri5Artir(arr);
        elementleri5Artir(arr);
        elementleri5Artir(arr);

        System.out.println(Arrays.toString(arr));
    }
    public static void elementleri5Artir(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

            arr[i]=arr[i]+5;

        }
        System.out.println(Arrays.toString(arr));
    }
}
