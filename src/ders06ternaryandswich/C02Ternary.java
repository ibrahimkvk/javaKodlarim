package ders06ternaryandswich;

public class C02Ternary {
    public static void main(String[] args) {
        String str1="Ali";
        String str2="ali";
        // Verilen iki metin ayni ise "metinler ayni"
        // degise "metinler farkli" yazdirin
        if (str1.equals(str2)) {
            System.out.println("metinler ayni");
        }
            else {
                System.out.println("Metinler farkli");
            }
        System.out.println(str1.equals(str2) ? "Metinler ayni " :"Metinler farkli");
        }
    }

