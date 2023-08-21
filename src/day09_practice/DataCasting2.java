package day09_practice;

import java.util.Scanner;

/*
        Kullanıcıdan double 2 sayı alıp iki sayıyı birbirine böldürüp sonucu tam sayı olarak yazdırın.
         */
public class DataCasting2 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("lutfen double sayi giriniz: ");
        double sayi1=scan.nextDouble();
        System.out.print("lutfen ikinci double sayiyi girin: ");
        double sayi2=scan.nextDouble();

        int sonuc=(int)(sayi1/sayi2);
        System.out.println("Giridiniz sayıların bölümü: "+sonuc);

    }
}
