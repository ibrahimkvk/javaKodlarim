package ders05_ifstatement;

import java.util.Scanner;

public class c011nested {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("lutfen cinsiyetinizi giriniz ");
        char cins=scan.next().charAt(0);
        System.out.print("Lutfen yasinizi giriniz  ");
        int yas= scan.nextInt();
        if (yas<15) {
            System.out.println("gecersiz giris...");
        } else if (yas<60) {
            if( cins=='e' || cins=='E') {
                System.out.println("emekli olmaniza " +(65-yas) +"  daha  yiliniz var ");
            } else if(cins=='k' || cins=='K') {
                System.out.println("emekli olmaniza "+(60-yas) +"  daha yiliniz var");
            } else {
                System.out.println("gecersiz giris..");
            }
        } else if (yas<65) {
            if (cins=='e' || cins=='E') {
                System.out.println("emekli olmaniza " +(65-yas) +"  daha yiliniz var");
            } else if (cins=='k' || cins=='K') {
                System.out.println("emekli olabilirsiniz..");
            } else {
                System.out.println("gecersis giris..");
            }
        } else if (65<yas) {
            if (cins=='e' || cins=='E') {
                System.out.println("emekli olabilirsiniz");
            } else if (cins=='k'|| cins=='K') {
                System.out.println("emekli olabilirsiniz..");
            } else {
                System.out.println("gecersis giris..");
            }
        }
    }
}
