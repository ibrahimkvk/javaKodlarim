package ders011;

public class C01TersYazdirma {
    // String bir ifadyi tersten yazdirin
    public static void main(String[] args) {
        String imput= "Ibrahim cok calismalisin";
        for (int i =imput.length()-1; i >=0 ; i--) {
            System.out.print(imput.charAt(i));
        }
    }



}
