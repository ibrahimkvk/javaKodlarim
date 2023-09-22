package ders025_staticKeyword;

public class AHemsireRunner {

    public static void main(String[] args) {

        AHemsire h1=new AHemsire();
        h1.personelIsmi="Ayse";
        h1.personelAdresi="Cankaya";
        h1.personelTelefon="234567878";
        System.out.println(h1);

        AHemsire h2=new AHemsire();

        h2.personelIsmi="Hatice";
        h2.personelAdresi="Sincan";
        h2.personelTelefon="1234567";

        h2.basHekim="Nihat Arikan";

        System.out.println("Hemsire bir:  " +h1);
        System.out.println("Hemsire iki:  "+h2);

        AHemsire h3=new AHemsire();
        System.out.println(h3);

        h3.hastaneIsmi="Kavakli Hospital";
        System.out.println(h3.hastaneIsmi);




    }
}
