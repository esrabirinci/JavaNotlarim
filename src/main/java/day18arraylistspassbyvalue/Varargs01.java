package day18arraylistspassbyvalue;

public class Varargs01 {


    /*
    1- Farklı sayılardaki parametlerle çalışabilen bir method oluşturmak isterseniz "varargs" kullanmalısıınız
    2- "varargs" arka tarafta array kullanır. bu yüzden varargs lar ile çalışırken array lerle çalışıyormuş gbi davranabilirsiniz.
    3- "varargs" oluşturmak için "<data type>...  <arargs ismi>" veya "<data type>  ...<arargs ismi>"
    4- bir methodda "varargs"ın yanında başka bir parametre kullanılabilir mi?
        varargs en sonda olmak şarı ile kullanılır.
    5- bir methodda birden fazla varargs kullanılabilirmi?
            varagrs en sonda olmak zorunda olduğundan, birden fazla kullanırsanız en az biri, en sonda olmayacaktır.
            bu da  4. kursl ile çelişir

     */
    public static void main(String[] args) {
      int r1= add(2, 3);
        System.out.println(r1);

        int r2= add(2, 3, 4);
        System.out.println(r2);

        int r3= add(2, 3, 4,5, 6, 7, 8, 9);
        System.out.println(r3);
    }
//// İKİ sayının toplamını return eden method oluşturunuz
//
//    public static int topla(int a, int b){
//        return a + b;
//     }
//    // üç sayının toplamını return eden method oluşturunuz
//
//    public static int add (int a, int b, int c){
//        return a+b+c;
//    }
//    // 4 sayının toplamını return eden method oluşturunuz
//
//    public static int add (int a, int b, int c, int d){
//        return a+b+c+d;
//    }

    //İStediğimiz kadar sayıyı toplayabileceğimiz bir method oluşturulaım.
    public static int add(int... a){
        int sum= 0;
        for (int w: a) {
            sum = sum +w;
        }
        return sum;
    }
}
