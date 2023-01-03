package day12loops;

import java.util.Scanner;

public class NestedForLoop01 {
    public static void main(String[] args) {


        // Example 1: aşağıdaki şekli ekrana yazdıran kodu yazınız.
        //     ****
        //     ****
        //     ****

//        Scanner girdi = new Scanner(System.in);
//        System.out.println("Satır sayısını giriniz");
//        int satir= girdi.nextInt();
//
//        System.out.println("Sütun sayısını giriniz");
//        int sutun = girdi.nextInt();
//        System.out.println("karakter seç bakalım");
//        char ch = girdi.next().charAt(0);
//
//        for (int i =1; i<=satir ; i++){
//            for (int k= 1; k<=sutun; k++){
//                System.out.print(ch);
//        }
//            System.out.println();
//       }

      /*
       Example  2: Aşağıdaki şekli çizen kodu yazınız.

                            1 2
                            1 2 3
                            1 2 3
                            1 2 3 4
                            1 2 3 4 5
//       */
//
//        for (int i = 1; i<6; i++){
//
//            for (int k =1; k<=i; k++){
//                System.out.print(k + " ");
//            }
//            System.out.println();
//        }

        /*
        example  3: Aşağıdaki şekli çizen kodu yazınız


                    * * * *
                    * * *
                    * *
                    *
       */
        int row = 4;
        for (int i= 1; i<=row; i++){

            for (int k= row; k>=i; k--){
                System.out.print("* ");

            }
            System.out.println();
        }

    }
}
