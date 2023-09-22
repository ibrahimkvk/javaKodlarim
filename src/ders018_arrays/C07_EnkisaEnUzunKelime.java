package ders018_arrays;

public class C07_EnkisaEnUzunKelime {
    public static void main(String[] args) {

        // Soru 6- Verilen String bir array’deki
        // en uzun ve en kisa kelimeleri yazdiran bir method olusturun.
        String [] arr={"ibrahim","meryem hulya","elif ruveyda","nesibe sultan", "derya"};
        enKisaEnUzun(arr);

    }
    public static void enKisaEnUzun(String[] arr) {
        String EnKisa=arr[0];
        String EnUzun=arr[0];
        for (int i = 1; i <arr.length ; i++) {

            if(arr[i].length()>EnUzun.length()) {
                EnUzun=arr[i];

            }
            if(arr[i].length()<EnKisa.length()) {
                EnKisa=arr[i];

            }


        }
        System.out.println("en uzun kelime: " + EnUzun);
        System.out.println("en kisa kelime: " + EnKisa);
    }

}
