package ders05_ifstatement;

import java.util.Scanner;

public class c08vucutkitleendeksi {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Lutfen boyunuzu cm olarak giriniz:  ");
        double boy= scan.nextDouble();
        System.out.print("lutfen kilonuzu firiniz:  ");
        int kilo= scan.nextInt();
        double vke=(kilo*10000)/(boy*boy);
        System.out.println("vucut kitle endeksiniz:  " +vke);
        if (vke>30) {
            System.out.println("30 ustu oldugunuz icin obessiniz");
        }
        else if(vke>25) {
            System.out.println(" 25 ustu oldugu icin kilolusunuz");
        }
        else if(vke>20) {
            System.out.println("20 ile 25 arasinda oldugu icin normalsiniz");
        }
        else {
            System.out.println(" 20 alti oldugu icin zayifsiniz");
        }
    }
}
