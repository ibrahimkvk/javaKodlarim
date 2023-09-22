package ders025_staticKeyword;

public class AHemsire {
   @Override
   public String toString() {
      return "AHemsire{" +
              "personelIsmi='" + personelIsmi + '\'' +
              ",personelAdresi='" + personelAdresi + '\'' +
              ", personelTelefon='" + personelTelefon + '\'' +
              ",\nhastaneIsmi='" + hastaneIsmi+ '\'' +
              ", hastaneAdresi='" + hastaneAdresi + '\'' +
              ", basHekim='" + basHekim + '\'' +
              '}';
   }

   static String hastaneIsmi="Yildiz Hastanesi";
   static String hastaneAdresi="Cankaya/Ankara";
   static String basHekim="Dr Mehmet Yilmaz";
   String personelIsmi="Isim Belirtilmedi";
   String personelAdresi="Adres Belirtilmedi";
   String personelTelefon="Telefon Belirtilmedi";
}
