package ders021_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_ArrayTekrarSilme {

    public static void main(String[] args) {

        // verilen bir array deki tekrar eden sayilari tek  kere olacak
        // sekilde array i duzenleyin

        int[] arr={1,2,3,4,5,6,8,5,6,3,6,0,6,8,6,2,45,6,87};

        List<Integer> tekrarsizListe=new ArrayList<>();

        for (int i = 0; i <arr.length ; i++) {

            if (!tekrarsizListe.contains(arr[i])) {

                tekrarsizListe.add(arr[i]);
            }
        }
        System.out.println(tekrarsizListe);

            arr=new int[tekrarsizListe.size()];

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i <tekrarsizListe.size() ; i++) {
            arr[i]=tekrarsizListe.get(i);

        }
        System.out.println("tekrarsiz liste:  "+ Arrays.toString(arr));
    }


}


