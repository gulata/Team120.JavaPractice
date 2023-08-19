package day02_practiceDay;

import java.util.Scanner;

public class P04_DataCasting {
    public static void main(String[] args) {


            /*
   2- Kullanıcıdan İki adet vize notu ve bir adet final notu girmesini isteyin
    Yıl sonu notunu vizeler %40 final % 60 olacak şekilde hesaplayıp
    Ders durumuna bu not 50'den büyük ise Geçtiniz Tebrikler!
    50'den küçükse Maalesef Kaldınız olarak aşağıdaki formatta yazdırınız
    Ad:
    Soyad:
    1.Vize:
    2. Vize:
    Final :
    Yıl Sonu Notu:
    Ders Durumu :
     */


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen adınızı giriniz");
        String name = scan.nextLine();
        System.out.println("Lutfen soyadınızı giriniz");
        String surname = scan.nextLine();

        System.out.println("Lutfen 1.vize notlarınızı giriniz");
        double vize1= scan.nextDouble();
        System.out.println("Lutfen 2.vize notlarınızı giriniz");
        double vize2= scan.nextDouble();
        System.out.println("Lutfen Final 1  notlarınızı giriniz");
        double final1= scan.nextDouble();


        double yilSonuNotu= (((vize1+vize2)/2)*40/100) + (final1*60/100);
        System.out.println("ADINIZ: "+ name);
        System.out.println("SOYADINIZ: " + surname);
        System.out.println("1.Vize notu: " + vize1);
        System.out.println("2.Vize notu: "+ vize2);
        System.out.println("Final notu: " + final1);
        System.out.println("Yıl sonu notu: " + yilSonuNotu);

        if (yilSonuNotu>=50){
            System.out.println("Geçtiniz Tebrikler!");

        }
        if (yilSonuNotu<50){
            System.out.println("Maalesef Kaldınız");
        }



    }
}
