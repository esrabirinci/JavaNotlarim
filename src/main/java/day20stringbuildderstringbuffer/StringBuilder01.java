package day20stringbuilderstringbuffer;

public class StringBuilder01 {
    public static void main(String[] args) {
        /*
            1)StringBuilder Java'da bir Class'dır.
            2)StringBuilder, String oluşturmaya yarar.
            3)"String" Class'ı varken neden StringBuilder'a ihtiyaç duyarız.
              Çünkü "String" Class "Immutable Class"dır, ama biz bazen "Mutabele" Stringlere ihtiyaç duyarız.
              StringBuilder bize Mutable String verir.
            4)Immutable Class'larda var olan değer değiştirilemez. Siz var olan bir değeri değiştirmek istediğinizde;
              i)Memory'de yeni bir variable yeni bir değerle oluşturulur.
              ii)Eski variable'nin pointer'ı yeni variable'a döndürülür.
              iii)Eğer bir variable'ı hiçbir pointer göstermiyorsa, o variable Garbage Collector tarafından silinir.

              Mutable Class'larda var olan değer değiştirilebilir. Orijinal değer korunmaz.

            5)String Class'ların immutable yapısı "security" için önemlidir.
              Aynı değere sahip birden fazla String olduğunuda, Java bir tane container oluşturur ve aynı değere sahip String'lerin
              bu container'i kullanmasını temin eder. Bu, memory'yi korumak için iyidir, ancak container'daki değeri bir variable için değiştrdiğimizde
              tüm variable'ların etkilenmesi tehlikesi vardır. Bu tehlike'den kurtulmak için Java, Stringleri immutable(değişmez) yapmıştır.
              Fakat herhangi bir variable'ın değerini değiştirmek için Java bir yol bulmuştur. Değiştirmek istediğiniz variable için
              yeni bir container oluşturur ve variable'ın pointer'ini bu yeni variable'a yönlendirir. Böylelikle hem değişim sağlanmış, hem de diğerleri etkilenmemiş olur.

        */

        String str = "Java";
        str = "Super Java";//Yukarıdaki str variable'ı memory'de sabit tutulur, değeri değiştirilmez, yerine bu satırdaki str variable'ı yeniden oluşturulur.
        System.out.println(str);

        //StringBuilder nasıl oluşturulur?
        //1.YOL
        StringBuilder strb1 = new StringBuilder("Java");
        System.out.println(strb1);

        //2.YOL
        StringBuilder strb2 = new StringBuilder();

        //StringBuilder değer ekleme
        //1.YOL
        strb2.append("Java");
        strb2.append(" is easy");
        strb2.append("!!!");
        System.out.println(strb2);

        //2.YOL
        strb2.append(" Learn").append(" Java earn").append(" money.");//Method chain
        System.out.println(strb2);

        //StringBuilder'larda karakter sayısı nasıl bulunur.
        StringBuilder strb3 = new StringBuilder();
        strb3.append("Cat");
        strb3.append("01234567890123456789");

        int numOfChar = strb3.length();
        System.out.println(numOfChar);//3

        //Capacity aşımlarinda capacity var olanın iki katının iki fazlasına çıkar (varsayılan değer = 16)
        int capacity = strb3.capacity();
        System.out.println(capacity);//34==> 16*2+2

        //setCharAt(2, 'r'); ==> index 2'deki karakteri "r" ye çevirir.
        strb3.setCharAt(2, 'r');
        System.out.println(strb3);

        //delete(3,23); ==> index 3 (dahil) index 23 (hariç)'e kadar tüm karakterleri siler.
        strb3.delete(3, 23);
        System.out.println(strb3);

        //deleteCharAt(2); ==> index 2'deki karakteri siler.
        strb3.deleteCharAt(2);
        System.out.println(strb3);

        //reverse() methodu StringBuilder'ı ters çevirir. Ali ==> ilA
        //"mutable"larda sadece method kullanmak, orijinal değeri değiştirmek için yeterlidir.
        strb3.reverse();
        System.out.println(strb3);

        //"Immutable"larda orijinal değeri değiştirmek için methodu kullanmak yeterli olmaz, bir de atama işlemi yapmalısınız.
        String abc = "Java";
        abc = abc.replace("a", "i");
        System.out.println(abc);

        //toString() method'u StringBuilder'ları String'e çevirir.
        String stringStrb3 = strb3.toString();
        System.out.println(stringStrb3);

        //String'den de StringBuilder'lara aşağıdaki gibi dönebiliriz.
        StringBuilder strb4 = new StringBuilder(stringStrb3);
        System.out.println(strb4);

        //insert(3, "XXXX"); ==> 3. karakterden sonra x'leri koyar.
        strb4.insert(2, "XXXX");
        System.out.println(strb4);

        //insert(3, "KLMNOPRSTV", 5, 8); ==> 3 nolu karakterden sonra, "KLMNOPRSTV" Stringinin index 5, 6, 7 deki karakterlerini yerleştirir.
        strb4.insert(3, "KLMNOPRSTV", 5, 8);
        System.out.println(strb4);

        //a.compareTo(b); ==> methodu, i)StringBuilder'lar tamamıyla aynı ise 0 verir.
        //                             ii)a alfabetik sırada b'den sonra gelirse pozitif olarak aradaki alfabetik sıralama farkını gösterir.
        //                             iii)a alfabetik sırada b'den önce gelirse negatif olarak aradaki alfabetik sıralama farkını gösterir.
        StringBuilder a = new StringBuilder("Java");
        StringBuilder b = new StringBuilder("Java");
        int sonuc = a.compareTo(b);
        System.out.println(sonuc);
    }
}