package day07ternarystringmanipulation;

public class Ternary01 {

    public static void main(String[] args) {

        //Example 1: Bir sayinin pozitif olup olmadigini ekrana yazdiran kodu yaziniz

        //1.Way: if-else
        int a = -12;
        if(a>0){
            System.out.println("Pozitif");
        }else{
            System.out.println("Pozitif degil");
        }

        //2.Yol: ternary
        //Condition   ?  Condition dogru ise uygulanacak kod   :   Condition yanlis ise uygulanacak kod
        String sonuc =     a>0      ?           "Pozitif"                    :            "Pozitif degil";
        System.out.println(sonuc);

        // Example  2: iki sayıdan küçük olanı seçen kodu yazınız

        int b =12;
        int c=23;
        int minimum = b<c ? b : c;
        System.out.println(minimum);

       // Example  3: Verilen bir sayının mutlak değerini hesaplayan kodu yazınız.

        int d = -45;
       int abs = d<0 ? -1*d  : d;
        System.out.println(abs);

       // Example  4: İki tane sayı aynı işaretli ise bu sayıları çarpınız.Farklı işaretli ise işlem yapamam mesajı veriniz.

        int e = -12;
        int f= 10;
        //Ternary farklı data tiplerinde sonuç return ederse, sonucun data tipini "Object" yapınız.
       Object islem = (e>0 && f>0) || (e<0 && f<0)  ? e*f  : "İşlem yapamam";
        System.out.println(islem);

        // Javada her class ın en az 1 tane parent class ı vardır.Sadece Object clasın parent classı yoktur.



    }

}