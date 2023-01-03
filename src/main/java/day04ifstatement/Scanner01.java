package day04ifstatement;

import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {

        // Kullanıcıdan ilk ismini orta ismini soy ismini imlik nosunu al
        // isim soyisim üst satır tac alt satırda olacak

          Scanner input = new Scanner(System.in);
//
//        System.out.println("İlk isminizi giriniz ");
//        String ilkIsim = input.next();   // next methodu kullanıcıdan String datası almak için kullanılır.
//
//        System.out.println("İkinci isminizi giriniz ");
//        String ikinciIsim = input.next();
//
//        System.out.println(" Soy isminizi giriniz ");
//
//        String soyisim = input.next();
//
//        System.out.println(" kimlik numaranızı giriniz ");
//        String kimlikNo = input.next();
//
//        System.out.println(ilkIsim+ " " +ikinciIsim+" " + soyisim);
//        System.out.println(kimlikNo);

        // 2. yol

        System.out.println("İlk orta ve soyisminizi giriniz   ");
        String ilk = input.next();
        String orta = input.next();
        String soy = input.next();
        String kimlik = input.next();

        System.out.println(ilk+ " " +orta+" " + soy);
        System.out.println(kimlik);


        /*
        Next ile nexline in farkı nedir?
        next methodu kullancııdan gelen String in sadece ilk kelimesini alır.
        Esra Gürkay Birinci yazdığında sadece Esra yı yazar

        nextLine methodu kullanıcıdan gelen stringin tamamını alır.
        esra gürkay birinci yazınca hepsini yazar

         */
        //3. Yol
        // Kullanıcıya ilk orta ve soy ismini giriniz diyoruz

        System.out.println("İlk orta ve soyisminizi giriniz");

        String tamIsim = input.nextLine();
        System.out.println(tamIsim);

        System.out.println("Kimlik numaranızı girin");
        String kimlikNumarasi = input.next();
        System.out.println(kimlikNumarasi);


    }
}
