package ders021_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_contains {

    public static void main(String[] args) {
        List<Integer> sayilar=new ArrayList<>();
        int[] arr={3,4,5,1,8,6,3,2,8,0,5,2,10};

        for (int i = 0; i <arr.length ; i++) {

            sayilar.add(arr[i]);

        }
        System.out.println(sayilar.contains(5));
        System.out.println(sayilar.contains(7));
    }
}
