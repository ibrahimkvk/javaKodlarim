package ders019_arrays;

import java.util.Arrays;

public class C02_EnBuyukEnKucukElementiBulma {
    public static void main(String[] args) {
        // Verilen bir int array'de en kucuk ve en buyuk sayilari
        // yazdiran bir method olusturun
        int[] arr={2,4,8,2,4,7,1,-2};
        enBuyukEnKucuk(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void enBuyukEnKucuk (int[] arr) {
        Arrays.sort(arr);
        System.out.println("Array in en kucuk elemani: " +arr[0]);
        System.out.println("Array in en buyuk elemani: " +arr[arr.length-1]);
    }
}
