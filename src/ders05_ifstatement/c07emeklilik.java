package ders05_ifstatement;

import java.util.Scanner;

public class c07emeklilik {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Lutfen cinsiyetinizi giriniz:  ");
        char cinsiyet=scan.next().charAt(0);
        System.out.print("Lutfen yasinizi giriniz:  ");
        int yas=scan.nextInt();
          if ( yas<=0 || yas>120) {
            System.out.println("yanlis yas girisi yaptiniz");
        }
         else if(yas>65 && ( cinsiyet=='e' || cinsiyet=='E')) {
            System.out.println("emekli olabilirsiniz");
        } else if (yas<65 && cinsiyet=='e') {
            System.out.println("emekli olmaniza " +(65-yas) +" yiliniz kaldi");
        }
           else if (yas>60 &&  (cinsiyet=='k' || cinsiyet=='K') ){
            System.out.println("Emekli olabilirsiniz");
        } else if(yas<60 && cinsiyet=='k'){
            System.out.println("emekli olmaniza "  +(60-yas) +"  yiliniz var");
        } else {
        System.out.println("yanlis giris yaptniz");



    }
}}
