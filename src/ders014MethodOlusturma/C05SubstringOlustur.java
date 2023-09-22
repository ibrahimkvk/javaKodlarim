package ders014MethodOlusturma;

public class C05SubstringOlustur {
  /*  Soru 1- Kullanicidan input olarak bir String alin,
      baslangic ve bitis indexlerine gore baslangic index'i dahil, bitis index'i haric olacak sekilde
      aradaki harfleri yazdiran bir method olusturun.
    - kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse, hata mesaji verin
    - kullanici str'da olan index'lerden daha buyuk bir index girerse hata mesaji yazdirin.*/
  public static void main(String[] args) {
    String input="Hayat bildigi gibi gelsin";
    int basindexi=5;
    int bitindexi=15;
    kendiSubstringOlustur(input,basindexi, bitindexi);
    kendiSubstringOlustur("hadi hayirli olsun",1,14);
    kendiSubstringOlustur("ibrahim",10,12);
    kendiSubstringOlustur("kavakli",23,12);
  }
  public static void kendiSubstringOlustur(String input, int basindexi, int bitindexi){
    if ( basindexi>=bitindexi) {
      System.out.println("Baslangic indexi bitis indexinden buyuktur");
    } else if ( bitindexi>=input.length()) {
      System.out.println("bitis indexi inputun uzunlugundan daha buyuktur");
    } else {
      for ( int i=basindexi; i<bitindexi; i++){
        System.out.print(input.charAt(i));
      }System.out.println(" ");
    }
  }

}
