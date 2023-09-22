package ders05_ifstatement;

public class c010nested {
    public static void main(String[] args) {
        char cins = 'K';
        int yas = 65;
        if (cins == 'k' || cins == 'K') {
            if (yas<15) {
                System.out.println("yanlis yas girisi yaptiniz");
            }
            else if (yas<60 ) {
                System.out.println("emekli olmaniza "  +(60-yas) + "  yiliniz daha var");
            }
            else {
                System.out.println("emekli olabilirsiniz");
            }
        } else if (cins == 'e' || cins == 'E') {
            if (yas<15) {
                System.out.println("yanlis yas girisi yaptiniz");
            }
            else if (yas<65 ) {
                System.out.println("emekli olmaniza "  +(65-yas) + "  yiliniz daha var");
            }
            else {
                System.out.println("emekli olabilirsiniz");
            }

        } else {
            System.out.println("yanlis giris yaptiniz:");
        }
    }
}