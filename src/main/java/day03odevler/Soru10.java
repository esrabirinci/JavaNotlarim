package day03odevler;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Soru10 {

    // Kullanıcıdan ad, soyad ve adresini alıp ekrana yazdıran bir program yazınız.
    // Ad ve soyad ilk satır, adres ikinci satırda olsun.
    // String kullanınız.

    public static void main(String[] args) {
        Scanner soru10 = new Scanner(System.in);

        System.out.println("Adınızı yazınız  ");
        String ad  = soru10.nextLine();

        System.out.println("Soyadınızı giriniz  ");
        String soyad = soru10.nextLine();

        System.out.println("Adresinizi yazınız  ");
        String adres = soru10.nextLine();

        System.out.println( "Ad soyad " + (ad+ " " + soyad));
        System.out.println("Adresiniz" +  adres);

    }
}
