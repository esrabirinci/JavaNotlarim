package day03odevler;

import java.util.Scanner;

public class Soru06 {

    // Mili Km ye çeviren program yazınız. (double kullanınız)

    public static void main(String[] args) {

        Scanner soru6 = new Scanner(System.in);


        System.out.println(" Bir mil içeren sayı giriniz Km ye çevireceğim ");
               double mil = soru6.nextDouble();


        System.out.println(".. mil şu kadar km dir " + mil*1.6);

    }
}
