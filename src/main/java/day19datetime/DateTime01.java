package day19datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DateTime01 {

    public static void main(String[] args) {

        //Example 1: "Anlik tarihi"(Current Date) ekrana yazdiran kodu yaziniz
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);// 2022-10-21

        //Example 2: "Anlik zamani"(Current Time) ekrana yazdiran kodu yaziniz
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);// 13:42:32.032258

        //Example 3: "Anlik tarihi"(Current Date) ve "Anlik zamani"(Current Time) ekrana yazdiran kodu yaziniz
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);// 2022-10-21T13:46:19.435213

        //Example 4: Japonya'daki "Anlik tarihi"(Current Date) ve "Anlik zamani"(Current Time) ekrana yazdiran kodu yaziniz
        LocalDateTime currentDateTimeInJapan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentDateTimeInJapan);// 2022-10-22T02:51:53.899959

        //Example 5: Istanbul'daki "Anlik tarihi"(Current Date) ve "Anlik zamani"(Current Time) ekrana yazdiran kodu yaziniz
        LocalDateTime currentDateTimeInIstanbul = LocalDateTime.now(ZoneId.of("Europe/Istanbul"));
        System.out.println(currentDateTimeInIstanbul);// 2022-10-21T20:53:17.682534

        //Example 6: Bugunden 789 gun sonra emekli olacaginiza gore, emeklilik tarihini hesaplayan kodu yaziniz.
        LocalDate countDate = LocalDate.of(2022, 10, 21);
        LocalDate retireDate = countDate.plusDays(789);
        System.out.println(retireDate);// 2024-12-18


        LocalDate dobAli = LocalDate.of(2005, 5, 17);
        LocalDate dobVeli = LocalDate.of(2013, 2, 8);

        //between(dobAli, dobVeli) method'u kullanildiginda daha eski olan tarih once yazilmalidir
        Long diff = ChronoUnit.DAYS.between(dobAli, dobVeli);
        System.out.println(diff);//2824

        //Example -: Tom, Ali'den 3 yıl 8 ay 13 sonra doğdu. Ali ise Veli'den 1 yıl 15 gün önce doğdu.
//           Tom'un doğum tarihi 18 Kasım 2011 ise, Ali ve Veli'nin doğum tarihlerini bulunuz.

        LocalDate dobTom2 = LocalDate.of(2011, 11, 18);
        LocalDate dobAli2 = dobTom2.minusYears(3).minusMonths(8).minusDays(13);
        LocalDate dobVeli2 = dobAli2.plusYears(1).plusDays(15);
        System.out.println("Ali nin DT: " + dobAli2);
        System.out.println("Velinin DT: " + dobVeli2);



        //Example 8: Istanbul'un Fethi ile, Cumhuriyet'in kurulmasi arasinda kac ay oldugunu gosteren kodu yaziniz.
        //           29 Mayis 1453 ==> Istanbul'un Fethi              29 Ekim 1923 ==> Cumhuriyet'in kurulusu
        LocalDate istanbulunFethi = LocalDate.of(1453, 5, 29);
        LocalDate cumhuriyetKurulus = LocalDate.of(1923, 10, 29);

        Long aySayisi = ChronoUnit.MONTHS.between(istanbulunFethi, cumhuriyetKurulus);
        System.out.println(aySayisi);// 5645

        //Example 9: Verilen tarih'in hangi burcta oldugunu gosteren kodu yaziniz
        LocalDate myDate = LocalDate.of(1989, 5, 13);

        int day = myDate.getDayOfMonth();
        int month = myDate.getMonthValue();

        //1.Yol:
        if(day>=21 && month==3){
            System.out.println("Koc");
        }else if(day<=20 && month==4){
            System.out.println("Koc");
        }else if(day>=21 && month==4){
            System.out.println("Boga");
        }else if(day<=20 && month==5){
            System.out.println("Boga");
        }
        //2.Yol:
        if((day>=21 && month==3) || (day<=20 && month==4) ){
            System.out.println("Koc");
        }else if((day>=21 && month==4) || (day<=20 && month==5)){
            System.out.println("Boga");
        }
 // 2. Yol
        switch (month){
            case 1:
                if (day>=1 && day<=31){
                    if (day<22){
                        System.out.println("Oğlak");
                    }else {
                        System.out.println("Kova");
                    }
                }break;
            case 2:
                if (day>=1 && day<=28){
                    if (day<22){
                        System.out.println("Kova");
                    }else {
                        System.out.println("Balık");
                    }
                }break;
            case 3:
                if (day>=1 && day<=31){
                    if (day<22){
                        System.out.println("Balık");
                    }else {
                        System.out.println("Koç");
                    }
                }break;
            case 4:
                if (day>=1 && day<=31){
                    if (day<22){
                        System.out.println("Koç");
                    }else {
                        System.out.println("Boğa");
                    }
                }break;
            case 5:
                if (day>=1 && day<=31){
                    if (day<22){
                        System.out.println("Boğa");
                    }else {
                        System.out.println("İkizler");
                    }
                }break;
            case 6:
                if (day>=1 && day<=31){
                    if (day<22){
                        System.out.println("İkizler");
                    }else {
                        System.out.println("Yengeç");
                    }
                }break;
            case 7:
                if (day>=1 && day<=31){
                    if (day<22){
                        System.out.println("Yengeç");
                    }else {
                        System.out.println("Aslan");
                    }
                }break;
            case 8:
                if (day>=1 && day<=31){
                    if (day<22){
                        System.out.println("Aslan");
                    }else {
                        System.out.println("Başak");
                    }
                }break;
            case 9:
                if (day>=1 && day<=31){
                    if (day<22){
                        System.out.println("Başak");
                    }else {
                        System.out.println("Terazi");
                    }
                }break;
            case 10:
                if (day>=1 && day<=31){
                    if (day<22){
                        System.out.println("Terazi");
                    }else {
                        System.out.println("Akrep");
                    }
                }break;
            case 11:
                if (day>=1 && day<=31){
                    if (day<22){
                        System.out.println("Akrep");
                    }else {
                        System.out.println("Yay");
                    }
                }break;
            case 12:
                if (day>=1 && day<=31){
                    if (day<22){
                        System.out.println("Yay");
                    }else {
                        System.out.println("Oğlak");
                    }
                }
            default:
                System.out.println("HATA!");

        }

    }

}