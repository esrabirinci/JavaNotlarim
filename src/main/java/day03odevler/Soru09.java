package day03odevler;

import java.util.Scanner;

public class Soru09 {
    // Kullanıcıdan ad ve soyadını alıp ekrana yazdıran bir program yazdırınız.

    public static void main(String[] args) {
        Scanner soru9 = new Scanner(System.in);

        System.out.println(" Ekrana adınızı yazınız..");
       String ad = soru9.next();

        System.out.println("Ekrana soyadınızı yazınız..");
        String soyad = soru9.next();

        System.out.println(" Ad-Soyad " + (ad +"  "+ soyad ));
    }
}
