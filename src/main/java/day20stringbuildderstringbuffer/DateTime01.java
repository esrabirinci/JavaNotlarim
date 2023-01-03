package day20stringbuildderstringbuffer;

import java.time.LocalDate;
import java.time.Month;

public class DateTime01 {
    public static void main(String[] args) {

        // Example 8.1: Tom Ali'den 3 yıl 8 ay 13 gün sonra doğdu. Ali ise Veli'den 1 yıl 15 gün önce doğdu.
// Tom'un doğum tarihi 18 Kasım 2011 ise Veli ve Ali'nin doğum tarihlerini bulunuz.

        LocalDate dobTom = LocalDate.of(2011, Month.NOVEMBER,18);
        LocalDate dobAli = dobTom.minusYears(30).minusMonths(2).minusDays(13);
        dobAli.plusYears(1).plusDays(15);

        System.out.println("Ali: " + dobAli);
        System.out.println("Veli " + dobTom);




    }

}
