package ders09;

public class C02Replace {
    public static void main(String[] args) {
        String str="Kizlarim cok guzeldir";
        System.out.println(str.replace("l","L"));
        System.out.println(str.replace(" ","_"));
        System.out.println(str.replace("guzeldir","cok tatlilar"));
        // string teki tum i leri sil
        System.out.println(str.replace("i",""));
        // kizlarim yerine hanimim guzeldir yerine beatiful yazdir
        System.out.println(str.replace("kizlarim","Hanimim")
                           .replace("guzeldir","beatiful"));
        System.out.println(str.replace("","_"));
        System.out.println(str.replace("kizlarim","Hanimim").
                               replace("guzeldir","tatlidir"));
        String str2="b2u3gu4n j8av2a ic4in n11e ya6pti444n";
        System.out.println(str2.replaceAll("\\d",""));
        System.out.println(str2.replaceAll("\\D",""));
        String s1="birinci malin fiyati 2312";
        String s2="ikinci malin fiyati 1326";
        String tplm=s1.replaceAll("\\D","");
        String tplm2=s2.replaceAll("\\D","");
        System.out.println(tplm+tplm2);
        System.out.println(Integer.parseInt(tplm)+Integer.parseInt(tplm2));
    }
}
