package day26exceptions;

public class Exceptions01 {
    public static void main(String[] args) {

         String str = "123";
        int result =  convertStringToInteger(str);
        System.out.println(result + 5 );


        String st = "1a2b";
        int r = convertStringToInteger(st); // NumberFormatException Eğer içinde rakamdan farklı karakter barındıran 4
                                            // bir stringi valueOf() kullanarak integer e çevirmek isterseniz NumberFormatException alırsınız.
        System.out.println(r + 10);

    }

    public static int convertStringToInteger(String str){
       int i = 0;
        // Herhangi bir satırda "Exception" atılırsa JAva direkt "catch " bölümüne geçer try içindeki sonraki kodları çalıştırmaz.
       try {
          i= Integer.valueOf(str);
           System.out.println("Burası try bölümü");

       }catch (NumberFormatException e) {
           System.out.println("Rakam olmayan karakter içeren stringler integer e çevrilemezler");
       }
       return i;
    }
}
