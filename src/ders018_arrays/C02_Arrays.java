package ders018_arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {
        String [] arr={"Meryem","Nesibe","Elif"};

        //bu array in tum elementlerini bir bosluk birakarak yazdiralim

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
            System.out.print(" ");


            //bu array i array olarak yazdiralim

            System.out.println(arr);
             // bu sekilde yazarsak array in sadece referansini yazdirir
             // array i array olarak yazdirmak  istersek  Arrays classindan yardim almaliyiz
             // cunkki arrays ler non-primitive data turudur

        System.out.println(Arrays.toString(arr));



    }

}
