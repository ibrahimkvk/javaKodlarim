package ders06ternaryandswich;

public class C03Ternary {
    public static void main(String[] args) {
        int a=90;
       // a>10 ? "buyuk sayi" :"kucuk sayi"
                /*
                ternary operatoru tek basina kullanilmaz ternary sonuc uretir
                sonucu ya yazdirmaliyiz ya da bir variable atamaliyiz
                 */
       String sayi=  a%2==0 ? "Cift sayi" :"tek sayi";
        System.out.println(sayi);
        /*
        ternary opertorunun sonucunu bir variable da atamak istersek
        true ve false drumlarindakisonucun ayni data turune sahip
        olmasi gerkir yoksa atama yapmaz
         */
       //  double sayi=a%2==0 ? "cift sayi": a=a+10;      // true ve false sonuclari farkli data
        // ama yazdirmak istersek farkli data turleine olmasi gerekmez
        System.out.println(a%2==0 ? "cift sayi": "a=a+10");
    }
}
