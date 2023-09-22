package ders05_ifstatement;

import java.util.Scanner;

public class c014nested {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("hangi gundeyiz ?");
        String gun= scan.nextLine();
        if ( gun.equalsIgnoreCase("pazartesi")) {
            System.out.println("Simdi calisma zamani tatile daha 4 gun var");
        } else if ( gun.equalsIgnoreCase("sali")) {
            System.out.println("Simdi calisma zamani tatile daha 3 gun var");
        } else if ( gun.equalsIgnoreCase("carsamba")) {
            System.out.println("Simdi calisma zamani tatile daha 2 gun var");
        } else if ( gun.equalsIgnoreCase("persembe")) {
            System.out.println("Simdi calisma zamani tatile daha 1 gun var");
        } else if ( gun.equalsIgnoreCase("cuma")) {
            System.out.println("Simdi calisma zamani sabret yarin tatil");
        } else if ( gun.equalsIgnoreCase("cumartesi")) {
            System.out.println("Simdi dinlenme zamani");
        } else if ( gun.equalsIgnoreCase("pazar")) {
            System.out.println("Simdi dinlenme zamani");
        }else  {
            System.out.println("yanlis giris yaptiniz...");
        }
}}
