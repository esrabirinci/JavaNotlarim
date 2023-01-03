package day16multidimensionalarraylists;

import java.util.Arrays;

public class MultidimensionalArray01 {

/*
Array veya collection varsa for each loop kullanmak ilk tercihiniz olsun
array veya collection var ama index kullanmak zorundasınız, o zaman for each loop çalışmaz. for loop veya while loop veya
 do while loop kullanmalısınız
 */
    public static void main(String[] args) {
        ////Bir tane integer multidimensional array olusturunuz
        ////Bu array'deki tum sayilarin toplamini veren kodu yaziniz.

        int arr [][] = {{2, 5, 1},{32, 75},{13, 21, 43, 56}};
        int sum = 0;
        for (int[] w: arr) {

            for (int k : w){
                sum = sum + k;
            }
        }
        System.out.println(sum);

        // *********Bir multidimensional array i normal array e çeviren kodu yazınız********
        // {{2, 5, 1},{32, 75}} ===>> {2, 5, 1, 35, 75}

        //1 -Multidimensional array deki eleman sayısını bulunuz. Çünkü yeni bir array oluşturmalıyız ve bu yeni array in
        // uzunluğu orijinal array in eleman sayısına eşit olmalıdır.

        int brr [][] = {{2, 5, 1},{32, 75}};
        int toplam = 0;
        for (int[] w : brr){

          toplam=  toplam+ w.length;
        }

        System.out.println(toplam);
  // yukarıdaki bölümde multidimensional in içindeki eleman sayısını bulduk // 5


        int idx =0;
        int crr[] = new int [toplam];
 // yukarda [ 0, 0, 0, 0, 0] sonucunu bulduk


        for (int[] w : brr){
            for (int k : w){
                crr[idx]= k;
                idx++;
            }
        }
        System.out.println(Arrays.toString(crr)); //  {2, 5, 1, 35, 75}
    }
}
