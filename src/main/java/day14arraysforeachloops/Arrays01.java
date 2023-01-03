package day14arraysforeachloops;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {

    public static void main(String[] args) {

        // Arrayslerin içine primitive data tipleri ve reference lar konabilir.

        String str[] = new String[4];
        str[0]= "Java";
        str[1]= "did";
        str[2]= "surprised you";
        System.out.println(Arrays.toString(str));

        // Example  1: String bir Array oluşturunuz ve "Tom" ve "Tom" dan önceki tüm elemanları ekrana yazdırınız

        String arr[] = { "Jane", "Mark", "Christopher", "Tom", "Ali", "Rojda"};

        for(String w : arr){
            System.out.print(w + " ");

            if(w.equals("Tom")){
                break;
            }

        }
        System.out.println();

// Example  2:: String bir Array oluşturunuz ve "Tom" ve "Jane" hariç tüm elemanları yazdırınız
        String brr[] = { "Jane", "Mark", "Christopher", "Tom", "Ali", "Rojda"};

        for(String w : brr){


            if(w.equals("Jane") || w.equals("Tom")){
               continue;
            }
            System.out.print(w + " ");
        }
        System.out.println();



        // Example  3: Kullanıcı ile beraber bir array oluştrunuz.
         // /( Bir öğretmenin sınıfındaki öğrencilerin isimlerini applicationa yüklemesini sağlayan kodu yazınız)

        Scanner input = new Scanner(System.in);
        System.out.println("Kaç öğrenci ismi gireceksiniz");
        int numOfStd = input.nextInt();

        String names[] = new String[numOfStd];

        for (int i= 1 ; i<=numOfStd; i++){
            System.out.println( "Lütfen" + i + ". öğrencinin ilk ismini giriniz");
            System.out.println("Girişi sonlandırmak için q harfine basınız. ");

            String stdName = input.next();


            if(stdName.equalsIgnoreCase("Q")) {
                break;
            }
            names[i-1] = stdName;

        }

        System.out.println(Arrays.toString(names));

    }
}
