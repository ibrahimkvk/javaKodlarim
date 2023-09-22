package ders07stringmanipulations;

public class C06Substring {
    public static void main(String[] args) {
        String str="Java ogren isi kap";
        System.out.println(str.substring(4));
        System.out.println(str.substring(0));
        System.out.println(str.length());
        System.out.println(str.charAt(str.length()-2));
        String sonHarf=""+str.charAt(str.length()-3);
        System.out.println(sonHarf);
        sonHarf=str.substring(str.length()-2);
                // ifadeninin son harfini buyuk harfle yazdiirn
        System.out.println(str.substring(str.length()-18).toUpperCase());
        // son 3 haribuyuk harfle yazdiirn
        System.out.println(str.substring(str.length()-3).toUpperCase());

    }
}
