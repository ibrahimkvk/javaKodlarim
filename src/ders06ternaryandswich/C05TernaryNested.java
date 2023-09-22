package ders06ternaryandswich;

public class C05TernaryNested {
    public static void main(String[] args) {
        /*
        kullanicidan bir tam sayi alin
        sayi poztif ise sayi cift degilse sayi tek sayi
        sayi negatif ise 3 basamakli degilse 3 basamakli degil yazdirin
         */
        int a=786;
       /* if (a>0){
            System.out.println(a%2==0? "sayi cift sayi":"sayi tek sayi");
        } else {
            System.out.println(a>-990 && a<-99 ? "sayi 3 basamakli ":"sayi 3 basamkli dagil");
        }*/
        // simdi nested ternary ile yaopalim
        String sonuc=a>0 ?
                     a%2==0 ? "sayi cift sayi" :"sayi tek sayi"
                     : a>-1000 && a<-99 ? "sayi 3 basamakli " : "sayi 3 basamakli degil";
        System.out.println(sonuc);

    }
}
