package ders020_multiDimensionArrays;

import java.util.Arrays;

public class C01_MultiDimensionArrays {
    public static void main(String[] args) {
        int [][] arr={{2,3,5},{0,1},{3,4,1,8},{8,2,5},{}};
        System.out.println(arr.length);
        System.out.println(arr[2].length);
        System.out.println(arr[3][0]);
        System.out.println(Arrays.toString(arr[2]));
        System.out.println(Arrays.deepToString(arr));
        System.out.println(arr[4][0]);
    }

}
