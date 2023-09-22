package ders014MethodOlusturma;

public class C02StringConcate {
    // verilen iki String'i parametre olarak kabul edip
    // bu iki String'i aralarinda bir bosluk olan tek bir String olarak
    // main method'a donduren bir method olusturun
    public static void main(String[] args) {
        String str1="ibrahim";
        String str2="Caliskandir";
        System.out.println(birlestir(str1,str2));
        System.out.println(birlestir("ibrahim", "yola devam"));
        System.out.println(birlestir("durmak","yok"));
    }
    public static String birlestir(String str1,String str2){
        return str1+" "+str2;
    }
}
