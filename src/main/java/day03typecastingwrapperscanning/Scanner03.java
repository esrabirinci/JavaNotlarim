package day03typecastingwrapperscanning;

import java.util.Scanner;

public class Scanner03 {

    public static void main(String[] args) {

        // Example: Kullanıcıdan bir dikdörtgenin en ve boyunu alıp, alan ve çevresini hesaplayan kodu yazınız.



        Scanner input = new Scanner(System.in);
        System.out.println("Dikdörtgenin kısa kenarını yazınız.");
        int en = input.nextInt();

        System.out.println(" Dikdörtgenin uzun kenarını yazınız.");
        int boy = input.nextInt();

        System.out.println("Alan " + en*boy);
        System.out.println("çevre " + 2*(en+boy));


    }
}
