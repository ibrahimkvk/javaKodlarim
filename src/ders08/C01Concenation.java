package ders08;

public class C01Concenation {
    public static void main(String[] args) {
        String str1="Hayat";
        String str2="Guzel";
        boolean bln=true;
        int sayi=23;
        double dbl=3.45;
        System.out.println(str1+str2+bln+sayi+dbl);
        System.out.println(str1.concat(str2));
        System.out.println(str2.concat("yetersiz bakiye").concat(str1).concat("yolun sonu gokuyor"));

        
    }
}
