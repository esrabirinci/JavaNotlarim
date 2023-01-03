package day03typecastingwrapperscanning;

import java.sql.SQLOutput;

public class WrapperClass01 {

    public static void main(String[] args) {

        /* JAva primitivlere metotlar ekleyerek yeni bir yapı oluşturdu. bu yapıya " wrapper class " denir.
        wrapper class lar non primitivdir.

        Primitive        Wrapper
         byte     ==>     Byte
         short    ==>     Short
        ** int    ==>    Integer
         long     ==>     Long
         float    ==>    Float
         double   ==>    Double
         boolean  ==>    Boolean
         ** char  ==>   Character


         */

        byte primitiveByte = 12; // primitiveByte yazıp nokta koyduğunuzda hiç method göremezsiniz.  Çünkü primitiveler method içermez sadece değer içeriri.


        Byte wrapperByte = 12;   // wrapperByte yazıp nokta koyduğunuzda bir sürü method görürsünüz. çünkü wrapper method içerirr.

        //Example:  byte data type in en küçük ve en büyük değerlerini ekrana yazdırınız.


        System.out.println(Byte.MIN_VALUE);

        System.out.println(Byte.MAX_VALUE);

        // Example 2: short, int, long data type lerinin en büyü kve en küçük değerlerini yazınız.

        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);


        // " primitivler nasıl wrapperlar a çevrilir.(Autoboxing)

        float f1 = 13.99f;
        Float wrapperF1 = f1;

        // " wrapperler  nasıl primitivlere çevrilir.(unboxing)

        Character w1 = 's';
        char primitiveW1 = w1;

        // Autoboxing ve un boxing java tarafından otomatik olarak yapılır.
    }
}
