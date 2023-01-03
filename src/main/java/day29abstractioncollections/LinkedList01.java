package day29abstractioncollections;

import java.util.LinkedList;

public class LinkedList01 {

    /*
    Array list ler index kullanır, ama index kullanmak eleman ekleme ve eleman silme işlemlerinde bize zaman kaybettirir.
    Çünkü bir çok elemanın re-index edilmeis gerekir.

    LinkedList eleman ekleme ve eleman silmede cok basarilidir. Bu yuzden eleman ekleme ve eleman silme islemlerini
    cokca yapacaginiz durumlarda LinkedList kullanmalisiniz.

    ArrayList eleman bulma (search) işlemlerinde çok başarılıdır.
    LinkedList eleman bulma (search) işlemlerinde başarısızdır.

    */

    /*
    1)LinkedList teki  her eleman 2 bölümden oluşur. i- Data ii- Pointer
    2)LinkedList teki her bir eleman NODE olarak adlandırılır
    3)LinkedList ler eleman ekleme ve eleman silme işlemlerinde çok başarılıdırlar.
    4)LinkedLis ler eleman arama işlemlerinde başarısızdırlar.
    5) 3. ve 4. maddelerden dolayı, eleman ekleme ve eleman silme işlemlerinin çok yapılacağı durumlarda Linklist kullanılmalıdır.
    6) ArrayList ler index kullanır. LinkListler index kullanmaz.
    7) İndex kullanmak eleman bulma işlemlerinde çok başarılıdır. bu yüzden eleman bulma işlemlerini çok yapacaksanız ArrayList kullanmalısınız
     */
    public static void main(String[] args) {
        LinkedList<String> visitors = new LinkedList<>();
        visitors.add("Tom");
        visitors.add("Hanks");
        visitors.add("Tom Hanks");
        visitors.add("Brad");
        visitors.add("Pitt");
        visitors.add("Brad Pitt");
        visitors.add(2,"Angelina Jolie");
        visitors.add("Brad Pitt");
        visitors.add("Tom Hanks");

        System.out.println(visitors); //[Tom, Hanks, Angelina Jolie, Tom Hanks, Brad, Pitt, Brad Pitt, Brad Pitt, Tom Hanks]

        //LinkedListler ekleme ve silme işlemlerinde çok başarılı olduklarından,
        // ekleme ve silme ile alakalı çok fazla method içerir

        visitors.addLast("Ajda Pekkan");
        visitors.addFirst("Cüneyt Arkın");//[Cüneyt Arkın, Tom, Hanks, Angelina Jolie, Tom Hanks, Brad, Pitt, Brad Pitt, Brad Pitt, Tom Hanks, Ajda Pekkan]

        visitors.removeLast();
        System.out.println(visitors); //[Cüneyt Arkın, Tom, Hanks, Angelina Jolie, Tom Hanks, Brad, Pitt, Brad Pitt, Brad Pitt, Tom Hanks]

        visitors.removeFirstOccurrence("Tom Hanks");
        System.out.println(visitors); //[Cüneyt Arkın, Tom, Hanks, Angelina Jolie, Brad, Pitt, Brad Pitt, Brad Pitt, Tom Hanks]

        visitors.removeLastOccurrence("Brad Pitt");
        System.out.println(visitors); //[Cüneyt Arkın, Tom, Hanks, Angelina Jolie, Brad, Pitt, Brad Pitt, Tom Hanks]


       /*
                removes and returns the first element of this list.
                This method is equivalent to removeFirst().

                Throws:              NoSuchElementException – if this list is empty
        */
        String firstEl = visitors.pop();// Cut + Paste ==> Ctrl+X
        System.out.println(firstEl);//Cüneyt Arkın
        System.out.println(visitors);//[Tom, Hanks, Angelina Jolie, Brad, Pitt, Brad Pitt, Tom Hanks]


        LinkedList<String> myList = new LinkedList<>();
        myList.pop();
        System.out.println(); // NoSuchElementException attı. Çünkü linkleted boşşşşşş


    }
}
