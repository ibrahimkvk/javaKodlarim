package ders010;

public class C05Soru {
    public static void main(String[] args) {
        //bir sayi alin ve sayiya kadar sayilari yazdiriun
        // sayi 3 ile bolunuyorsa sayi yerine fizz
        //sayi 5 ile bolunuyorsa buzz
        // sayi hem 3 hemde 5 ile bolunuyorsa fizzbuzz yazdirin
        //kolay gelsin
        int sayi=100;
        for ( int i=1; i<=sayi; i++) {
            if (i%3==0 && i%5==0) {
                System.out.print("fizzBuzz\n ");
            } else if (i%3==0) {
                System.out.print("fizz ");
            } else if( i%5==0) {
                System.out.print("buzz ");
            } else {
                System.out.print(i +" ");
            }
        }

    }
}
