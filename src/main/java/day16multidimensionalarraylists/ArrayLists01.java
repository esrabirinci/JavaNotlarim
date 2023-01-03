package day16multidimensionalarraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {

    /*Interview sorularından biri

    ArrayListler aynı data tipine sahip birden fazla datayı depolamak için kullanılır.
    Array ile Array listin farkı nedir?***** (interwiev sorusu) ****
    1- array oluştururken arrayin içine kaç tane eleman koymamız gerektiğini söylemeliyiz ve söylediğimiz eleman
    sayısından fazla eleman koyamayız.
    barrayler eleman sayısında "fixed" dirler.
    ArrayListe oluştururken eleman sayısı söylemeye gerek yok, çünkü ArrayListler eleman sayısıında "flexible"dırlar.
    (esnektirler)

    2-Arraylerin içine "primitive" ve "referenceler" lar konabilir.
    ArrayListlerin içine ise SADECE "non primitive"ler konulur.

    3-arrayler de super fast tir, yani çok hızlı
    Arrayler memory i çok az kullanır.
    eğer length hakkında eminseniz array kullanın (örnek haftanın günü hep 7 dir)
    Not: eleman sayısı kesin belli olan çoklu dataları depolamk için array kullanırız.
    Ama eleman sayısı değişken olan çoklu datalar için array kullanma riskini alma.


     */
    public static void main(String[] args) {
       // ArrayList nasıl oluşturulur?
       // 1.YOL
        ArrayList<Integer> age = new ArrayList<Integer>();
        //2. YOL
        ArrayList<Integer> heights = new ArrayList<>();
        // 3.YOL
       List<Integer> nums = new ArrayList<>();//**** genellikle 2. ve 3. yol kulanılır, en çok 3. kullanılır.kısa old için.


        //Arraylistler nasıl yazdırılır?
        System.out.println(nums); // []

        //ArrayListlere nasıl eleman eklenir?
        // add() methodu her zaman elemanı en sona ekler.(Insertion order) Yerleştirme sırasına göre dizer.

        nums.add(21); //boolean return eder(true(görev tamam)-false(yerleştirilemedi))
        nums.add(18);
        nums.add(20);
        System.out.println(nums); // [21, 18, 20]
        nums.add(1,50);//hiç birşey return etmez. data tipi void old.için
        System.out.println(nums); //[21, 50, 18, 20]

        List<Integer> prices = new ArrayList<>();
        prices.add(23);
        prices.add(185);
        nums.addAll(prices);
        System.out.println(nums); // [21, 50, 18, 20, 23, 185]
        System.out.println(prices); //[23, 185]

        nums.addAll(2,prices);
        System.out.println(nums); //[21, 50, 23, 185, 18, 20, 23, 185]

        //ArrayListlerin eleman sayısı nasıl bulunur? // size()
       int elemanSayisi= nums.size();
        System.out.println(elemanSayisi);

        // ArrayListlerde herhangi bir eleman nasıl seçilir?
        // get methodu istenen bir indekteki elemanı verir

        int el1= nums.get(3);
        System.out.println(el1);
        // ArrayListin boş olup olmadığını nasıl anlarız?
       boolean bos1 = nums.isEmpty();
        System.out.println(bos1);

    //  boolean bos2 = ages.isEmpty();//
      //  System.out.println(bos2);

        // Arraylistte bir eleman nasıl değiştirilir?
       nums.set(3, 200);
        System.out.println(nums);

        //Example  1: nums ArrayList indeki "tüm tek sayıları" 11 artırdıktan sonra ekrana yazdırınız.

        for (int w: nums){
            if (w%2!=0){

                nums.set(nums.indexOf(w), w+11 );

            }
        }

        System.out.println(nums); // [21, 50, 23, 200, 18, 20, 23, 185] böyle idi
                                 // [32, 50, 34, 200, 18, 20, 34, 196] böyle oldu

        // remove methodunun içine tam sayı koyarsanız, java onu index olarak kabul eder.
       // nums.remove(200);
        //System.out.println(nums); hata verir // [32, 50, 34, 200, 18, 20, 34, 196]

        //ArrayListten 200 elemanının ilk görünümünü siliniz.

        //NOT 1: Tüm tamsayılar Java için aksi söylenmedikçe primitive dir. yani int tir.
        //NOT 2: Primitiveler ArrayListlerin elemanı olamazlar
        //NO^: Primitive i wrapper class a çevirirseniz non primitive olur.
//        // ve non primitiveler arraylistlerin elemanı olur. ındex olamaz
//        Integer sayi= 200;
//        nums.remove(sayi);
//        System.out.println(nums);[32, 50, 34, 18, 20, 34, 196];





    }
}
