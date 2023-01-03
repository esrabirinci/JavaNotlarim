package day06nestedifswitch;

import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {

        // NOT: switch de sadece int, byte, short,char ve string  data type leri kullanılabilir.
        // NOT: eğer 3 den fazla durum varsa switch() tercih ederim.(aylar mesela 12 durum)


        //Kullanıcıdan işlem ve iki tane sayı alarak, işlemin sonucunu ekrana yazdıran basit bir hesap makinesi yapınız.

        Scanner girdi = new Scanner(System.in);
        System.out.println("işlemi  giriniz, +,-,*,/,%");
        char islem = girdi.next().charAt(0);

        System.out.println("İlk sayıyı giriniz");
        double ilk = girdi.nextDouble();

        System.out.println("İikinci sayıyı giriniz");
        double ikinci = girdi.nextDouble();

        switch (islem){

            case '+':
                System.out.println(ilk+ikinci);
                break;

            case '-':
                System.out.println(ilk-ikinci);
                break;

            case '*':
                System.out.println(ilk*ikinci);
                break;
            case '/':
                System.out.println(ilk/ikinci);
                break;
            case '%':
                System.out.println((ilk*ikinci)/100);
                break;
            default:
                System.out.println("bu işlem tanımlanmamıştır.");
        }

    }
}
