package day03odevler;

import java.util.Scanner;

public class Soru08 {


    /* Kullanıcıdan " * " gibi bir sembol alın
    // Ekrana aşağıdaki şekli yazdırın.
             *
            * *
           * * *
     */

    public static void main(String[] args) {
        Scanner soru8 = new Scanner(System.in);

        System.out.println("Ekrana bir sembol giriniz");

        String sembol = soru8.next();
        char ilkSembol = sembol.charAt(0);

        System.out.println(("  "+ ilkSembol));
        System.out.println(" "+ ilkSembol+ " "+ ilkSembol);
        System.out.println(ilkSembol + " " +ilkSembol + " " + ilkSembol);



    }
}
