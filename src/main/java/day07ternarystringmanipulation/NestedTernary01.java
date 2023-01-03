package day07ternarystringmanipulation;

public class NestedTernary01 {

    public static void main(String[] args) {
//        /*
//        verilen yılın "Leap Year" Artık yıl olup olmadığını kontrol eden kodu yazınız.
//
//        i: yıl 100 e bölünürse 400 e de bölünmelidir. Ör: 1600 artık yıldır + , 1800-
//        ii: Yıl 100 e bölünmezse 4 e bölünmelidir. ör: 1996+ ,2001-
//         */
//
//        int year = 1600;
//        String leap = year%100==0  ? (year%400==0  ? "Leap Year"  :"Leap YEar değil")  : ( year%4==0 ? "Leap Year"  :"Leap YEar değil");
//
//        System.out.println(leap);

        /*
        Aşağıdaki kurallara göre passwordun geçerli olup olmadığını kontrol eden kodu yazınız.
            1- 8 karakter yada  8 karakterden fazla karakter varsa ilk harfi "i"  olmalıdır
            2-8 karakterden az karakter varsa ilk harfi "K" olmalıdır
         */
        String pwd = "i2a3ed54";
        char ilkHarf = pwd.charAt(0);
       String gecerli = pwd.length()<8 ? (ilkHarf=='K' ?"geçerli" : "geçersiz") : (ilkHarf=='i' ? "Geçerli" : "Geçersiz");
        System.out.println(gecerli);

    }
}
