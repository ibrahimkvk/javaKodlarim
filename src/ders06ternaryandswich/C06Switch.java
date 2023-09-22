package ders06ternaryandswich;

public class C06Switch {
    public static void main(String[] args) {
        /*
        kullanicidan bir 1-7 arasi sayi alin ona gire gun adini yazdirin
         */
        int gunNo=4;
       /* if (gunNo==1) {
            System.out.println("Pazartesi");
        } else if (gunNo==2) {
            System.out.println("Sali");
        }else if (gunNo==3) {
            System.out.println("carsamba");
        }else if (gunNo==4) {
            System.out.println("persembe");
        }else if (gunNo==5) {
            System.out.println("cuma");
        }else if (gunNo==6) {
            System.out.println("cumartesi");
        }else if (gunNo==7) {
            System.out.println("pazar");
        }else {
            System.out.println("yanlis giris yaptiniz");
        }*/
        //simdide switch ile yapalim
        switch (gunNo) {
            case 1 :
                System.out.println("pazartesi");
                break;
            case 2:
                System.out.println("Sali");
                break;
            case 3:
                System.out.println("carsamba");
                break;
            case 4:
                System.out.println("persembe");
                break;
            case 5:
                System.out.println("cuma");
                break;
            case 6:
                System.out.println("cumartesi");
                break;
            case 7:
                System.out.println("pazar");
                break;
            default:
                System.out.println("gecersiz gun no");


        }

    }
}
