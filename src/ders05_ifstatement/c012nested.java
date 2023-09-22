package ders05_ifstatement;

public class c012nested {
    public static void main(String[] args) {
        int adet=0;
        double fiyat=23;
        boolean kartvarMi=false;
        double tplmfyt=adet*fiyat;
        System.out.println("urunun fiyati:" +tplmfyt);

        if (kartvarMi==true) {
            if (adet<=0) {
                System.out.println("gecersiz giris..");
            } else if (adet<10) {
                System.out.println("%15 indirimli fiyati " +(tplmfyt*0.85));
            } else if (adet>10) {
                System.out.println("%20 indirimli fiyati " +(tplmfyt*0.8));
            }


        } else if(kartvarMi==false) {
            if( adet<=0) {
                System.out.println("gecersiz giris...");
            } else if (adet<10) {
                System.out.println("%10 indirimli fiyati " +(tplmfyt*0.9));
            } else if(adet<0) {
                System.out.println("%15 indirimli fiyati " +(tplmfyt*0.85));
            }

        }
        else {
            System.out.println("gecersiz giris...");
        }
    }
}
