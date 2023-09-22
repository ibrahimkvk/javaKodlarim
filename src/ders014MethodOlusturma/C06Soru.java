package ders014MethodOlusturma;

import java.util.Scanner;

public class C06Soru {
    // Soru 2- Kullanicidan main method icinde
    // ayri ayri isim ve soyismini alin
    // Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
    // isim bosluk soyisim seklinde bize donduren bir method olusturun
    // input : isim : Ali  soyisim :YILMAZ.     output : Ali Yilmaz
    public static void main(String[] args) {
        String isim="iBrahIm";
        String soyisim="kaVakli";
        System.out.println(duzenleme(isim, soyisim));
        System.out.println(duzenleme("MAHMUT","KAlender"));


    } public static String duzenleme(String isim,String soyisim){
        String yeniisimsoyisim= isim.substring(0,1).toUpperCase()+
                                isim.substring(1).toLowerCase()+
                                " "+
                               soyisim.substring(0,1).toUpperCase()+
                               soyisim.substring(1).toLowerCase();
        return yeniisimsoyisim;


    }
}
