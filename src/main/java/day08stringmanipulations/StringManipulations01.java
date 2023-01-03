package day08stringmanipulations;

import java.util.Scanner;

public class StringManipulations01 {

    public static void main(String[] args) {
        //Example  1: Kullanıcıdan aldığınız isim ve soy isimin ilk ve son harfini ekrana yazdırınız.
         //           Ramazan ==> Rn

        Scanner girdi = new Scanner(System.in);
//        System.out.println( "Lütfen isminizi giriniz");
//        String isim = girdi.next();

//        // 1. YOL
//        char ilkHarf = isim.charAt(0);
//        char sonHarf = isim.charAt(isim.length()-1);
//        // yazdığınız kod sadece bazı durumlar için çalışırsa o koda "hard coding" denir
//        // yazdığınız kod her durum için çalışırsa o koda "dynamic kod"denir.
//        System.out.println(""+ ilkHarf+sonHarf);

        // 2. YOL

//        String ilk = isim.substring(0,1);
//       String son = isim.substring(isim.length()-1);
//
//        System.out.println(ilk+son);
//
//        // Example  2: verilen string deki sadece hayvan isimlerini ekrana yazdırınız.
//        //              "Ben kedi, Eşim Tavuk, oğlum sever inek."
//
//
//        String str =  "Ben kedi, eşim tavuk, oğlum sever inek";

        // NOT: Substringin iki kullanımı vardır.
        //        1- substring (başlangıc indexi, bitiş indexi) Stringin ortasından bir parça almasına yarar
        //        2- substring (başlangıç index) Stringin verilen indexten sonuna kadar almaya yarar.

//        String kedi = str.substring(4,8);
//        String tavuk = str.substring(15,20);
//        String inek = str.substring(34);
//
//        System.out.println(kedi + tavuk + inek);

        // Example  3: İlk isim ve soy isimi içeren isimlerden, ilk ve soy isimlerin baş harflerini ekrana yazdırınız.
        //          Ali Can ===> AC Tahsin Yurdakul ==> TY


        System.out.println("İLk ve SOY İSMİNİZİ GİRİNİZ");
        String tamIsim = girdi.nextLine();

        String a = tamIsim.substring(0,1);
        String b = tamIsim.split(" ") [1].substring(0,1);

        System.out.println(a+b);



    }
}
