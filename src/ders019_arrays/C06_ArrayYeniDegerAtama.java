package ders019_arrays;

import java.util.Arrays;

public class C06_ArrayYeniDegerAtama {
    public static void main(String[] args) {

        String str="Java";
        str="hava";

        /*
        var olan bir array a uzunlugu degistilemez
        AMA
        var olan bir arrayi yeni bir array degeri atanabilir
         */
        // 1-var olan bir arrayi yeni deger olarak atayabiliriz
        String [] arr1={"ibrahim","derya","meryem"};
        String [] arr2={"a","b","c"};
        arr1=arr2;

        //2- istedigimiz uzunlukta yeni bos bir array degeri atayabiliriz
        arr1=new String[6];
        System.out.println(Arrays.toString(arr1));

        // 3- yeni olusturulan bir arraye {} parantez icinde deger yazarak atama yapabiriz
    }  // ancak var olan bir array eyeni deger atamasi icin {} KULLANILAMAZ

    // arr1={"a","b"} OLAMAZ
}
