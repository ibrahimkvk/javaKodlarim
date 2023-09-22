package ders08;

public class C07Question {
    public static void main(String[] args) {
        /* kullanicidan bir kelime ve cumle alin
        duruma gore
        1-cumle kelimeyi icermiyor
        2-cumle kelimeyi 1 kere iceriyor
        3-cumle kemeyi birdden fazlaiceriyor
         */
        String str1 = "Her sey yolunda insallah calismaya devam devam devam";
        String str2 = "ali";

        if (!str1.contains(str2)) {
            System.out.println("cumlede  girdiginiz kelime yok");
        } else {
            int ilk=str1.indexOf(str2);
            int ikinci=str1.indexOf(str2,ilk+1);
            if (ikinci==-1) {
                System.out.println("cumle metni 1 kere iceryor");
            } else {
                System.out.println("cumle metni 2 defs iceriyor");
        }


    }
}}