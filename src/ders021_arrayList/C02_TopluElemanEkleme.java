package ders021_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_TopluElemanEkleme {

    public static void main(String[] args) {

        List<String> harfler=new ArrayList<>();

        // tum sesli harfleri listeye ekleyin
        // eklenecek tum elemanlari bir array olarak yazin
        // sonrra for loop ile listye ekleyebilirsiniz

        String[] sesliHarfler= {"a","e","i","o","u"};

        for (int i = 0; i < sesliHarfler.length ; i++) {
            harfler.add(sesliHarfler[i]);

        }
        System.out.println(harfler);



    }
}
