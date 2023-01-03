package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {

        //Example  1: Size verilen bir int arraydeki en büyük negarif ve en küçük pozitif elemanı bulunuz
        //

        int arr[]= {-12, 18, -5, 23, -2, 0};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int maxnegative = arr[0];
        int minpozitive = arr[arr.length-1];
        for (int w : arr){
            if(w<0){
                maxnegative = Math.max(maxnegative, w);
            }
            if(w>0){
                minpozitive = Math.min(minpozitive,w);
}
        }

        System.out.println(maxnegative + " and " + minpozitive);
    }
}
