package day19datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime02 {
    public static void main(String[] args) {

        //Example : Java dan aldığınız Date i "ay/gun/yıl" olarakyazınız.

        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);//2022-10-21

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("MM/dd/yyyy"); // MM 10 dn küçük ayları 01,02..şeklinde yazar
        String formattedDate1= dtf1.format(currentDate);
        System.out.println(formattedDate1);//10/21/2022

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MMM/dd/yyyy"); // 3 harf MMM
        String formattedDate2= dtf2.format(currentDate);
        System.out.println(formattedDate2);//Eki/21/2022

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("MMMM/dd/yyyy"); //full isim MMMM
        String formattedDate3= dtf3.format(currentDate);
        System.out.println(formattedDate3);//Ekim/21/2022

        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("M/dd/yyyy"); //M 10 dan küçük ayları 1,2,3 diye yazar.
        String formattedDate4= dtf4.format(currentDate);
        System.out.println(formattedDate4);//10/21/2022

        DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("MM/dd/yy"); //yy yılın son iki rakamını gösterir
        String formattedDate5= dtf5.format(currentDate);
        System.out.println(formattedDate5);//10/21/22

        DateTimeFormatter dtf6 = DateTimeFormatter.ofPattern("MM/d/yy"); //d 10 dan küçük günleri 1,2,3 şeklinde yazar
        String formattedDate6= dtf6.format(currentDate);
        System.out.println(formattedDate6);//10/21/2022

       // Example 2:   Java dan aldığınıztime in formatını değiştiriniz.
        LocalTime myTime = LocalTime.of(16,23,54,2345);
        System.out.println(myTime);

        DateTimeFormatter dtf7 = DateTimeFormatter.ofPattern("HH:mm"); // HH 24 saat sistemini, hh 12 saat sistemini kullaır
        String formattedMyTime =dtf7.format(myTime);
        System.out.println(formattedMyTime);//16:23

        DateTimeFormatter dtf8 = DateTimeFormatter.ofPattern("hh:mm a"); //
        String formattedMyTime2 =dtf8.format(myTime);
        System.out.println(formattedMyTime2);//04:23

    }
}
