package ders021_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_Set {
    public static void main(String[] args) {

        int [] arr={3,5,1,8,7,3,5,7,12,3,2,45,96};

        List<Integer> sayilar=new ArrayList<>();

        for (int i = 0; i <arr.length ; i++) {
            sayilar.add(arr[i]);

        }
        // javada set update icin kullanilir
        // add ile set farklidir

        System.out.println(sayilar.set(1, 99));
        System.out.println(sayilar.set(12, 100));
        System.out.println(sayilar);


    }
    }

