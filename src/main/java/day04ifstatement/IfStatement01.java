package day04ifstatement;

public class IfStatement01 {

    public static void main(String[] args) {
        // if it rains I will cancel the picnic
        // if statemenet belli kodları belli şartla bağlı olarak çalıştırmaya yarar.

        // Example  1: Sayı pozitifse ekrana pozitif yazdırın.
        int s = 12;

        if (s>0) {
            System.out.println("positive");


        }

        // example   2: verilen karakter büyük harf ise ekrana "büyük harf" yazıdırn

        char harf = 'A';

        if (harf>='A' && harf<='Z'){

            System.out.println("büyük harf");


            /*
             && işlemi sadece boolean lar ile kullanılır.
                true && true = true
                true && false= false
                false && true = false
                false && false = false

                && işlemi mükemmeliyetçidir. true sonucunu alabilmek için her şey true olmalıdır.
                bir tane false varsa sonuç false olur

             */

            // example  3: verilen bir sayı 3 basamaklı ise ekrana "üç basamaklı " yazınız



            int sayi = -250; // alt satırdki Math.abs olan bölüm negatif sayılar da 3 basamaklı olduğu için
                            // negatif sayıyı mutlak değer içine almasını söylediğimiz kod. eğer sayı pozitif ise
                            // o kod a gerek yoktur.
            sayi= Math.abs(sayi);
            if (sayi >= 100 && sayi <= 999){
                System.out.println("üç basamaklı");
            }

        }

        // Example   4: verilen sayı çif sayı ise ekrana "çift sayı" yazdırınız.

        int sayi2 = 36;
        sayi2 =Math.abs(sayi2);

        // = işareti atama operatörüdür. Matematikteki eşittir anlamına gelmez.
        // Mat deki eşittir sembolu java da == çift eşittir şeklindedir.
        if (sayi2%2==0) {
            System.out.println("Cift Sayi");
        }

        // Example   5: Verilen sayı 300 den küçük veya 1200 den büyük ise ekrana "harika sayı" yazdırın.


        int r = 250;

        // veya || demektir. veya sadece booleanlar da kullanılır.


        /*
    true || true ==> true
    true || false ==> true
    false || true ==> true
    false || false ==> false
 */
        if (r<300 || r>1200){
            System.out.println("Harika Sayi ");

        }
    }
}
