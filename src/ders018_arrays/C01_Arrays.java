package ders018_arrays;

public class C01_Arrays {
    public static void main(String[] args) {
        int [] arr1={2,4,6,8,10};
        // array in bir elementine ulasmak veya update etemek istersek
        System.out.println(arr1[2]); // 6

        arr1[3]=20;

        System.out.println(arr1[3]); //20

        System.out.println(arr1.length); //5

        //son elementini yazdiralim
        System.out.println(arr1[arr1.length-1]);

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");

            //array in uzunlugu sonradan degistilemez
            //eger array de olmayan bir indexe atama yapmak istersen
            //ArrayIndexOutOfBoundsException
            // bu hata Compile Time Error CTE degil
            //Run time error dur
            arr1[4]=34;

        }


    }

}
