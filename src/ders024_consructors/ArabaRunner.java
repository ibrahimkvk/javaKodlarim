package ders024_consructors;

public class ArabaRunner {

    public static void main(String[] args) {

        Araba arb1=new Araba();
        arb1.marka="opel";
        arb1.model="Corsa";
        arb1.yakit="benzin";
        arb1.yil=2018;
        arb1.fiyat=20000;

        System.out.println(arb1);

        Araba arb2= new Araba("volvo","CX60");
        System.out.println(arb2);

        Araba arb3 =new Araba("Hundai","i20",20);
        System.out.println(arb3);

        Araba arb4= new Araba("mazda","A4","mazot",2020,34212);
        System.out.println(arb4);
    }
}
