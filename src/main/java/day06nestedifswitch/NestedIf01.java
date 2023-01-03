package day06nestedifswitch;

import java.util.Scanner;

public class NestedIf01 {
    public static void main(String[] args) {
        // Password kontrolu yapan bir kod yazacağız

        /*
        Password un ilk harfi büyük harf ise
        'A' olursa geçerli password, aksi halde geçersiz password.
        Passwordun ilk harfi küçük harf ise ;
        'z' olursa geçerli password, aksi halde geçersiz password.
         */


        // JAva "nested" kodları çalıştırırken çok zaman harcar. buna "time complexity" denir
        // bu yüzden mümkünse "nested" kod yazmamaya çalışırız.

     String pwd = "Axy12!";
     char ilkHarf = pwd.charAt(0);

     if(ilkHarf>='A' && ilkHarf<= 'Z'){

         if (ilkHarf == 'A') {
             System.out.println("Geçerli PAssword");
         } else {
             System.out.println("Geçersiz Password");

         }

     } else if (ilkHarf>='a' && ilkHarf<= 'z') {
         if (ilkHarf == 'z') {
             System.out.println("Geçerli PAssword");
         } else {
             System.out.println("Geçersiz Password");
         }
     }else{
         System.out.println("İlk karakter harf olmalıdır");

     }
    }
    }
