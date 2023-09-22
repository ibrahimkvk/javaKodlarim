package ders021_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C08_kullaniciyaListYaptirma {

    public static void main(String[] args) {
        // Soru 2- Kullanicidan istedigi kadar isim alip
        // Q ya bastiginda girdigi isimleri bize liste olarak dondurecek bir method olusturun

        System.out.println(ListeOlustur());

    }
    public static List<String> ListeOlustur(){

        List<String> isim=new ArrayList<>();

        Scanner scan= new Scanner(System.in);

        String girilenIsim="";

        while (!girilenIsim.equalsIgnoreCase("q")) {

            System.out.println("lutfen listeye eklemek icin isim giriniz");

            girilenIsim=scan.nextLine();

            if(!girilenIsim.equalsIgnoreCase("q")) {
                isim.add(girilenIsim);
            }

        }
        return isim;
    }


}
