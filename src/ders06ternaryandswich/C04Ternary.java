package ders06ternaryandswich;

import java.util.Scanner;

public class C04Ternary {
    public static void main(String[] args) {
        // kullanicidan bir ucgenin kenar uzunlarini alin eseknar ucgsende "eskenar icgen"
        // degilse "eskenar ucgen degil" yazdirin
        Scanner scan= new Scanner( System.in);
        System.out.println("lutfen ucgenin kenar uzunlarunu girin");
        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();
        double kenar3= scan.nextDouble();
        System.out.println(kenar1==kenar2 && kenar2==kenar3 ? "eskenar ucgen":"eskenar ucgen degil");
        // kullanicida iki sayi girin kucuk olan sayiyi yazdirin
        int a=23;
        int b=10;
        System.out.println(a>b ? b:a);

    }
}
