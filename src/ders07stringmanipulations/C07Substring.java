package ders07stringmanipulations;

public class C07Substring {
    public static void main(String[] args) {
        String str= "Java gun gectikce guzellesiyor.";
        //guzellesiyor kismini buyuk harflae yazdir
        System.out.println(str.substring(18, 30).toUpperCase());
        String isim= "iBRAHim KAvaKli";
        // ISMIN ILKHARFINI BUYUK DIGERLERINI KUCUK HARFLE YAZDIR
        isim=isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase();
        System.out.println(isim);
        // sadece 3.harfi yazdirin
        System.out.println(isim.substring(2, 3));
    }
}
