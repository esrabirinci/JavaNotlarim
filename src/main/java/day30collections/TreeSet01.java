package day30collections;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.TreeSet;

public class TreeSet01 {

    /*
        TreeSet tekrarsız elemanları alfabetik sıra veya küçükten büyüğe (Natural Order) dizer.
        TreeSet çoooook yavaş çalışır.

        Not: Tekrarsız elemanları Natural Order'da depolamak için TreeSet kullanmak mantıklıdır. Ama TreeSet'ler
        çooook yavaş çalıştığı için biz elemanları önce HashSet ile ekleriz, sonra HashSet'i TreeSet'e çevirerek TreeSet'in yavaşlık problemini aşmış oluruz.
    */

    public static void main(String[] args) {

        //Example 1: Sekiz tane uniqe String elemanı alfabetik sırada depolayınız.
        Long start1 = LocalTime.now().toNanoOfDay();
        TreeSet<String> emails = new TreeSet<>();
        emails.add("a@gmail.com");
        emails.add("y@gmail.com");
        emails.add("c@gmail.com");
        emails.add("m@gmail.com");
        emails.add("b@gmail.com");
        emails.add("z@gmail.com");
        emails.add("k@gmail.com");
        emails.add("d@gmail.com");
        System.out.println(emails);
        Long end1 = LocalTime.now().toNanoOfDay();
        System.out.println(end1-start1);


        HashSet<String> myEmails = new HashSet<>();
        myEmails.add("a@gmail.com");
        myEmails.add("y@gmail.com");
        myEmails.add("c@gmail.com");
        myEmails.add("m@gmail.com");
        myEmails.add("b@gmail.com");
        myEmails.add("z@gmail.com");
        myEmails.add("k@gmail.com");
        myEmails.add("d@gmail.com");

        TreeSet myEmailSorted = new TreeSet(myEmails);
        System.out.println(myEmails);
        Long end2 = LocalTime.now().toNanoOfDay();
        System.out.println(end2 - end1);


    }

}
