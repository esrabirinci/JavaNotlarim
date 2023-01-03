package day05ifstatement;

import java.util.Scanner;

public class IfStatement03 {

    /*
    İki tane String in birbirine eşit olup olmadığını anlamak için  " == " bu kodu değil " equals() " i kullanınız.

    İki tane String in birbirine eşit olup olmadığını kontrol etmek için iki tane method kullnaılabilir.

        i) equals()                   Büyük harf küçük harf duyarlıdır  "A" ile "a" farklıdır.
        ii) equals..ıgnoreCase()      Büyük küçük harf önemsemez "A" ile "a" aynıdır.
     */

    public static void main(String[] args) {
        // Example  1: Kullanıcıdan gün isimlerini alınız o günün haftasonu mu hafta içi mi olduğunu kullanıcıya syleyiniz


        // 1. YOL

        Scanner input = new Scanner(System.in);
        System.out.println("Bir gün ismi giriniz  " );

        String gun = input.next();

//        if(gun.equalsIgnoreCase("pazar")) {
//            System.out.println("Hafta sonu..");
//        }
//        else if (gun.equalsIgnoreCase("Pazartesi")) {
//            System.out.println("Hafta İçi");
//        }
//        else if (gun.equalsIgnoreCase("Salı")) {
//            System.out.println("Hafta İçi");
//        }
//        else if (gun.equalsIgnoreCase("Çarşamba")) {
//            System.out.println("Hafta İçi");
//        }
//        else if (gun.equalsIgnoreCase("Perşembe")) {
//            System.out.println("Hafta İçi");
//        }
//        else if (gun.equalsIgnoreCase("Cuma")) {
//            System.out.println("Hafta İçi");
//        }
//        else if (gun.equalsIgnoreCase("Cumartesi")) {
//            System.out.println("Hafta Sonu");
//        }
//        else {
//            System.out.println("Geçerli bir gün ismi giriniz");
//        }

        // 2.YOL

//        if(gun.equalsIgnoreCase("pazar") || gun.equalsIgnoreCase("cumartesi")){
//            System.out.println("Haftasonu ");
//
//        }else if (gun.equalsIgnoreCase("Pazartesi") ||
//                gun.equalsIgnoreCase("Salı") ||
//                gun.equalsIgnoreCase("Çsrşamba") ||
//                gun.equalsIgnoreCase("Perşembe") ||
//                gun.equalsIgnoreCase("Cuma")){
//            System.out.println("Hafta İçi ");
//
//        }
//        else {
//            System.out.println("Geçerli bir gün İsmi giriniz");
//        }


        // 3. YOL En mükemmel yoldur.
        boolean haftaSonu =  gun.equalsIgnoreCase("pazar") || gun.equalsIgnoreCase("cumartesi");
        boolean haftaici =   gun.equalsIgnoreCase("Pazartesi") ||
                             gun.equalsIgnoreCase("Salı") ||
                             gun.equalsIgnoreCase("Çsrşamba") ||
                             gun.equalsIgnoreCase("Perşembe") ||
                             gun.equalsIgnoreCase("Cuma");

        if(haftaSonu){
            System.out.println("Haftasonu ");

        }else if (haftaici){
            System.out.println("Haftaiçi");

        } else {
            System.out.println("Geçerli bir gün İsmi giriniz");
        }


    }
}
