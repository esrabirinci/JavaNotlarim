package day03odevler;

import java.util.Scanner;

public class Soru5 {

    public static void main(String[] args) {

        // kullanıcıdan alınan bir sayının küpünü hesaplayan program yazınız.

        Scanner soru5 = new Scanner(System.in);

        System.out.println("bir sayı giriniz lütfen ..");

        double sayi = soru5.nextDouble();

        System.out.println("Sayının küpü = " + sayi*sayi*sayi);
    }
}
