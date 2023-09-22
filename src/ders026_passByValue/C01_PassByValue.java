package ders026_passByValue;

public class C01_PassByValue {
    public static void main(String[] args) {
        double fiyat=100;
        System.out.println(indirimUygula10(fiyat));
        System.out.println(indirimUygula20(fiyat));
        System.out.println(indirimUygula30(fiyat));

        System.out.println(fiyat);
    }

    public static double indirimUygula10(double fiyat) {
        return fiyat*0.9;
    }
    public static double indirimUygula20(double fiyat) {
        return fiyat * 0.8;
    }
    public static double indirimUygula30(double fiyat) {
        return fiyat * 0.7;
    }
}
