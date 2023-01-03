package day05ifstatement;

import java.util.Scanner;

public class IfStatement01 {

    public static void main(String[] args) {

        // Example    1:  Kullanıcıdan alınan sayının tek mi çift mi olduğunu ekrana yazan kodu yazınız.

        Scanner sayi = new Scanner(System.in);

        System.out.println("Bir sayı giriniz ..");

        int s = sayi.nextInt();

        // 1. YOL

        if(s%2==0){
            System.out.println(" Çift Sayı..");

        }

        // " != " demek eşit değil demek (tek sayı demek)
        if(s%2!= 0){
            System.out.println("Tek sayı");
        }

        // 2. YOL

        if(s%2==0) {
            System.out.println("Çift sayı..");
        }
        else{
            System.out.println("Tek sayı..");
        }

        // Example   2: Bir sayının negatif, pozitif veya nötr olduğunu söyleyen kodu yazınız.

        System.out.println("Bir Sayı Giriniz");
        double d = sayi.nextDouble();

        if (d>0){
            System.out.println("Pozitif");
        }

        else if(d==0){
            System.out.println("Notr");
        }

        else{
            System.out.println("Negatif");
        }


    }
}
