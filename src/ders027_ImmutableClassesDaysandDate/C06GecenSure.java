package ders027_ImmutableClassesDaysandDate;

import java.time.LocalDate;
import java.time.Period;

public class C06GecenSure {
    public static void main(String[] args) {
        LocalDate bugun=LocalDate.now();
        LocalDate dogumGunu=LocalDate.of(1980,07,11);
        Period gecenSure=Period.between(dogumGunu,bugun);
        System.out.println(gecenSure);// P42Y3M21D
        System.out.println(gecenSure.getDays());
    }
}
