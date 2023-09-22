package ders023_constructors;

public class DArabaRunner {
    public static void main(String[] args) {

        // DAraba class indan bir obje olusturalim

      DAraba arb1=new DAraba();

        System.out.println(arb1.marka);
        System.out.println(arb1.model);
        System.out.println(arb1.yakit);
        System.out.println(arb1.yil);
        System.out.println(arb1.fiyat);
        System.out.println(arb1.yil);

        arb1.marka="tofas";
        arb1.model="kartal";
        arb1.yakit="dizel";
        arb1.fiyat=50000;
        arb1.maxHiz(arb1.yakit);
        arb1.yil=1998;

        System.out.println("\n");
        System.out.println(arb1.marka);
        System.out.println(arb1.model);
        System.out.println(arb1.yakit);
        System.out.println(arb1.yil);
        System.out.println(arb1.fiyat);
        System.out.println(arb1.maxHiz(arb1.yakit));

        System.out.println("Marka:  " +arb1.marka +
                         "\nModel:  " +arb1.model+
                          "\nYakit:  " +arb1.yakit+
                          "\nYil:    " +arb1.yil+
                          "\nFiyat:  " +arb1.fiyat);

        DAraba arb3=new DAraba ();

        System.out.println(arb3);
        System.out.println(arb1);


    }


}
