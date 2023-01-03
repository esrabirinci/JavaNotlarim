package day32maps;

public class StaticBlocks01 {


    public static double pi;
    static {

        System.out.println("static blok 2");
    }
    public static void main(String[] args) {
        System.out.println("Main method");


    }

    //static bloklar ihtiyacımız olan variablelerin class oluşturma safhasında elimizde olmasını sağlar.
    //static bloklar class içindeki her şeyden önce çalıştırılır."main methodaan" ve diğer tüm methodlardan önce çalıştırırlır
    //static bloklar içinde sadece "static variableler" a değer atanabilir.
    //1 den fazla static blok varsa üstteki önce çalıştırılır.

    static {
        pi=3.14;
        System.out.println("static blok 1");
    }


}
