package ders05_ifstatement;

import java.util.Scanner;

public class c05emeklilik {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int yas= scan.nextInt();
        if(yas>=65  ) {
            System.out.println("Emekli olabilirsiniz");
        }
        else {
            System.out.println("emkeli olmaniza "  +(65-yas) +"  yil daha var");
        }
    }
}
