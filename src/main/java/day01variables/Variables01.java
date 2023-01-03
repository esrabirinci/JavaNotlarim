package day01variables;

public class Variables01 {
    //Variable nasil oluşturulur?

    //1) Access Modifier     2) Data Type     3)Variable ismi   4) =  5)Değer    6);

    // Java'da ";" İngilizce'deki "."gibidir.
    // İngilizce de "cumle" deriz, Java da "statement" deriz.

    // "=" sembolü, "Assigment Operator" olarak adlandırılır. Assigmen tin turkçesi atama demektir.
    // "Assigment (Atama) Operator" sağdaki değeri alır, soldaki variablenin içine koyar.
    public int age = 13;

    public int height = 183;

    //Javada Data Type'leri
    /*

                            Primitive Data Type
        1)int: Integere'in kısaltması. Integer tam sayı demektir. 32 bit kullanır.
            Matematikte tam sayıların başı ve sonu yoktur fakat Java'da tam sayıların başı ve sonu vardır.
            En küçük int = -2,147,483,648
            en büyük int =  2,147,483,647

         2) byte: Tamsayılar için kullanılır. 8 bit kullanır.
                   En küçük byte = -128
                   En büyük byte = 127

         3) short: Tamsayılar içindir. 16 bit kullanır.
                    En küçük short = -32768
                    En büyük short =  32767

          4) long: Tamsayılar içindir. İnt in yetmediği yerlerde kullanılır. 64 bit kullanır.
                    En küçük long = -9,223,372,036,854,755,808
                    En büyük long =  9,223,372,036,854,755,807

           5) float: Ondalıklı sayılar içindir. 32 bit kullanır.
           "float" virgülden sonra 7 basamak içerebilir.


           6) double: Ondalıklı sayılar içindir. 64 bit kullanır.
           "double" virgülden sonra 16 basamak içerir.

           "float" değerlerinde sona "f" veya "F" koymanız gerekir.

           7) boolean: "true" veya " false" değerleri için kullanılır.
           1 bit kullanır.

           8) char: Tek karakterler için kullanılır. 16 bit kullanır.
                    A, c, 2, ?,_, =,
                    Note: char a değer yazarken, '*' arasına koyunuz. (tek tırnak) Yoksa hata verir.

                Note: java büyük küçük harfe duyarlıdır.
                Java için TRUE ile true tamamen farklıdır.

          Note: Numeric Data Types : byte < short < int < long < float < double
                Numeric Olmayan Data Types: boolen - char


                                    Non-Primitive Data Types
          sTRİNG:  isim, adres, kimlik numarası gibi, bir veya birden fazla karakter içeren değerlerde kullanilir.
                    String değerleri mutlaka çift tırnak "" arasına konulmalıdır.
                    String non primitive dir.Yani bir String oluşturduğunuzda, Java size bir sürü method verir.


          PRİMİTİVE İLE NON PRİMİTİVE ARASINDAKİ FARK NEDİR?
           1) Non primitive data tiplerinde, değerin yanında methodlar vardır
            primitive data tiplerinde ise sadece değer vardır, method yoktur.
            2) Primitive data tipleri java tarafından oluşturulmuştur. Toplam 8 tanedir. Biz primitive data olşşturamayız.
               Non primitivler java tarafından da oluşturulmuştur. biz de oluşturabiliriz.
               Non primitivler sayılamayacak kadar çoktur. Çünkü her developer data type oluşturabilir.
            3) Primitive data type isimleri küçük harflerle başlar.
               Non Primitive data type isimleri büyük harfle başlar.
            4) Primitive data typler memory de farklı büyüklükte yerler kullanır.
               Non Primitive lerin hepsi memory de aynı büyüklükte yer kullanırlar.
     */
public byte price = 12;

public short populationOfVillage = 23000;

public long cell = 29654756;

public float priceOfShirt = 13.99f;

public double weightOfCell = 0.0000012845;


// Long yazmamıza ragmen, java verilen sayıyı int kabul eder.
// Bu yüzden long bir variable ye "int" aralığının dışında bir sayı verirseniz sayının sonuna "l" ve "L" koyunuz.
public long populationOfWorld = 7000000000L;

public long x = 1234;
// yukarıda l koymadığımız halde problem yok çümkü "1234" int aralığına uyar.

    public boolean isOld = true;
    public boolean isRich = false;

    public char initial = 'S';

    public String name = "Tom Hanks";

    // MAin method arabanın motoru gibidir. Motor yoksa araba olmaz, main ethodsuz program olmaz.
    // Main method çalışmadan hiçbirşey çalışmaz
    public static void main(String[] args) {

    }
}
