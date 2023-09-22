package ders021_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C07_indexof {

    public static void main(String[] args) {

        int [] arr={3,5,1,8,7,3,5,7,12,3,2,45,96};

        List<Integer> sayilar=new ArrayList<>();

        for (int i = 0; i <arr.length ; i++) {
            sayilar.add(arr[i]);

        }

        System.out.println(sayilar.indexOf(3));
        System.out.println(sayilar.indexOf(8));
        System.out.println(sayilar.lastIndexOf(5));
    }
}
