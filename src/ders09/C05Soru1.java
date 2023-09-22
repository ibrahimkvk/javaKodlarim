package ders09;

public class C05Soru1 {
    public static void main(String[] args) {
        /*  kullanican bir cumle alin
        -cumlede ev geciyorsa "home home swit home"
        -cumlede is geciyorsa "calismak guzeldir"
        -cumlede ikiside varsa "ikiside lazim"
        -cumlede ikiside yoksa "cok calismak lazim"
        yazdrin
         */
        String str ="Ev cok guzel";
        String strp=str.toLowerCase();
        if (strp.contains("ev") && strp.contains("is")) {
            System.out.println("ikiside lazim");
        } else if (strp.contains("ev")) {
            System.out.println("Home home sweet home ");
        } else if (strp.contains("is")) {
            System.out.println("Calismak guzeldir");
        } else {
            System.out.println("cok calismak lazim");
        }

    }
}
