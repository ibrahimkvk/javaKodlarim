package ders03_dataCasting;

import java.util.Scanner;

public class c01char {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir karaker girimiz:");
        char krk=scan.next().charAt(0);
        System.out.println( " "+(char)(krk+1) +(char)(krk+2)+(char)(krk+3));
    }
}
