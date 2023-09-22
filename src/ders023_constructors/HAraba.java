package ders023_constructors;

public class HAraba {

    String marka ="Marka belirtilmedi";

    public HAraba(String mrk, String mdl, String ykt, int yl, int fyt) {

        marka=mrk;
        model=mdl;
        fiyat=fyt;
        yakit=ykt;
        yil=yl;

    }
    public HAraba (String mrk, String mdl,int yl) {
        marka=mrk;
        model=mdl;
        yil=yl;
    }
    public HAraba() {

    }

    public String toString() {
        return "Araba Ozelleikleri" +
                "\nMarka: " + marka +
                "\nModel: " + model +
                "\nYakit: " + yakit +
                "\nYil:  " + yil +
                "\nFiyat:  " + fiyat ;

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
