package day28abstraction;

public class Cat extends Mammal{


    /*
    Bir method parent class da abstract method ise;
    İ-Child class o methodu override edip kullanmak zorundadır
    İİ-Bu yüzden herhangi bir fonksiyonu, child class için mecburi yapmak isterseniz; o methodu abstract yapamalısınız
     */
    @Override
    public void eat() {
        System.out.println("cats eat");

    }

    @Override
    public void move() {
        System.out.println("cats move");
    }

}
