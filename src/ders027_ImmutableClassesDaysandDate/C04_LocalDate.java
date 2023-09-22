package ders027_ImmutableClassesDaysandDate;

import java.time.LocalDate;

public class C04_LocalDate {
    public static void main(String[] args) {
        LocalDate tarih = LocalDate.now();
        System.out.println(tarih);
        System.out.println(tarih.minusDays(63));
        System.out.println(tarih.minusWeeks(34).minusDays(4));
        System.out.println(tarih.plusYears(2).plusMonths(8).plusDays(5));

        System.out.println(tarih.getDayOfMonth());
        System.out.println(tarih.getMonth());
        System.out.println(tarih.getYear());
        System.out.println(tarih.getDayOfWeek());
        System.out.println(tarih.getDayOfYear());
        System.out.println(tarih.isLeapYear());
        System.out.println(tarih.withYear(2000).getDayOfWeek());
        System.out.println(tarih.lengthOfMonth());
        System.out.println(tarih.withYear(1980).withMonth(7).withDayOfMonth(11).getDayOfWeek());

        LocalDate date1=LocalDate.of(2011,11,11);
        LocalDate date2=LocalDate.of(2022,5,2);
        System.out.println(date2.isBefore(date1));
    }
}
