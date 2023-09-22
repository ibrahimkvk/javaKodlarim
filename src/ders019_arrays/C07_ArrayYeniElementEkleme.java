package ders019_arrays;

import java.util.Arrays;

public class C07_ArrayYeniElementEkleme {
    public static void main(String[] args) {
        int[] arr={2,4,6,3,8,10};

        // bu arr e bir elemenet olarak 8 ekleyelim
    /*
    var olan bir arreye yeni eleman eklenemz ama yeni element atanabilir
    once int[] arr2=[2,4,6,8] seklinde bir arrey olusturup
    sonra arr2 degerini arr ye atayabiliriz
     */
        //yeni array olusturalim
        // arr2  konulacak datalarin turu
        // uzunlugu ise eski array in uzunlugunun bir fazlasi
        int [] arr2=new int [arr.length+1];
        System.out.println(Arrays.toString(arr2));
        for (int i = 0; i < arr.length; i++) {
            arr2[i]=arr[i];

        }
        System.out.println(Arrays.toString(arr2));
        arr2[arr2.length-1]=8;
        System.out.println(Arrays.toString(arr2));

        arr=arr2;
    }


}
