package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {
        // binarysSearch() methodunu kullanarak bir elemanın arrayde olup olmadığını anlarız.

        // BinarysSearch() methodunu kullanmadan önce mutlaka arrays.sort kullanılmalıdır.
        // BinarysSearch() methodu aradığınız eleman Array de varsa, o elemanın index ini return eder.
        // BinarysSearch() methodu aradığınız eleman Array de yoksa "- a" şeklinde negatif bir sayı alırsınız.
        // Bu sayıdaki "-" işaretinin anlamı bu eleman array de yok demektir."a" nın anlamı ,"olsaydı kaçıncı sırada olurdu" demektir
        // BinarysSearch() methodu tekrarlayan elemanlar için KULLANILMAZ



        int arr []= {12, 31, 43, 14};
        int sayi = 43;

        Arrays.sort(arr);
        int idx1= Arrays.binarySearch(arr,sayi); // (sort yaptıktan sonra indekse bakar 12,14,31,43)
        System.out.println(idx1);

        //verilen ler arasında yazılan değer yoksa ne yaparız
        int sayi2=58;
        int sonuc= Arrays.binarySearch(arr,sayi2);

        System.out.println(sonuc); // -5 çıktı  1) hangi sırada olduğunu söyler 2) - işareti eleman yok
    }
}
