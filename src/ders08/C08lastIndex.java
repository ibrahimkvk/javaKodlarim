package ders08;

public class C08lastIndex {
    public static void main(String[] args) {
        String str= "calismaya devam ediyoruz ve insallah basari geliyoo.. ";
        System.out.println(str.lastIndexOf("b"));//37
        System.out.println(str.lastIndexOf('s'));//39
        System.out.println(str.lastIndexOf("y",12));//7
        System.out.println(str.lastIndexOf("ve",27));//25
    }
}
