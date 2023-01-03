package atmproject;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Options extends Account {
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
    boolean flag = true;

    HashMap<Integer, Integer> veri = new HashMap<>();

    public void login(){
        System.out.println("Techproed ATM ye hoşgeldiniz . ");
        do {
            veri.put(12345,1234);
            veri.put(23456,2345);
            veri.put(34567,3456);
            veri.put(45678,4567);

            try {
                System.out.println("Hesap numaranızı giriniz");
                setAccountNumber(input.nextInt());
                System.out.println("Pin giriniz");
                setPinNumber(input.nextInt());

            }catch (Exception e){

                System.out.println("Yanlış KArakter girdiniz, Sadece Rakam giriniz veya Q ya basıp çıkabilirsiniz");

                input.nextLine();// işlemin arasına boşluk koyar işlemde prob yaşamazsınız. inputlar karışmasın diye yaptık
                String exit = input.next();

                if (exit.equalsIgnoreCase("q")){
                    flag=false;
                }

                int count = 0;

                for (Map.Entry<Integer,Integer>w:veri.entrySet() ){

                    if (w.getKey().equals(getAccountNumber()) && w.getValue().equals(getPinNumber())){
                        getAccountTypes();//hesap işlemlerine gdiniz

                    }
                }



            }

        }while (flag);


    }


    Scanner input = new Scanner(System.in);

    //Vadesiz Hesap İŞlemleri
    //checking hesap işlemleri==>
    public void checkingOperations(){

        do {

            displayMessage();

        int option = input.nextInt();

        if (option==4){
            break;
        }

        switch (option){

            case 1:
                System.out.println(" Checking hesabınızda kalan bakiye: " + moneyFormat.format(getCheckingBalance()));
                break;
            case 2:
                getCheckingWithdraw();
                break;
            case 3:
                getCheckingDeposit();
                break;
            default:
                System.out.println("Yanlış seçenek lüütfen 1,2,3 veya 4 ü kullanınız");


        }

    }while (true);

    }
    //Vadeli Hesap İŞlemleri

    public void savingOperations(){

        do {
            displayMessage();

            int option = input.nextInt();

            if (option==4) {
                break;
            }

            switch (option) {
                case 1:
                    System.out.println(" Saving hesabınızda kalan bakiye: " + moneyFormat.format(getSavingBalance()));
                    break;
                case 2:
                    getSavingWithdraw();
                    break;
                case 3:
                    getSavingDeposit();
                    break;
                default:
                    System.out.println("Yanlış seçenek lüütfen 1,2,3 veya 4 ü kullanınız");

            }



        }while (true);


    }
    //İlgili Hesabı seçiniz
      public void getAccountTypes(){
          System.out.println("işlem yapmak istediginiz hesabi seciniz");
          System.out.println("1: Checking account"); // vadesiz hesap
          System.out.println("2: Saving account"); // Vadeli hesap
          System.out.println("Exit"); // çıkış

          int option = input.nextInt();
          switch (option){

              case 1:
                  System.out.println("Checking/Vadesiz Hesabındasınız");
                  checkingOperations();
              case 2:
                  System.out.println("Saving/ Vadeli hesabınızdasınız");
                  savingOperations();
                  break;
              case 3:
                  System.out.println("ATM makinemşzş kullandığınız için teşekkkür ederiz");
                  flag = false;
                  break;
              default:
                  System.out.println("yanlış seçenek lütfen 1,2,3 ü kullanınız");

          }


        }
    //Kişi için seçenekleri görüntüle

    public void displayMessage(){

        System.out.println("Opsiyon seçiniz ! ");
        System.out.println("1: View Balance"); // Bakiyenizi kontrol ediniz
        System.out.println("2: Para Çekme ");
        System.out.println("3: Para Yatırma"); //Deposit
        System.out.println("4: Exit "); // İŞlemi Sonlandır
    }
}
