package day06nestedifswitch;

import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {
        /*

       kullanıcıya ay ismi sorunuz ve kullanıcının verdiği ay isminden son aya kadar ekrana yazdırınız.

         */

        Scanner girdi = new Scanner(System.in);
        System.out.println("Ay ismini giriniz");
        String ayIsmi = girdi.next().toLowerCase();

        // tolowerCase() bir String deki tüm karakterleri alır hepsini küçük harfe çevirir.
        //toUpperCase() bir String deki tüm karakterleri alır ve hepsini BÜYÜK HARFE çevirir.


        switch(ayIsmi) {

        case "ocak":
        System.out.println("Ocak");
        case "şubat":
        System.out.println("şubat");
        case "mart":
        System.out.println("mart");
        case "nisan":
        System.out.println("nisan");
        case "mayıs":
        System.out.println("mayıs");
        case "haziran":
        System.out.println("haziran");
        case "temmuz":
        System.out.println("temmuz");
        case "ağustos":
        System.out.println("ağustos");
        case "eylül":
        System.out.println("eylül");
        case "ekim":
        System.out.println("ekim");
        case "kasım":
        System.out.println("kasım");
        case "aralık":
        System.out.println("aralık");
        break;
        default:
        System.out.println("Geçerli ay ismi giriniz");}



    }
}
