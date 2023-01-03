package day18arraylistspassbyvalue;

public class MethodOverloading01 {
    /*
        Method Overloading nasıl yapılır?
        1) Method isimleri aynı olmalıdır.
        2)Method parametreleri farklı olmalıdır.
            i)Parametre sayıları değiştirilebilir.
            ii)Parametrelerin data tiplerini değiştirebilirsiniz.
            iii) Parametrelerin yerlerini değiştirebilirsiniz, ancak data tipleri farklı ise.
        3) Method ismi + parametreler = Method Signature
           Method Signature dışında ne değiştirirseniz değiştirin, Java o methodları farklı kabul etmez.
    */
    public static void main(String[] args) {

        add(3,5);
        add(3, 5.0);

    }

    public static void add (int a, int b){
        System.out.println(a+b);
    }
    public static void add (int a, int b, int c){
        System.out.println(a+b+c);
    }
    public static void add (int a, double b){
        System.out.println(a+b);
    }
    public static void add (double a, int b){
        System.out.println(a+b);
    }

}





