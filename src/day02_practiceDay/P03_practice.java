package day02_practiceDay;

import java.util.Scanner;

public class P03_practice {
    public static void main(String[] args) {
         /*
        3-Kullanıcıdan iki sayı alıp üçüncü bir değişken kullanmadan sayı değerlerini
        değiştirin (Swap)
         */

        System.out.println("Lutfen iki sayi giriniz ");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Birinci sayi:");

       double sayi1=scanner.nextDouble();

        System.out.println("ikinci sayi:");
        double sayi2= scanner.nextDouble();

        System.out.println("****Hokus Pokus****");

        //sayı1=10 sayi2=5

        sayi1=sayi1+sayi2; //15
        sayi2=sayi1-sayi2; //10
        sayi1=sayi1-sayi2;

        System.out.println("Girdiğiniz değerler yer değiştirdi" + "sayi1: "+sayi1 + "sayi2: " + sayi2);



    }
}
