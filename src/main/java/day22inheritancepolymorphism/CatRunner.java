package day22inheritancepolymorphism;

public class CatRunner {
    /*
    1-Javada object oluştururken, conctructorlar parenttan child e doğru çalıştırılır.
    2-Java en üst parent concructor a çıkabilmek için "super()" kodunu kullanır.
    3- Her concructor un ilk satırında gizli olarak bulunur
    4- super() kodunu isterseniz görünür şekilde de yazabilirsiniz. Java kızmaz
    5- super() kodunu görünür şekilde yazarsanız sakın haa ilk satır dışında bir satıra koymayınız. HATA VERİR
    6- super() kodu parent classtan concsructor çağırmaya yarar.
     */

    public static void main(String[] args) {

        Cat cat1 = new Cat();


    }
}
