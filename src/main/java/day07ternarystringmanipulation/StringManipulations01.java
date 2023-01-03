package day07ternarystringmanipulation;

public class StringManipulations01 {

    public static void main(String[] args) {
        //String class methodları
        /*
        1- equals():
                i-ne için kullanılır iki stringin aynı olup olmadığını anlamamıza yarar.
               ii- method size ne verir. Equals() "boolean" return eder.

        2- equalsIgnoreCase():
                i- İki tane stringin aynı olup olmadığını, büyük harf küçük harfe dikkat etmeden anlamamıza yarar.
                ii-equalsIgnoreCase() "boolean" return eder.

        3- toLoweCase():
                i- bir stringdeki tüm harfleri küçük harfe çevirmek için kullanılır.
                ii-toLowerCase() methodu "String"i return eder.

        4- toUpperCase():
                 i- bir stringdeki tüm harfleri büyük harfe çevirmek için kullanılır.
                ii-toUpperCase() methodu "String"i return eder.

        5- charAt():
                i- Bir stringden belli bir index deki characteri almak için kullanılır
                ii- charAt() methodu "char" return eder.

        6- lenght()
                i- Bir string de kaç tane character kullanıldığını öğrenmek için kullanılır.
                ii- lenght() methodu "int" return eder.

        7- contains():
                i- Bir stringde belli bir karakterin veya character lerin var olup olmadığını anlamak için kullanılır.
                ii- contains() methodu "boolean" return eder.

        8- split() :
                i- Bir stringi istediğimiz characterden parçalamaya yarar.
                ii- split() methodu "array" return eder.
         */


        /*

        Bir passwordun geçerli olup olmadığını aşağıdaki kurallara göre kontrol eden kodu yazınız.
        ii- en az 8 character içermeli
        ii- Space characteri içermemeli
        iii-İlk harfi "M" veya "m" olmalı
        iiii-Son karakteri "?" olmalı
         */

        String pwd = "Manisa12?";
     //  ii- en az 8 character içermeli
      boolean i = pwd.length()>7;

      // ii- Space characteri içermemeli

     boolean ii =  !pwd.contains(" ");

       // iii-İlk harfi "M" veya "m" olmalı

      boolean iii =  pwd.charAt(0)== 'M' || pwd.charAt(0)=='m';

      //  iiii-Son karakteri "?" olmalı

      boolean iiii =pwd.charAt(pwd.length()-1)== '?';

        System.out.println(i && ii && iii && iiii);



    }
}
