package day28abstraction;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

                        /*
                                INTERWİEV SORUSU
                       "throw" ile "throws" arasındaki farklar nelerdir?
           1- throw, methodun body si içinde kullanılır.throws ise methodun isiminden sonra kullanılır.
           2- throw, dan sonra obje oluşturulur. throws dan sonra ise sadece Exception class ın ismi yazılır.
           3-throw, methodun içinde istediğimiz yerde exception atmak için kullanılır.
             throws ise var olan checked exceptionu (compile time) atmak için kullanılır.
           4- twhrpw dan sonra sadece 1 tane exception olabilir. trows dan sonra 1 den fazla exception olabilir.


                             */

public class ReadFileLineByLine {
    public static void main(String[] args) {
        readFileLineByLine();

    }
    public static void readFileLineByLine(){

        try {
            BufferedReader br = new BufferedReader(new FileReader("src/main/java/day27exceptions/File.txt"));

       String line = br.readLine();

       while (line!= null){
           System.out.println(line);
           line = br.readLine();
       }

        } catch (FileNotFoundException e) {
            System.out.println("Ya isim yanlış yada dosya silinmiş " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Okunamayacak karakter veya karakterler var " + e.getMessage());;
        }
    }
}
