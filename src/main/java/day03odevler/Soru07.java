package day03odevler;

import java.util.Scanner;

public class Soru07 {
    // Saati saniyeye çeviren bir program yazınız.  (long kullanınız)
    // not: saniye= saat*60*60

    public static void main(String[] args) {
        Scanner soru7 = new Scanner(System.in);


        System.out.println("Bir saat birimi giriniz");
        long saat = soru7.nextLong();

        System.out.println("Girilen değer=" + (saat*60*60));
    }
}
