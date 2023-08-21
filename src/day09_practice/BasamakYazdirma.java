package day09_practice;

import java.util.Scanner;

/*
   Kullanıcıdan 3 basamaklı bir sayı girmesini isteyin
   Daha sonra bu sayının sırasıyla
   Birler Basmağı:
   Onlar Basamağı:
   Yüzler Basamağı:
   basamaklarını yazdırınız.
    */
public class BasamakYazdirma {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Lutfen 3 basamaklı bir sayi giriniz");
        int sayi= scanner.nextInt();

        int birlerBasamagı=sayi%10;
        sayi/=10;
        int onlarBasamagı=sayi%10;
        sayi/=10;
        int yuzlerBasamagı=sayi;

        System.out.println("sayının birler basamağı: "+birlerBasamagı);
        System.out.println("sayının onlar basamağı: "+onlarBasamagı);
        System.out.println("sayının yüzler basamağı: "+yuzlerBasamagı);

    }
}
