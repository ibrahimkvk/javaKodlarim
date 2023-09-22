package ders023_constructors;

public class DAraba {
    //bir proje olustururken tum classlarda main method olmasina gerek yoktur
    // cogu class obje olusturularak kullanilmak uzere hazirlanmis depolardir
    // biz de bu class i araba objeleri icin bir depo olarak dizayn edelim


    // her class olusturuldugunda java  o class dan obje olusturulabilmesi icin
    // default bir consructor olusturur.
    // Bu consractor gorunmez
    // default consructor parametresizdir ve bize standart bir obje olusturur

    String marka ="Marka belirtilmedi";

    public String toString() {
        return "Araba Ozelleikleri" +
                "\nMarka: " + marka +
                "\nModel: " + model +
                "\nYakit: " + yakit +
                "\nYil:  " + yil +
                "\nFiyat=" + fiyat ;

    }
    String model ="Model belirtilmedi";
    String yakit;
    int yil;
    int fiyat;

    public int maxHiz(String yakit) {
        int maxHiz=120;
        if (yakit.equalsIgnoreCase("dizel")) {
            maxHiz=200;
        } else if( yakit.equalsIgnoreCase("benzin")) {
            maxHiz=230;
        } else if( yakit.equalsIgnoreCase("elekrikli")) {
            maxHiz=180;
        }
        return maxHiz;
    }

}
