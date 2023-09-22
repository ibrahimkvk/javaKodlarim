package ders09;

public class C03Replacesoru {
    public static void main(String[] args) {
        String str="ha@@87va co000k guz34+&*^%eldir^";
        System.out.println(str);
        str=str.replaceAll("\\d","");
        System.out.println(str);
        str=str.replaceAll("\\s","3");
        System.out.println(str);
        str=str.replaceAll("\\W","");
        System.out.println(str);
        str=str.replace("3"," ");
        System.out.println(str);
        str=str.replaceAll("\\s+","");
        System.out.println(str);

    }
}
