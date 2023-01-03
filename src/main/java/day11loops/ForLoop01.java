package day11loops;

public class ForLoop01 {

    public static void main(String[] args) {

        //Examle  1: 3 den 6 ya kadar tam sayıların toplamını bulan kodu yazınız.

        int sum = 0;
        for (int i = 3; i < 7; i++) {
            sum = sum + i;

        }
        //NOT: sout loop un dışına yazılırsa, sadece sum ın sadece son değerini ekrana yazdırır.
        // loop un içine yazılırsa her biri loop için sum ın hangi değerleri aldığını yazdırıır.
        System.out.println(sum);


        //Example  2: 6 dan 3 e kadar tam sayıların çarpımını bulan kodu yazınız.
        int multiply = 1;
        for(int a = 6; a>2; a--){
            multiply = multiply*a;
        }
        System.out.println(multiply);


        // EXAMPLE  3: Size verilen bir tamsayının rakamları toplamını bulunuz.
        // Verilen sayı 385 (3+8+5= 16)
        int num= 385;
        num = Math.abs(num);
        int sonuc = 0;
        for(int i =num; i>0; i=i/10){
                sonuc= sonuc + i%10;
        }
        System.out.println(sonuc);


        //Example  4: Size verilen bir stringi ters çeviren kodu yazınız.
        // "Kaba"===> "abaK"

        String str = "Kaba";

        // Concatination yapacaksanız "" kullanın

        String ters = "";
        for(int i= str.length()-1; i>=0;i-- ){
            char c = str.charAt(i);
            ters = ters + c;
        }
        System.out.println(ters);


    }
}
