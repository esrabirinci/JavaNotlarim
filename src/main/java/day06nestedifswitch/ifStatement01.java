package day06nestedifswitch;

import java.util.Scanner;

public class ifStatement01 {

    public static void main(String[] args) {

        //Type a code, get age from user and decide which stage on it
        // Kullanıcıdan yaş değerini alan ve yaşın hangi evrede olduğunu aşağıdaki tabloya göre ekrana yazdırınız
        //0 - 4 =>  bebek
        //5 - 12 =>  çocuk
        //13 - 20 => genç
        //21 - 30 =>  yetişkin
        //else  tanımlanmamış evre

        Scanner girdi = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz..");

        byte yas = girdi.nextByte();

        if(yas<0){
            System.out.println("yaş için negatif sayılar kullanılamaz lütfen geçerli bir sayı giriniz");
        } else if(yas<5){
            System.out.println("bebek");

        } else if (yas<13){
            System.out.println("çocuk");
        } else if(yas<21){
            System.out.println("genç");
        } else if(yas<31){
            System.out.println("yetişkin");

        } else{
            System.out.println("Bu yaş aralığında tanımlanmış bir evre blunmamaktadır");

        }
        {
//  // Boundary Valve Analyze Test (BVA): Sınır değeri analiz testidir.
//        // Kritik değerleri,öncesini ve sonrasını test etme yönteminin ismidir.
        }

    }
}
