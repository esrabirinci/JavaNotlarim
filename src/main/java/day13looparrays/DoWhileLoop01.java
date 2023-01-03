package day13looparrays;

import java.util.Scanner;

public class DoWhileLoop01 {
    public static void main(String[] args) {


        //Example 1: Kullanıcıdan bir sayı alınız, sayı 100'den küçükse ekrana "Kazandın!" yazdırın.
//           Aksi halde ekrana "Kaybettin!" yazdırın.
//           Kullanıcı kazandıkça oyun devam etmeli.

        Scanner girdi = new Scanner(System.in);
//        int sayi = 0;
//        do
//
//        {
//            System.out.println("Bir sayı giriniz:");
//            sayi = girdi.nextInt();
//
//            if (sayi < 100) {
//                System.out.println("Kazandınız!");
//            }
//        }while(sayi<100);
//        System.out.println("Kaybettiniz!");


        //Example  2: Kullanıcıdan ismini alınız ilk harfinin büyük harf olup olmadığını kontrol ediniz.

//       do{
//           System.out.println("İsim giriniz");
//           char ilkharf = girdi.next().charAt(0);
//
//           if(ilkharf>='A' && ilkharf<='Z') {
//               System.out.println("ismi başarıyla girdiniz");
//           }else{
//               System.out.println("ismi yanlış girdiğiniz için işlemini iptal edilmiştir.");
//               break;
//           }
//       }while (true); // sonsuz döngü oluşturulur
//

        //Infinite Loop: Sonsuz döngü :
        //Loop oluştururken sonsuz olmamasına dikkat ediniz. yoksa hep döner durur.

        //Artırma Azaltma kısmında hata yaparsanız infinite sorunsalı oluşur.

//        for ( int i = 1; i<4;i--){
//            System.out.print("hi"); // BUNU SAKIN ÇALIŞTIRMAAAAA Sonsuz Döngüüüüü
//        }

//        //Artırma Azaltma kısmındı yazmazsanız infinite sorunsalı oluşur.
//        for ( int i = 1; i<4;  ){
//            System.out.print("hi"); // BUNU SAKIN ÇALIŞTIRMAAAAA Sonsuz Döngüüüüü
//        }

        int i = 12;
        while (i<15){
            System.out.println("hi");

        }
    }

}


