package ders019_arrays;

import java.util.Arrays;

public class C04_BinarySearch {
    public static void main(String[] args) {
        int[] arr={4,7,1,4,5,3,9};
        System.out.println(Arrays.binarySearch(arr,6));
        System.out.println(Arrays.binarySearch(arr,3));
        System.out.println(Arrays.binarySearch(arr,9));
        System.out.println(Arrays.binarySearch(arr,7));
        /*
        binarysearch metodunun kullanilabilmesi icin oncelikle sort metodu
        kullanilmalidir
        yoksa aramanin sonucu bellei olmaz
        dogruda olabilir yanlista
         */
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr,5));
        System.out.println(Arrays.binarySearch(arr,8));
        // binarysearch ile arama yaparken olmayan bir elemani
       // arattirisak bu eleman nerede olurdu sorusunu sorar
       //sonra basina - yazar
        System.out.println(Arrays.binarySearch(arr,8));
        System.out.println(Arrays.binarySearch(arr,2));
        System.out.println(Arrays.binarySearch(arr,-15));
        System.out.println(Arrays.binarySearch(arr,23));

    }
}
