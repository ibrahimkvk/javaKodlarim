package ders023_constructors;

public class HArabaRunner {

    public static void main(String[] args) {

        HAraba arb1=new HAraba();
        System.out.println(arb1);
        arb1.model="Toyota";
        arb1.marka="Corola";
        arb1.yakit="Dizel";
        arb1.yil=2000;
        arb1.fiyat=20000;
        System.out.println(arb1);

        HAraba arb2=new HAraba ("Honda","Civic","Benzin",2010,250000);

        System.out.println(arb2);

        HAraba arb3=new HAraba("Citroen","c-elyse","dizel",2016,250000);
        System.out.println(arb3);

        HAraba arb4=new HAraba("Tesla","cdyt",2020);
        System.out.println(arb4);
    }
}
