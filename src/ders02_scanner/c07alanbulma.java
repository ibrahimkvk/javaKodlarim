package ders02_scanner;

import java.util.Scanner;

public class c07alanbulma {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Dairenin yaricapini giriniz:");
        double r= scan.nextDouble();
        System.out.println("Dairenin Alani: " +(2*3.14*r));
    }
}
