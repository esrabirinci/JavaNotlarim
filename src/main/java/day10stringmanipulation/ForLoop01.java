package day10stringmanipulation;

public class ForLoop01 {

    public static void main(String[] args) {

        //Example 1: Ekrana 5 kere "Hi" yazdırınız. ŞAka ŞAka 5000 kere  yaz bakalım:)

//        System.out.println("Hi");
//        System.out.println("Hi");
//        System.out.println("Hi");
//        System.out.println("Hi");
//        System.out.println("Hi");


        // Tekrarlı işler için "Loop" kullanırız
        // 4 Çeşit Loop var 1-for-loop 2- while-loop 3- do-whil-loop 4- for-each-loop
        // 4 ü de aynı işi yapar. detayda farklılıkları vardır.

        //1- for-loop
        // Example 2: Ekrana 5 kere "Hi" yazdırınız.
        // ilk bölüme başlangıç değeri   Loop hangi şart altında çalışacak         ıncrement(arttırma) veya Decrement(Azaltma)
        for (int i = 1; i < 6; i++) {
            System.out.println("Hi");
        }

        //Example  3: 4 den 7 ye kadar tüm tamsayıları ekrana yazdıran kodu yazınız.
        for (int i = 4; i < 8; i++) {
            System.out.print(i + " ");
        }

        System.out.println();
        // 14 den 5 e  kadar tam sayıları ekrana yazdıran kodu yazınız

        for (int i = 14; i > 4; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        //Example 4: 14 den beşe kadar tüm çift sayıları yazdırınız.
        for (int i = 14; i > 4; i -= 2) {
            System.out.print(i + " ");
        }

        System.out.println();
// 2.YOL

        for (int i = 14; i > 4; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        //Example 5: 28 den 157 ya kadar tüm tek sayıları ekrana yazdıran kodu yazınız

        for (int i = 28; i < 158; i++) {
            if (i%2!= 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        // Example 6: "Java" stringini "J*a*v*a*" stringine çeviren kodu yazınız.
        String str = "Java";

        for (int i=0 ; i<str.length(); i++){
            System.out.print(str.charAt(i) + "*");
        }
        System.out.println();
        //Example 7: Size verilen String de Tekrarsız krakterleri ekrana yazdırınız.
        // "Helloo Ali" >>> HAi yazmalı

        String s= "Hellooo Ali";

        for(int i=0;i< s.length() ; i++){

            char c = s.charAt(i);
            if(s.indexOf(c)== s.lastIndexOf(c)){
                System.out.print(c);
            }
        }
    }
}
