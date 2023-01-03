package day13loopsarrays;

import java.util.Arrays;
import java.util.Collections;

public class Arrays01 {

    /*
        1) Aynı data tipinde, çoklu datayı depolamak için Java'nın oluşturduğu yapılar vardır.
           Bu yapılardan birisi de "Array" lerdir.
    */

    public static void main(String[] args) {
        //Array nasıl oluşturulur?
        int stdAges[] = new int[7];// [0, 0, 0, 0, 0, 0, 0, ]

        //Array nasıl yazdırılır?
        System.out.println(Arrays.toString(stdAges));

        //Array'lere elemanlar nasıl eklenir?
        stdAges[0] = 12;
        stdAges[1] = 11;
        stdAges[2] = 13;
        stdAges[3] = 14;
        stdAges[4] = 10;
        stdAges[5] = 12;
        stdAges[6] = 12;
        System.out.println(Arrays.toString(stdAges));

        //Array'deki herhangi bir elemanı nasıl yazdırabiliriz?
        System.out.println(stdAges[4]);

        //Example 1: Array'deki en küçük ve en büyük elemanın toplamını ekrana yazdırınız.
        Arrays.sort(stdAges);
        System.out.println(Arrays.toString(stdAges)); //[10, 11, 12, 12, 12, 13, 14]
        int ilk = stdAges[0];
        int son = stdAges[stdAges.length-1]; //Note: length() Stringlerde, length Array'lerde kullanılır.
        System.out.println(ilk+son); // 24

        //Example 2: stdAges arrayi içindeki tüm elemanların toplamını ekrana yazdıran kodu yazınız.

        //1.YOL (for loop)
        int sum = 0;
        for (int i=0 ; i<stdAges.length ; i++){
            sum = sum + stdAges[i];
        }
        System.out.println(sum);

        //2.YOL (while loop)
        int sum1 = 0;
        int i = 0;
        while (i<stdAges.length){
            sum1 = sum1 + stdAges[i];
            i++;
        }
        System.out.println(sum1);

        //3.YOL (do-while loop)
        int k = 0;
        int sum2 = 0;
        do{
            sum2 = sum2 + stdAges[k];
            k++;
        }while (k<stdAges.length);
        System.out.println(sum2);

        //4.YOL (for each loop)
        //for each loop array'lerde ve Collections'larda kullanılır.
        int top = 0;
        for (int w : stdAges){
            top = top + w;
        }
        System.out.println(top);

        //Example 3: String bir array oluşturunuz.
        //           Bu array'a 5 tane isim yerleştiriniz.
        //           Bu isimlerdeki karakter sayılarının toplamını ekrana yazdırınız.

        String stdNames[] = new String[5];// [0, 0, 0, 0, 0]
        stdNames[0] = "Ali";
        stdNames[1] = "Tom";
        stdNames[2] = "Veli";
        stdNames[3] = "Kemal";
        stdNames[4] = "Cem";

        int sum3 = 0;
        for (String w : stdNames){
            sum3 = sum3 + w.length();
        }
        System.out.println(sum3);

        //Example 4: Char bir array oluşturunuz. Bu array'a 5 eleman ekleyiniz. Bu array'deki sadece büyük harfleri ekrana yazdırınız.
        char ch[] = {'A', 'c', 'D', 'k', 'm', 'M'};
        for(char w : ch){
            if (w>='A' && w<='Z'){
                System.out.print(w);
            }
        }








    }

}