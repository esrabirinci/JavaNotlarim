package day03typecastingwrapperscanning;

public class TypeCasting01 {

    // Type Casting: Bir numerik data type ni diğer numerik data type a çevirmek demektir.
    //               byte < short< int < long < float < double

    // Not 1: Data type leri  küçükten büyüğe çevirme işlemine "Auto widening" (otomatik genişletme) denir.
    // Not 2 :Data type ları büyükten küçüğe çevirme işlemine " Explicit Narrowing" (açıkça daraltma) denir.


    public static void main(String[] args) {

       byte age = 23;

       int newAge = age;


       long population = 1234;

       int newPopulation = (int)population;


       // Example 1: Short u double ye çeviren kodu yazınız.
        //        2: float ı byte yapan kodu yazınız.


        short numOfStudenst = 235;
        float newNumOfStudents = numOfStudenst;

        float price = 12.99f;
        byte newPrice = (byte)price;

        System.out.println(newPrice);    // Java ondalık sayıyı tam sayıya çevirirken yuvarlama yapmaz.
                                        // Java ondalık sayıyı tam sayıya çevirirken ondalıkları siler.

        int number = 515;
        byte newNumber = (byte)number;

        System.out.println(newNumber);    // 3  nerden geldi? Java 515 i 256 (byte in toplam sayı adedi) ya böldü. kalanı return etti.

        int num = 510;
        byte newNum = (byte)num;

        System.out.println(newNum); // -2 nerden geldi? 501 bölü 256 kalan 2
    }
}
