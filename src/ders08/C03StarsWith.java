package ders08;

public class C03StarsWith {
    public static void main(String[] args) {
        String str="Calismaaya Devam Olacak insallah";
        System.out.println(str.startsWith("Calismaya"));
        System.out.println(str.startsWith("Ca"));
        System.out.println(str.startsWith("C"));
        System.out.println(str.startsWith("Calismaaya Devam Olacak insallah"));
        System.out.println(str.startsWith("Devam"));
        System.out.println(str.startsWith("Olacak", 7));
        System.out.println(str.startsWith("insallah",24));
        System.out.println(str.endsWith("insallah"));
        System.out.println((str.endsWith("allah")));
    }
}
