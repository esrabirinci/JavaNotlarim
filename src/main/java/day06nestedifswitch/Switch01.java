package day06nestedifswitch;

import java.util.Scanner;

public class Switch01 {

    public static void main(String[] args) {
        /*
        Kullanıcıdan gün sayısını alınız ve gün ismini ekrana yazdırınız.
        1==>PAzar 2==> PAzartesi
         */

        Scanner girdi = new Scanner(System.in);
        System.out.println("Gün numarasını giriniz");
        byte gunNo = girdi.nextByte();

        //1. YOL:
        if(gunNo==1) {
//            System.out.println("PAzar");
//        } else if(gunNo==2){
//                System.out.println("Pazartesi");
//        } else if(gunNo==3){
//            System.out.println("Salı");
//        } else if(gunNo==4){
//            System.out.println("ÇArşamba");
//        } else if(gunNo==5){
//            System.out.println("Perşembe");
//        } else if(gunNo==6){
//            System.out.println("Cuma");
//        } else if(gunNo==7){
//            System.out.println("Cumartesi");
//            }else {
//            System.out.println("Geçerli gün sayısı giriniz");
//
//        }
        }
       // 2. YOL : switch ile çözünüz

        switch (gunNo){
            case 1:
                System.out.println("pazar");
                break;
            case 2:
                System.out.println("pazartesi");
                break;
            case 3:
                System.out.println("salı");
                break;
            case 4:
                System.out.println("çarşamba");
                break;
            case 5:
                System.out.println("perşembe");
                break;
            case 6:
                System.out.println("cuma");
                break;
            case 7:
                System.out.println("cumartesi");
                break;
            default:
                System.out.println("geçerli gün sayısı giriniz");
        }
    }
}
