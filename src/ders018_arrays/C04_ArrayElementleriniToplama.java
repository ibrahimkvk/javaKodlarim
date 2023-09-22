package ders018_arrays;

public class C04_ArrayElementleriniToplama {
    public static void main(String[] args) {
        // Soru 2- Verilen bir array’deki pozitif tamsayilari toplayip
        // sonucu bize donduren bir method yaziniz.
        int[] arr={3,-3,5,-7,-6,1,-2};
        int toplm=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>0){
                toplm+=arr[i];
            }

        }
        System.out.println(toplm);
        System.out.println(ElementlerinToplami(arr));

    }
    public static int ElementlerinToplami(int[] arr) {
        int toplm=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>0) {
                toplm= toplm+ arr[i];
            }

        } return toplm;

    }
}
