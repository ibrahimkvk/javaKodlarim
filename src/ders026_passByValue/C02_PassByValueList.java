package ders026_passByValue;

import java.util.ArrayList;
import java.util.List;

public class C02_PassByValueList {

    public static void main(String[] args) {
        // bir method plusturalim ve methodta List deki sayilari bes artiralim
        //ve method listenin son halini yazdiralim

        List<Integer> sayilar =new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        elementleri5artir(sayilar);
        elementleri5artir(sayilar);
        elementleri5artir(sayilar);

        System.out.println( "methoddan sonraki liste: " + sayilar);

    }

    public static void elementleri5artir(List<Integer> sayilar) {
        for (int i = 0; i <sayilar.size() ; i++) {
            sayilar.set(i, sayilar.get(i) + 5);
        }
        System.out.println(sayilar);

        }
    }
