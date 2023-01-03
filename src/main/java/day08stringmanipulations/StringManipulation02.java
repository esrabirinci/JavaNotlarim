package day08stringmanipulations;

public class StringManipulation02 {

    public static void main(String[] args) {

        //Example  1: Bir string deki space haric, kaç tane character kullanıldığını gösteren kodu yazınız.
         //           "Ali okula gitti."  ==> 14 karakter var space hariç.

        String str = "Ali okula gitti.";
        // replace methodu: bir stringdeki herhanfgi bir karakteri veya karakterleri değiştirmek için kullanılır.

       int num =  str.replace(" ", "").length();
        System.out.println(num);  //14 çıktı

        //Example  2: Bir stringdeki tüm "a" harflerini 'A' büyük A ya çeviriniz.

        String s = "Ankara'nın taşına gözlerimin yaşına bak.";
       String yeniS=  s.replace("a","A");
        System.out.println(yeniS);
        //AnkArA'nın tAşınA gözlerimin yAşınA bAk.

        //Example  3: Bir string deki "kara" kelimelerinin yerine "*" koyunuz

        String t = "Kara kara düşünme Ankara";
       String yeniT=  t.replace("kara", "*");
        System.out.println(yeniT);    //Kara * düşünme An*

// EXAMPLE 4: Bir string deki tüm sayıları "*" a çeviriniz.
        // AC202117004  ===> AC********

        String stdId = "AC202117004";
        String yeniStdId=  stdId.replaceAll("[0-9]", "*");

        System.out.println(yeniStdId);

        /*
        Bir grup datayı ifade eden kodlara "Regex" denir.
        regex= regular expressions un kısaltılmış halidir.


        1- Tüm rakamlar ==> [0-9]
        2- Tüm küçük harfler ==> [a-z]
        3- Tüm büyük harfler ==> [A-Z]
        4- Tüm harfler ==> [a-zA-Z]
        5- Sesli harfler ==> [aeiouAEIOU]
        6- Space karakteri ==>[ ]
        7- Tüm rakamlar ve tüm harfler ==> [0-9a-zA-Z]
        8- Tüm noktalama işaretleri ==> \\p{Punct}

        1-rakamlar hariç tüm karakterler==> [^0-9]
        2-küçük harfler hariç tüm karakterler ==>[^a-z]
        3- büyük harfler hariç tüm karakterler ==> [^A-Z]
        4-tüm harfler hariç, tüm karakterler ==> [^a-zA-Z]
        5-Space hariç ==> [^ ]


         */


        //Example  5: Verilen bir stringdeki kullanılan noktalama işareti ve rakamlar  ve space karakteri hariç
        //            tüm karakterlerin sayısını bulan kodu yazınız.

        String u = "Ali 13 yasinda dersem inanma!...";
        int sonuc= u.
                replaceAll("[0-9]", "").
                replace(" ", "").
                replaceAll("\\p{Punct}", "").
                length();
        System.out.println(sonuc);

        //Example   6: Bir passwordün geçerli olup olmadığını aşağıdaki kurallara  göre test eden kodu yazınız.
         //           i- Space hariç en az 8 karakter olmalı
        //            ii- En az 1 sembol içermeli
        //            iii- En az 1 rakam içermeli
        //            iiii- En az 1 büyük harf içermeli
        //            iiiii- En az 1 küçük harf içermeli

        String pwd = "B78c? K!m";

        //           i- Space hariç en az 8 karakter olmalı
        boolean i = pwd.replace(" ", "").length()>7;

        //            ii- En az 1 sembol içermeli
        boolean ii = pwd.replaceAll("[0-9a-zA-Z ]", "").length()>0;

        //            iii- En az 1 rakam içermeli
        boolean iii = pwd.replaceAll("[^0-9]","").length()>0;

       //            iiii- En az 1 büyük harf içermeli

        boolean iiii = pwd.replaceAll("[^A-Z]", "").length()>0;


        //            iiiii- En az 1 küçük harf içermeli

        boolean iiiii = pwd.replaceAll("[^a-z]", "").length()>0;

        boolean pwdGecerli = i && ii && iii & iiii &iiiii;

        if(pwdGecerli) {
            System.out.println("Passwordiniz  geçerlidir..");
        }else {
            System.out.println("Password geçerli değildir..");
        }


        //EXample  7: Bir stringdeki noktalama işaretlerinin sayısını gösteren kodu yazınız.

        String cumle = "Sen yapmazsan, ben yapmazsam, kim yapacak?...";

        int number = cumle.replaceAll("[^\\p{Punct}]", "").length();

        System.out.println(number);

        //Example  8: Verilen bir String "Al" ile başlıyor ve "x" ile bitiyorsa , ekrana "HARİKA" yazdırın.
                 //       aksi halde "Normal" yazdırın

        String v = "Alex";
       boolean baslangic=  v.startsWith("Al");
       boolean bitis = v.endsWith("x");

       String result = baslangic && bitis ? "Harika" : "Normal";
        System.out.println(result);



    }
}
