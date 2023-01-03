package day21accessmodifiersinheritance;

public class AnimalRunner {
    public static void main(String[] args) {
/*
        1- intheritance sayesinde;
        i- kod tekrarakarından kurtuluruz.
        ii- kod tamiri kolay olur
        iii-Child classları daha atomic yapmış oluruz.

        2- bir class ı başka bir class ın child classı yapmak için extend keyvord unu kulllanırız.
        ilk yazılan class "child", ikinci yazılan class parent olur.

        3- child class objectleri parent class tan method ve variable leri kullanabilirler.

       4- Parent class objectleri, child class tan method ve variable leri kullanamazlar.
        yani yukarıdan aşağıya aktarım yapılamaz

        5- object class her class ın parentidir.
        Java da  object class HARİÇ  her classın parenti vardır.
         Javada parenti olmayan tek class object classtır.
         6- private methpd ve variableler child classlar tarafından kullanılamaz.

          protected method ve variable ler child classlar tarafından kullanılabilri.
         default method ve variable ler aynı package de ki child classlar tarafından kullanılabilr.
          public method ve variable ler child classlar tarafından kullanılabilr.

          Note: child classlar tarafından kullanılabilir olmak, inherite edilebilir demektr

          7- 4 tip inheritance vardır.
               i- Multilevel  inheritance : java kullanır
               ii- Hierarchical inheritance : bir parent için çoklu child java bunu kabul eder
               iii- Multiple inheritance : bir child class a çoklu parent demek, java bunu DESTEKLEMEZ. java doesnt support
               Multipla inheritance
               iv- single inheritance : bir child e bir parent demektir. Java bunu kabul eder yani destekler.



 */
        Cat c1 = new Cat();
        c1.eat();
        c1.drink();
        c1.meow();

        Dog d1 = new Dog();
        d1.eat();
        d1.drink();
        d1.bark();

        Bird b1 = new Bird();
        b1.eat();
        b1.drink();
        b1.tweet();



    }
}
