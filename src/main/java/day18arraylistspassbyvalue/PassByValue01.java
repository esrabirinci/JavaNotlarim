package day18arraylistspassbyvalue;

public class PassByValue01 {


   /*
           1)Java, variable'ların orijinal değerlerini korumak ister.
           2)Variable metotlar içinde kullanıldığında, Java metodun içine
    orijinal değer koymaz, o değerin kopyasını üretir ve metoda o kopyayı yollar.
    Metot kopya üstünde değişiklik yapar, dolayısıyla variable'ın
    orijinal değer korunmuş olur. Bu sisteme PassByValoue denir.

    not: java pass by value kullanır
    not : bazı programlama dilleri orijinal değeri koruma altına almamıştır. bu işi developer lara bırakmıştır.
    bu tarz d,ller pass by reference kullanır.

            */
    public static void main(String[] args) {

        int x = 5;
        //Static method olan "main method" un içindeki herşey static olmalıdır
        change(x);//öğrenci gömleği
        System.out.println(x);//gomlek
        int ucret = 100;
        int kopya = indirim(ucret);

        System.out.println(kopya);
        System.out.println(ucret);

    }
    public static void change (int a){
        System.out.println(a*3);
    }

    //Void dşındaki return type lerda method bady si içinde "return" keyword kullanılmalıdır.
    public static int indirim(int gomlekUcreti){
        return gomlekUcreti -10;
    }
}
