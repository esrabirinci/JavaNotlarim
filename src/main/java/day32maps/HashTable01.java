package day32maps;

import java.util.Hashtable;

public class HashTable01 {
    public static void main(String[] args) {


        /*
        1- Hastable bir map tir
        2- Hastable entryset leri herhangi bir sıralamaya tabi tutmaz.
        3- HahTable Hashmaplerden daha yavaştır. Çünkü HashTable ler thread safe(çoklu iş yapabilmek) ve synchronized dir.
        4-Hashtable larda  key null olamaz. Key i null yaoarsanız NullPointerException atar.
        5- HAshtableler de value null olamaz. Value yi null yaparsanız, NullPointerException atar

        NOT : toString() methodu objeleri konsola detayları ile görebilmek için classların içinde oluştururlur.
              toString() methodunu oluşturmadan objecti konsola yazdırırsanız Java o object'in adresini yazdırır.
         */


        ///******ınterviewww******
      //  Hashmap ile hashtable arasındaki fark ?
        /*
         INTERWIEW QUESTIONS
                  MAP'LER ARASINDAKI FARKLAR
1) HashMap ve TreeMap ve LinkedHashMap  synchronized ve thread-safe degildir.
    HashTable synchronized ve thread-safe dir.

    2) Treemap'ler natürel order yapar.
     LinkedHashMap giriş sırasına göre listeler.
     HashMap ve Hashtable sıralama yapmaz,rastgele sıralar.

    3) HashMap ve LinkedHashMap'lerde hem key hemde value için null değeri kullanılabilir.
     TreeMap'lerde key'ler icin "null" kullanılmaz.
     HashTable larda ikisi içinde null kullanılmaz.
         */






        Hashtable<String , Integer> countryPopulations = new Hashtable<>();
        countryPopulations.put("USA", 40000000);
        countryPopulations.put("Germany", 83000000);
        countryPopulations.put("Turkey", 90000000);
        System.out.println(countryPopulations);

       // countryPopulations.put(null, 90000000);// Hashtable larda  key null olamaz.NullPointerException
       // countryPopulations.put("France", null); //HAshtableler de value null olamaz.NullPointerException

    Hashtable<String, Students> myStudents = new Hashtable<>();
    myStudents.put("Math", new Students("Tom Hanks","th@gmail.com",21,true));
        System.out.println(myStudents);


       // Students name = myStudents.get("name");
       // System.out.println(name); // null

        String name = myStudents.get("Math").name;
        System.out.println(name);// Tom Hanks

       int age =  myStudents.get("Math").age;
        System.out.println(age);//21





    }
}
