package day12loops;

import java.util.Scanner;

public class WhileLoops01 {

    public static void main(String[] args) {

        // Example  1:  3 den 10 a kadar tamsayıları aynı satırda ekrana yazdıran kodu yazınız.

        for (int i = 3; i<11; i++){
            System.out.print(i + " ");
        }

        System.out.println();
        //2. YOL:

        int i=3;
        while (i<11){

            System.out.print(i);
            i++;
        }
        System.out.println();


        // EXAMPLE  2: 17 den 4 e kadar tüm çift sayıları ekrana aynı satırda yazdıran kodu yazınız.

        int k = 17;
        while (k>3) {
            if (k%2 == 0) {
                System.out.print(k + " ");

            }
            k--;
        }
        System.out.println();
        // Example  3:   12 den 67 ye kadar olan sayıların toplamını veren kodu yazınız.
        int sum= 0;
        int m= 12;
        while (m<68){

           sum = sum+m;

            m++;
        }
        System.out.println(sum);


        //Example  4: size verilen bir tam sayının rakamları toplamını ekrana yazdıran kodu yazınız.

        int  sayi = 385;
        int sonuc= 0;
        while (sayi>0) {

          sonuc= sonuc+  sayi%10;
            sayi/=10;

        }
        System.out.print(sonuc);




        //Example 5: Kullanıcıdan aldığınız bir sayının çarpım tablosunu ekrana yazdırınız.

        Scanner girdi = new Scanner(System.in);
        System.out.println(" Çarpım tablosunu görmek için bir sayı giriniz");

        int sayii = girdi.nextInt();
        int n = 1;

        while (n<11) {

            System.out.println(sayii + "x" + n + "=" + sayii*n);
            n++;
        }
    }
}
