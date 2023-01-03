package day12loops;

public class DoWhileLoop01 {
    public static void main(String[] args) {

        int i = 1;
        while (i < 1) {

            System.out.println("While loop");
            i++;
            //While loop bazı durumlarda hiç çalışmayabilir. yani whileloop i.in "zero execution" mümkündür.
        }


        int k = 1;
        do {
            System.out.println("Do while loop");
            k++;
        } while (k < 1);
        // do-while loop kullandığınızda loop body si içindeki kod en az 1 kere çalışır
        // yani do while loop için "zero execution" mümkün değildir.


        // EXample 1: bir ondalık sayının ondalık kısmındaki rakamlarının toplamını bulunuz.
        // 24,5673
// String.valuoof() methodu parantezin içine konulan datanın tipini "string" yapar
        double num = 24.5673;
        String str = String.valueOf(num);
        System.out.println(str); // 24.5673


         // Regex için . kullandığınızda önüne \\ koyunuz. yani nokta iu şelilde kullanılır (\\.)
        String decimalpart = str.split("\\.")[1];
        System.out.println(decimalpart);

       int decimalInt = Integer.valueOf(decimalpart);
        System.out.println(decimalInt); // 5673 görürsün

        int sum = 0;

        do {
            sum = sum+decimalInt%10;

            decimalInt= decimalInt/10;

        }while (decimalInt>0);

        System.out.println(sum);

    }
}
