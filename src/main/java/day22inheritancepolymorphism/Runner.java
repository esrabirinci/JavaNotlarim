package day22inheritancepolymorphism;

public class Runner {
    public static void main(String[] args) {

        //*******Inheritence de variable nasıl çağırılır?*********//

        //Inheritence de variable ler seçilirken java objenin data type ne bakar.
        //öncelikle istediğiniz variable yi objenin data type i olan class ta arar.
        // o class ta bulamazsa parent class lara bakar,
        // hiç bir parent class da bulamazsa hata verir.
        Cat cat1 = new Cat();
        System.out.println(cat1.a); //14
        System.out.println(cat1.b); //34
        System.out.println(cat1.c); //45

        Mammal cat2 = new Mammal();
        System.out.println(cat2.a); //13

        Animal cat3 = new Animal();
        System.out.println(cat3.a); //12


        // Object oluşturuken obj. in data tipi Child Classlardan seçilmez.
        // Inheritence de variableler seçilirken  java Constructor a bakar.
        //öncelikle istediğiniz methodu Consrtucter i kullanılan Class tan alır.
        //O classta bulamazsa parent classlara bakar. ,
        // hiç bir yerde o methodu bulamazsa hata verir

        Cat cat4 = new Cat();
        cat4.eat(); // Cat eat
        cat4.drink();


        Mammal cat5 = new Mammal();
        cat5.eat(); //Mammal eat

        Animal cat6 = new Animal();
        cat6.eat(); // Animal eat











    }
}
