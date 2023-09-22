package ders014MethodOlusturma;

public class C03stringTersCevirme {
    // parametre olarak bir String kabul edip
    // String'in terse cevrilmis halini döndüren bir method olusturun
    public static void main(String[] args) {
        String str="bu is olacak baska care yok";
        System.out.println(tersi(str));
        System.out.println(tersi("ibrahim kavakli"));
        System.out.println(tersi("merhaba ibrahim orada misin"));
    }
    public static String tersi(String str){
      String ters="";
      for (int i=str.length()-1; i>=0; i--) {
          ters+= str.substring(i,i+1);
      } return ters;
    }
    }

