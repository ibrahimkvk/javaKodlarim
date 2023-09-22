package ders05_ifstatement;

public class c09urunFiyati {
    public static void main(String[] args) {
        int adet=45;
        boolean kartVarmi=false;
        double fiyat=23;
        double topfyt=0;
        topfyt=adet*fiyat;
        System.out.println( "urunun indirimsis fiyati: " +topfyt);
        if (kartVarmi && adet>10) {
            System.out.println("%20 indirimli urun fiyati:  "+topfyt*0.8);
        } else if (kartVarmi && adet<10) {
            System.out.println("%15 inrimli urun fiyati:  " +topfyt*0.85);

        } else if(!kartVarmi && adet>10) {
            System.out.println("%15 indirimli urun fiyati "+topfyt*0.85);
        }else if (!kartVarmi &&  adet<10) {
            System.out.println("%10 inrimli urun fiyat" +(topfyt*0.9));
        } else {
            System.out.println("Yanlis giris yaptiniz");
        }
    }
}
