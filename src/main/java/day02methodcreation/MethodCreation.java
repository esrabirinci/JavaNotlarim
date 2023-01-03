package day02methodcreation;

import java.sql.SQLOutput;

public class MethodCreation {

    public static void main(String[] args) {

        System.out.println(toplamaYap(1.2, 5));

        System.out.println(ucSayiyiCarp(2, 1.5, 6));

        System.out.println(toplaVeCarp(3,8,6.9));


        //sout yazıp entere basınız. System.out.println() otomatik olarak yazılır.
        // Ekrana bir şey yazdırmak için iki tane kod var. 1) System.out.println()   2) System.out.print()


    }

    // Example 1: Toplama işlemi yapan bir method oluşturunuz.

    public static double toplamaYap(double a, double b) {
        return a+b;
    }

    // Example 2: Üç sayıyı birbiriyle çarpan bir method oluşturunuz.
    public static double ucSayiyiCarp(double a, double b, double c) {
        return a*b*c;
    }

    // Example3: Üç sayıdan ilk ikisini toplayıp üçüncü ile çarpan methot oluşturup sonucu ekrana yazdırınız.

    public static double toplaVeCarp (double a, double b, double c) {
        return (a+b)*c;
    }
}







