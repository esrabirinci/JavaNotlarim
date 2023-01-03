package day03odevler;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Soru03 {

    /*
    Soru: Yarıçapı kullanıcıdan alınan bir dairenşn çevresini ve alanını hesaplayan bir program yazınız.
    (float kullanınız)

    veri1: pi sayısı: 3.14159
    veri2: Alan : 3.14159* radius* radius
    veri 3: çevre: 2* 3.14159* radius
     */
     public static float  pi = 3.14159f;

    public static void main(String[] args) {
        Scanner soru3 = new Scanner(System.in);

        System.out.println("Dairenin yarıçapını giriniz");
       float yaricap = soru3.nextFloat();

        System.out.println("dairenin alanı " + pi *yaricap*yaricap);

        System.out.println("Dairenin cevresi " + 2* pi* yaricap);






        //Tekrar yap




    }
}
