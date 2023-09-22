package ders010;

public class C03RakamlarToplami {
    public static void main(String[] args) {
        // kullanicinin verdigi rakamlar toplamini bulunuz
        int sayi=6490426;
        int tplm=0;
        int bbas=0;
        String sayi1=""+sayi;
        for (int i = 0; i <sayi1.length() ; i++) {
            bbas=sayi%10;
            tplm=tplm+bbas;
            sayi=sayi/10;
        }
        System.out.println(tplm);

    }


}
