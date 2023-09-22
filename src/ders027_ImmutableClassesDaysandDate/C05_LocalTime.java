package ders027_ImmutableClassesDaysandDate;

import java.time.LocalTime;

public class C05_LocalTime {
    public static void main(String[] args) {
        LocalTime saat=LocalTime.now();
        System.out.println(saat);

        LocalTime saat2=LocalTime.of(2,5,12);

        System.out.println(saat.compareTo(saat2));

        System.out.println(saat.getMinute());
        System.out.println(saat.getHour());
        System.out.println(saat.minusMinutes(23));
        System.out.println(saat.toString());

        System.out.println(saat.minusHours(6));

    }
}
