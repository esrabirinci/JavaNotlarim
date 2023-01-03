package day02methodcreation;

public class Car {

    public String marka = "Honda";
    public int fiyat = 20000;

    public static void main(String[] args) {

        // Object nasıl oluşturulur?
        // 1- Class ismini yazınız.  2- Objecte bir isim veriniz.  3- = 4- new keywordu kullan  5- Class ismi parantezle braber yazılır
           Car                             myHonda                       =     new                         Car();
        System.out.println(myHonda.fiyat);
        System.out.println(myHonda.marka);
        myHonda.dur();
        myHonda.hareketEt();

          // MEthotCreation claasında object oluşturduk
        MethodCreation obj = new MethodCreation();
        System.out.println(obj.toplamaYap(3,5));
    }

    public void hareketEt(){
        System.out.println("Honda güzel hareket eder...");
    }

    public void dur(){
        System.out.println("Honda güvenli şekilde durur");
    }


}
