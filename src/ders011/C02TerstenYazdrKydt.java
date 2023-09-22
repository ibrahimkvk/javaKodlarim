package ders011;

public class C02TerstenYazdrKydt {
    public static void main(String[] args) {
        String yazi="Hava nasil oralarda";
        String tersi="";
        for (int i = yazi.length()-1; i >=0 ; i--) {
            tersi+=yazi.substring(i,i+1);
            System.out.println(tersi);

        }
        System.out.println("Yazinin tersi: " +tersi);
    }
}
