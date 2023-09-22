package ders014MethodOlusturma;

public class C07Soru {
    // Soru 3- Kullanicidan main method icinde pozitif bir tamsayi alin.
    // Girilen sayinin asal sayi olup olmadigini kontrol edip,
    // sonuc olarak “asal sayi” veya “asal sayi degil” sonuclarini donduren bir method olusturun.
    public static void main(String[] args) {
        int sayi=41;
        System.out.println(asalSayi(sayi));
        System.out.println(asalSayi(67));
        System.out.println(asalSayi(98));
    } public static String asalSayi (int sayi){
        String sonuc="";
        for (int i = 2; i <sayi ; i++) {

            if(sayi%i==0) {
                sonuc="asal degil";
                break;
            } if(!sonuc.equals("asal degil")){
                sonuc="sayi asaldir";
            }

        } return sonuc;

    }
}
