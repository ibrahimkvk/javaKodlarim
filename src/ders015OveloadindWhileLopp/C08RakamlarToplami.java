package ders015OveloadindWhileLopp;

public class C08RakamlarToplami {
    // Soru 2- While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun.
    public static void main(String[] args) {
        int sayi=1453234;
        int toplam=0;
        while(sayi>0) {
            toplam+=sayi%10;
            sayi=sayi/10;
        }
        System.out.println(toplam);
    }
}
