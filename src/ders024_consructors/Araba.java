package ders024_consructors;

public class Araba {

    String marka="Marka Belirtilmedi";
    String model="Model Belirtilmedi";
    String yakit;
    int yil;
    int fiyat;

    public Araba (String mrk ,String mdl) {

        marka=mrk;
        model =mdl;

    }
    public Araba () {

    }

    public Araba(String marka, String model, String yakit, int yil, int fiyat) {
        this.marka = marka;
        this.model = model;
        this.yakit = yakit;
        this.yil = yil;
        this.fiyat = fiyat;
    }

    public Araba(String marka, String model, int fiyat) {
        this.marka = marka;
        this.model = model;
        this.fiyat = fiyat;
    }

    public String toString() {
        return "Araba Ozellikleri " +
                "\nmarka :  " + marka +
                "\nmodel :  " + model +
                "\nyakit :  " + yakit +
                "\nyil   :  " + yil +
                "\nfiyat :  " + fiyat;

    }
}
