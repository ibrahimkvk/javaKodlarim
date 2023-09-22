package ders020_multiDimensionArrays;

public class C03_MDAEnUzunKelime {
    public static void main(String[] args) {
        // Verilen multi dimensional String bir array'deki
        // en uzun String'i bulan kod yazini
        String [][] arr={{"ibrahim","derya","meryem hulya"},
                {"nesibe sultan","elif ruveyda gicik"},{"rukiye","omer"},{"sekere"},{"ali"}};
        String EnUzunKelime=arr[0][0];
        String EnKisaKelime=arr[0][0];
        for (int i = 0; i <arr.length; i++) {

            for (int j=0; j<arr[i].length; j++) {

                if(arr[i][j].length()> EnUzunKelime.length()) {
                    EnUzunKelime=arr[i][j];

                }
                if(arr[i][j].length()<EnKisaKelime.length()){
                    EnKisaKelime=arr[i][j];
                }
            }

        }
        System.out.println("en uzun kelime :  "+EnUzunKelime);
        System.out.println("en kisa kelime :  " +EnKisaKelime);


    }
}
