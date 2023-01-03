package day10stringmanipulation;

public class StringManipulations01 {
    public static void main(String[] args) {

        String a = "Java kolaydır.";
        boolean b = a.startsWith("va", 2);
        System.out.println(b);

        //startsWith("kola", 5) kodu ilk 5 karakter'den sonraki String'e bakar ve o String'in "kola" ile baslayip baslamadigini kontrol eder.
//"kola" ile basliyorsa "true", baslamiyorsa "false" return eder.

//        boolean b = a.startsWith("kola", 5);
//        System.out.println(b);

        //replaceFirst("a", "*"); kod String deki ilk "a" yi "*" e cevirir.
//replace("a", "*"); kod String deki tum "a" lari "*" e cevirir.

        String c = a.replaceFirst("a", "*");
        System.out.println(c);//J*va kolaydir.

        String d = a.concat(" Anladın mı?");
        System.out.println(d); // Java kolaydır. anladın mı?

        // Concat methodu iki sitringi birbirine eklemeye yarar.
        // Concatention işlemi iki tür işlem ile yapılabilir. 1- + ile 2- concat() ile
        // Java bir işlem için method üretmişse o methodu kullanmak "best  practice" dir



        System.out.println(a + " Anladın mı?");

        String e = "     Tom Hanks     ";
        System.out.println(e);

        // trim methodu baş ve sonundaki space karakterlerini siler. Kelime aralarındaki space karakterlerine dokunmaz.

        a.trim();
        String f = e.trim();
        System.out.println(f);


         // compaireTo(i)  bu kod iki tane string i alfabetik (lexicographic) olarak karşılaştırır.
        // büyük küçük harf duyarlıdır.
        //Büyük harf küçük harfe duyarlı olmasını istemezseniz h.compaireToIgnoreCase(i) kullanabilirsiniz.
        // Bu kodda "h" nin alfabetik sırasından "i" nin alfabetik sırası çıkarılır.
        String h = "Lava";
        String i = "Java";
        int k = h.compareTo(i);
        System.out.println(k);

       //a.repeat(3) kodu a String'ini yan yana 3 kere yapıştırır.
        //repeat(0) boş String return eder.
       String n = a.repeat(3);
        System.out.println(n);








    }
}
