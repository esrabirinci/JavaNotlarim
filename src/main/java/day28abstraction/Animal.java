package day28abstraction;

public abstract class Animal {

    // body si olmayan methodlar Abstract method olarak adlandırılaırlar.
    // bir methodu abstract yapmak için i- method body i sil. ii- abstract keyword kulla
    //Abstract methodlar "abstract class" içinde olmalıdır.

    public abstract void eat();



    // abstract classlarda hem "abstract meethod" hem de "concrete method (non abstract)" kullanılabilir
    public void drink(){
        System.out.println("Animals drink");
    }


    //abstract move method oluşturunuz.

    public abstract void move();

}
