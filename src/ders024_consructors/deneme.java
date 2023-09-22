package ders024_consructors;

public class deneme {
    String isim="ali can";
    int yas=35;
    public deneme(){
        isim="derya";
        yas=34;

    }
    public deneme ( String isim, int yas){
        this.isim=isim;
        this.yas=30;
    }

    public static void main(String[] args) {
        deneme obj1=new deneme();
        deneme obj2=new deneme("fatih",26);
        System.out.println("isim: "  +obj1.isim+
                            " yas: "  +obj2.yas);
    }

}
