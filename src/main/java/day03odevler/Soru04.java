package day03odevler;

import java.util.Scanner;

public class Soru04 {

    /*
    Kenar uzunlukları kullanıcıdan alınan bir üçgenin çevresini hesaplayan bir program yazınız.(byte kullanınız)
    Not: Üçgenin çevresi: a+b+c
     */

    public static void main(String[] args) {
        Scanner soru4 = new Scanner(System.in);

        System.out.println("üçgenin Birinci Kenar Uzunluğunu Yaz");
        byte kenar1 = soru4.nextByte();

        System.out.println("Ucgenin ikinci kenar uznluğunu yaz");
        byte kenar2 = soru4.nextByte();

        System.out.println("üçgenin ücüncü kenar uzunluğunu yaz");
        byte kenar3 = soru4.nextByte();

        System.out.println( "Üçgenin çevresi " + (kenar1+ kenar2+ kenar3));

    }
}
