package day32maps;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators02 {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Z");
        myList.add("K");
        myList.add("A");
        myList.add("J");
        myList.add("M");

    // Example 1 : Iterators kullanarak list elemanlarını tersten ekrana yazdırınız
        ListIterator<String> itr = myList.listIterator();

        //hasNext() methdu, pointerdan sonra eleman varsa "true" yoksa "false " return eder.
        // next() methodu ponter i bir sonrki elemanın önüüne koyar  ve üstünden atladığı elemanı return eder.
        while (itr.hasNext()){
            itr.next();  //// bu loop bittiğinde pointer en sona gelmiş olur////
        }

        // hasPrevious() methodu, pointer'dan önce eleman varsa true, yoksa false return eder.
        // previous() methodu, pointer'ı bir önceki elemanın sonuna koyar ve üstünden atladığı elemanı return eder.
        while (itr.hasPrevious()){
            String el = itr.previous();
            System.out.print(el + " "); //M J A K Z
        }
        System.out.println(myList);
        //Example  2: Listteki tüm elemanları siliniz.

        while (itr.hasNext()){
            itr.next(); // pointer i sağa itecek
            itr.remove(); // üstünden atlanan elemanı silecek
        }
        System.out.println(myList);



        /*
        ListIterator de
        1)hasNext() 2)next()  3)set()  4)hasPrevious()  5)previous  6)remove() methodları vardır
        2) Iteratorda 1- hasNext() 2- next() 3- remove() methodları vardır.
         */

        //eger iki tarafli hareket etmek istemiyorsaniz iterator kullanin
        //eger sadece list elemanlarinin silinmesi ile ugrasiyorsaniz iterator kullanin.
        List<String> yourList = new ArrayList<>();
        yourList.add("Z");
        yourList.add("K");
        yourList.add("A");
        yourList.add("J");
        yourList.add("M");

        Iterator<String> iterator = yourList.iterator();
        while (iterator.hasNext()){
            String el =iterator.next();
            System.out.print(el);   //ZKAJM
        }
    }
}
