package day31maps;

import java.util.*;

public class HashMap01 {
   /*
   1)Map'ler key-value structure kullanir
2)Key'ler unique'dir
3)Value'lar tekrarli data icerebilir
4)Map'lerde eleman degil EntrySet kullaniriz.
5)Key'ler de null tekrarsız olarak kullanılır
6)Value'lar null kabul eder.
7)HashMap'ler EntrySet'leri herhangibir siralamaya tabi tutmaz, rastgele siralar
8)Siralama ile vakit jaybetmedigi icin HashMap'ler cok hizli calisirlar.
    */

    public static void main(String[] args) {
        HashMap<String, Integer>studentAges = new HashMap<>();
        studentAges.put("Ali", 13);//{Ali=13}
        studentAges.put("Tom", 21);//{Tom=21, Ali=13}
        studentAges.put("Brad", 21);//{Tom=21, Ali=13}
        studentAges.put("Ajda", 76);//{Tom=21, Ajda=76, Brad=21, Ali=13}
        studentAges.put("Cüneyt", 75);//{Tom=21, Ajda=76, Brad=21, Cüneyt=75, Ali=13}
        studentAges.put("Ali", 88);// aynı key değerini tekrar kullandığınızda hata vermez overwrite eder. ali 13 tü , ali 88 yazacak
        studentAges.put(null, 55);
        studentAges.put("Ayhan Işık", null);
        studentAges.put("Sadri Alışık", null);

        System.out.println(studentAges);

        // Map ten sadece Key ler nasıl alınır?
        Set<String> keys = studentAges.keySet();
        System.out.println(keys);//[null, Ayhan Işık, Tom, Ajda, Brad, Cüneyt, Ali, Sadri Alışık]

        // Map ten sadece Value ler nasıl alınır?
        Collection<Integer> values =studentAges.values();
        System.out.println(values);//[55, null, 21, 76, 21, 75, 88, null]

        // Belli bir Key e ait value nasıl alınır?
        Integer cuneytage =  studentAges.get("Cüneyt");
        System.out.println(cuneytage);


        //Example 1: Tüm Integer yaşların ortalamasını hesaplayan kodu yazınız.

        Collection<Integer> ages =  studentAges.values();
        Integer sum = 0;
        int sayac = 0;
        for (Integer w :ages) {
            if (w!=null){
                sum = sum + w;
                sayac++;
            }

        }
        System.out.println("Ortalama yaş " + (sum/sayac));

        //Example 4: A ile başlamayan isimlerin içerdiği toplam karakter sayısını bulan kodu yazınız.
        Set<String> names = studentAges.keySet();
        int sum1 = 0;
        for (String w : names){
            if (w!= null && !w.startsWith("A")){
                sum1=sum1 + w.length();
            }
        }

        System.out.println(sum1);

        //remove("Ajda", 76) key'si Ajda ve value'su 76 olan EntrySet i siler ve size boolean return eder.
        boolean result = studentAges.remove("Ajda", 76);
        System.out.println(result);

        Integer result1 = studentAges.remove(null);
        System.out.println(result1);

        //Key varsa value'u ver, key yoksa sizin istediginiz degeri verir
        Integer result2 = studentAges.getOrDefault("Sadriye", 0);
        System.out.println(result2);//12

        //Value null ise ekleme yapar, value null degilse ekleme yapmaz.
        Integer result3 = studentAges.putIfAbsent("Brad", 100);
        System.out.println(result3);//12
        System.out.println(studentAges);

        Integer result4 = studentAges.putIfAbsent("Ayhan Isik", 100);
        System.out.println(result4);
        System.out.println(studentAges);

        //Key yoksa ekleme yapar
        Integer result5 = studentAges.putIfAbsent("Acun Ilicali", 200);
        System.out.println(result5);
        System.out.println(studentAges);

        //replace() method'u value'lari key'e bakarak degistirdi
        studentAges.replace("Acun Ilicali", 49);
        System.out.println(studentAges);

        //replace() method'u value'lari key ve value'yu kontrol ettikten sonra degistirdi
        studentAges.replace("Acun Ilicali", 47, 53);
        System.out.println(studentAges);


        //Example 3:Map deki herbir entry'i ekrana farkli bir satirda olacak sekilde yazdiriniz.
        //          {Ayhan Isik=100, Sadri Alisik=null, Tom=21, Brad=12, Cuneyt=75, Acun Ilicali=49, Ali=88}

        //entrySet() method'u Map'deki elemanlari bir Set'in icine koyarak size verir
        Set<Map.Entry<String,Integer>> entries = studentAges.entrySet();
        for(Map.Entry<String,Integer> w : entries) {
            System.out.println(w);


        }

    }
}
