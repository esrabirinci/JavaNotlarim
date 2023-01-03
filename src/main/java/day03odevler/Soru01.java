package day03odevler;

import java.util.Scanner;

public class Soru01 {

    /*
     Kullanıcıdan dikdörtgenin boyutlarını alan ve sonra dikdörtgenin alan ve çevresini hesaplayıp
     ekrana yazdıran bir program yazınız.

    Note: Alan: boy*en  Çevre 2* (boy+en)

    */

    public static void main(String[] args) {
        Scanner soru1 = new Scanner(System.in);

        System.out.println("Dikdörtgenin boyunu yaz ");
        double boy = soru1.nextDouble();

        System.out.println("Dikdörtgenin enini yaz ");
        double en = soru1.nextDouble();

        System.out.println("Dikdörtgenin alanı " + boy*en);
        System.out.println("Dikdörtgenin çevresi " + (boy+en) *2 );

    }

}
