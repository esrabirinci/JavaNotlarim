package day03odevler;

import java.util.Scanner;

public class Soru02 {

    /*
    Boyutları kullanıcıdan alınan bir dikdörtgenler prizmasının hacmini hesaplayan program yazınız.
    Hacim hesaplama: En*boy*yükseklik
     */

    public static void main(String[] args) {
        Scanner soru2 = new Scanner(System.in);

        System.out.println("Dikdörtgenler prizmasının enini giriniz");
        double en = soru2.nextDouble();

        System.out.println("Dikdörtgenler prizmasının boyunu giriniz");
        double boy = soru2.nextDouble();

        System.out.println("Dikdörtgenler prizmasının yüksekliğini yaz");
        double yukseklik = soru2.nextDouble();

        System.out.println("Dikdörtgenler prizmasının hacmi " + en*boy*yukseklik);

    }
}
