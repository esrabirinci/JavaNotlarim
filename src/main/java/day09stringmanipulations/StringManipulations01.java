package day09stringmanipulations;

import java.util.Scanner;

public class StringManipulations01 {

    public static void main(String[] args) {

        String str = "Kara kara düşünme Ankara";

       // NOT: indexOf() nethodu verilen karakter yada karakterlerin "ilk görünümünün" indeksini verir.
        int idxA1 = str.indexOf("kara");
        System.out.println(idxA1);

        // lastIndexOf() nethodu verilen karakter yada karakterlerin "Son görünümünün" indeksini verir.
       int idxA2= str.lastIndexOf("kara");
        System.out.println(idxA2);

        String s = "Mississippi";
        // indexOf() hem char hem de stringle kullanılabilir.
      int idxA3 =  s.indexOf('i');
        System.out.println(idxA3);


        //Example  1: Bir string deki bir karakterin tekrarlı veya tekrarsız olup olmadığını gösteren kodu yazınız.
        // "Helloooo" ==> H -->tekrarsız, e-->kerarsız, l-->tekrarlı o-->tekrarlı

        String t = "Helloooo";
        char c = 'e';
;
        if(t.indexOf(c)== t.lastIndexOf(c)){
            System.out.println("Tekrarsız");
        }else{
            System.out.println("Tekrarlı");
        }

        String u = "Learn Java earn money";
        // indexOf() iki parametre ile kullanılırsa, ikinci parametrede verilen sayı kadar karakteri geçtikten sonra istenen
        // karakterin ilk görünümünün index ini return eder.
        int sonuc = u.indexOf("n",5);
        System.out.println(sonuc);



        //lastIndexOf() iki parametre ile kullanilirsa ikinci parametrede verilen sayiyi index olarak kabule edip en bastan
// bu indexe kadar olan karakterleri bir kutu icine aliniz ve lastIndexOf() method'unu sadece bu kutu icindeki String icin kullaniniz.

        String m = "Hello everyone!";
        int e = m.lastIndexOf("e", 10);
        System.out.println(e);//8

        String m2 = "Hello everyone!";
       int e2 = m2.lastIndexOf("e", 7);
        System.out.println(e2);



        // isEmpty methodu:  Bir stringin boş olup olmadığını kontrol eder.
        //Eğer string de hiç karakter yoksa isEmpty methodu true return eder, herhangi bir karakter varsa false return eder.
        //length()==0 demek isEmpty() true verir demektir
        // Bir stringin boş olup olmadığını anlamak için "length()==0" kullanmayın, isEmpty() kullanın.

        String v = " ";
       boolean bosmu = v.isEmpty();
        System.out.println(bosmu);

        String x = " ";
        //isBlank hem "boş string" için hem de "sadece space içeren" stringler için true return eder.
        boolean blankMi = x.isBlank();
        System.out.println(blankMi); //true

        //Example  2: Kullanıcıdan alınan isim mutlaka "space den farklı" "en az  karakter" içermelidir.
        Scanner girdi = new Scanner(System.in);
        System.out.println("İlk isminizi giriniz");
        String ilk = girdi.nextLine();

        if(ilk.isBlank()) {
            System.out.println("Sana ismini gir dedim");
        }else {
            System.out.println(ilk);
        }








    }
}
