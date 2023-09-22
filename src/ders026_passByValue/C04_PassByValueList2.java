package ders026_passByValue;

import java.util.ArrayList;
import java.util.List;

public class C04_PassByValueList2 {
    public static void main(String[] args) {
        // Bir method olusturalim
        // method'da yeni bir liste olusturun
        // listeye sayilar listesindeki degerlerin 5 fazlasini element olarak atayin
        // sonra sayilar listesine deger olarak yeni list'i atayin
        // ve sayilar list'ini yazdirin
        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        yeniListDegeriAta(sayilar);

    }
    public static void yeniListDegeriAta(List<Integer> sayilar) {
        List<Integer> yeniList=new ArrayList<>();
        for (int i = 0; i <sayilar.size() ; i++) {
            sayilar.set(i,sayilar.get(i)+5);
        }
        System.out.println(sayilar);
    }
}
