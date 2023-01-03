package day29abstractioncollections;

public class Civic implements Engine, Ac{

    /*
    "Abstract methodlar " sadece ne yapılacağını söyler. (what to do)
    "concrete methodlar" ne yapılacağı ile birlikte nasıl yapılacağını da söyler(how to do) (body kısmında)

    "interface" ler bir yapılacak işler listesidir. (to do list)

    "multiple parent interface" kullandığınızda aynı method ismi ile birden fazla method oluşturursanız, bu methodların
    retyrn type leri aynı olmalıdır. Aksi takdirde hata verir.

    "interfacelerde " constructor olmadığı için, interfacelerden obje OLUŞTURULAMAZ.
    "Abstract class" larda class oldukları için constructor vardır. Constructor obje olşturamazlar


            ***** Abstract Class ile İnterface in farkı nedir? ****** INTERVIEW****
    1-Method açısından:
             "Abstract Class" hem abstract hem concret methodlar içeriebilir.
             "Interface" ler ise sadece abstract methodlar içerir.
             Ama; istersek Interface ler içinde de "default ve static keywordler" kullanarak concret methodlar oluşturabilirz.

   2- Variable açısından:
            "Abstract Classlarda" normal Classlardaki gibi her türlü variable oluşturulabilir.
            "Interfacelerde" ise variable public, static ve final olmakz zorundadır.

   3- Inheritance açısından:
            "Abstract classlar" class oldukları için "multiple inheritance " a müsade etmezler.
            "Interfaceler" ise multiple inheritance yi desteklerler. zaten varoluş sebebleri o dur.

   4-Object Creation açısından:
             "Abstract Classlarda" constructor vardır ancak object oluşturmada kulluanılmazlar
             "Interface" lerde ise constructor olmadığından object oluşturulamaz.

    Soru: Object Oriented Programiming Languige Prensipleri Nelerdir?
    1- Inheritance 2- Polymorphism 3- Encapsulation 4-Abstraction
     */


    @Override
    public void run() {
        System.out.println("Civic runs well");
    }

}
