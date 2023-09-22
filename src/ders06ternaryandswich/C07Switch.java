package ders06ternaryandswich;

import java.util.Scanner;

public class C07Switch {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir harf giriniz");
        char harf=scan.next().charAt(0);
        switch(harf)  {
            case 'J' :
            case 'j' :
                System.out.println("Java");
                break;
            case 'd' :
            case 'D' :
                System.out.println("Development");
                break;
            case 'k' :
            case 'K' :
                System.out.println("Kit");
                break;
            default:
                System.out.println("gecersiz harf");
        }
        }
    }

