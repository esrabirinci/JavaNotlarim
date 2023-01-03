package day22inheritancepolymorphism;

public class HondaAccord extends Honda{

    /*
    1- Siz class oluşturduğunuzda java otomatik olarak size görünmez bir cncructor verir çünkü,
        java classın bir templed KALIP olduğunu ve object oluştırmak içn yaratıldığını ve Object oluşturmak için
        concructor un şart olduğunu bilir.
        2- javanın otomatik olarak oluşturduğu bu görünmez concructor a default conc. denir
        3- Siz kendiniz herhangi bir cocn. oluşturduğunuzda default conc. siler.
        4- bir classta birden fazla conc olabilir. Fakat bu concructorların parametleri farklı olmalıdır.
     */


        public int price;
        public int year;
        public String make;
        public String model;
        public HondaAccord(){} // concructor

        public HondaAccord(int price){
            this.price = price;
            }
        public HondaAccord(int price, int year) {
            this.price= price;
            this.year = year;
            System.out.println("honda accord constructor");

        }
        public  HondaAccord(int price, int year, String make, String model){


             }


    }
