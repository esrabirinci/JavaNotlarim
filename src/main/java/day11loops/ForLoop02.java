package day11loops;

public class ForLoop02 {
    public static void main(String[] args) {

// Example 1:
        // Bir String deki "m" karakteri hariç tüm karakterleri yazdırınız.
        // Andromeda==> Androeda

        String str = "madam";
        // 1. YOL
        for(int i=0; i<str.length(); i++){

      char c = str.charAt(i);
      if(c!='m' && c!='M'){
          System.out.print(c);
      }
        }
        System.out.println();
            //2.YOL
               for(int i=0; i<str.length(); i++) {

                   char c = str.charAt(i);
                   if (c == 'm') {
                       continue;  // BOŞVEEEERRRR demektir                ***ÖNEMLİ BİR KONU**
                       // Loop un içinde bazı değerler için Loop un çalışmamasını isterseniz "continiu" kullanınız.
                   }

                   System.out.print(c);
               }

             //  Example 2:  1 den 100 e kadar tüm tamsayıları ekrana yazdırınız. 6 il bölünenler hariç.

        for(int i=1; i<101; i++){
            if(i%6==0){
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
        // EXAMPLE  3:
        // Sİze verilen bir string deki "m" den önceki karakterleri yazdırınız.
        // String: "Luxemburg" ===>> "Luxe

        String s = "Luxemburg";

        for(int i= 0; i<s.length();  i++){
            char c = s.charAt(i);

            if(c=='m'){
                break;
            }
            System.out.print(c);
        }





    }
}
