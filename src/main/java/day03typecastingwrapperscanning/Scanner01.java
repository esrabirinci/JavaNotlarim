package day03typecastingwrapperscanning;

import java.util.Scanner;

public class Scanner01 {

    // Scanner kullanıcıdan data almaya yarar.
    // Scanner kullanıcı ile etkileşim kurmamızı sağlar.
    // Scanner bir java classıdır. Bu class ı kullanabilmek için import etmek gerekir.
    // scanner class javanın "util kütüphanesindedir"

    public static void main(String[] args) {

        // Kullanıcıdan data almak için yapılması gerekenler
        // 1. Adım: Scanner Class ından object oluştur. (calass ismi yaz, objeye isim ver , = kullan , yeni...

        Scanner input = new Scanner(System.in);

        // 2. Adım: kullanıcıya ne istediğini, ne yapacağını söyle

        System.out.println("Hey kullanıcı yasini gir...");


        // 3. Adım: Kullanıcıdan aldığıız datayı bir variablenin içine koyun.
        byte age = input.nextByte();

        System.out.println("Hey kullanıcı senin yasin" + age);

    }
}
