package ders08;

public class C04Soru {
    public static void main(String[] args) {
        // kullanicidan email adresini alalim
        // 1- adreste @ isareti yoksa gecersiz giris
        // 2-@gmail.com icermiyorsa lutfen gmail adresini giriniz
        // 3-adreste @gmail.com yoksa hatali giris yazsin
        String email="ikavakli1634@hotmail.com";
        if(!email.contains("@")) {
            System.out.println("gecersiz giris");
        } else if (!email.contains("gmail.com")) {
            System.out.println("lutfen gmail adresini giriniz");
        } else if(!email.endsWith("@gmail.com")) {
            System.out.println("hatali giris ");
        } else {
            System.out.println("adresiniz basari ile kaydedilmistir...");
        }
    }
}
