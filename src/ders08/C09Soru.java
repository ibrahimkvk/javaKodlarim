package ders08;

public class C09Soru {
    public static void main(String[] args) {
        /* kullanicidan bir kelime ve cumle alin
        duruma gore
        1-cumle kelimeyi icermiyor
        2-cumle kelimeyi 1 kere iceriyor
        3-cumle kelimeyi birden fazla iceriyor
        yazdir
         */
        String str1="havalar sogumaya basladi dikkat et!";
        String str2="avalar";
        int ilkindex= str1.indexOf(str2);
        int sonindex=str1.lastIndexOf(str2);
        if (ilkindex==-1) {
            System.out.println("cumle metni icermiyor");
        } else if (ilkindex==sonindex) {
            System.out.println("cumle metni 1 kere iceriyor");
        } else {
            System.out.println("cumle metni birden fazla iceriyor");
        }


        }
    }

