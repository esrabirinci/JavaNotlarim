package day19datetime;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DateTime03 {
    public static void main(String[] args) {

        //Example 1: JAponya ile Almanya arasındaki zaman farkını saat olarak hesaplayan kodu yazınız.
        LocalDateTime Japan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        LocalDateTime Germany = LocalDateTime.now(ZoneId.of("Europe/Berlin"));

        Long fark = ChronoUnit.HOURS.between(Germany,Japan);
        System.out.println("fark = " + fark);

        //Example 2: Sabit bir tarih oluşturunuz.
        LocalDate myDate = LocalDate.of(2011, Month.APRIL,13);
        System.out.println(myDate);// 201-04-13

        /*
        1- javada sabit dataları (gün isimleri, ay isimleri,abd deki eyalet isimleri..) depolamak ve gerektiğinde kullanmak
        için depolar oluştururuz. bu depolara "enum" denir.
         */

        //EXAMPLE 3: //Example 3: USA icin "Woow!", UK icin "Big", "CANADA" icin "Cold", "TURKEY" icin "Vatan",
        //              "GERMANY" icin "Araba", "RWANDA" icin "Cay"

        Countries country = Countries.USA;
        switch (country){
            case USA:
                System.out.println("Woow");
                break;
            case UK:
                System.out.println("Big");
                break;
            case CANADA:
                System.out.println("Cold");
                break;
            case TURKEY:
                System.out.println("Vatan");
                break;
            case GERMANY:
                System.out.println("Araba");
                break;
            case RWANDA:
                System.out.println("Çay");
                break;
            default:
                System.out.println("Tanımlanmamış ülke");
        }






    }
}
