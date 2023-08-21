package day09_practice;

import java.util.Scanner;

public class Increment_Deincrement {
    public static void main(String[] args) {
         /*
        Bir sayısal değeri arttırmak/azaltmak istediğimizde şu yöntemler kullanılır
        sayi variableî tanımlanmış olsun

        */
        int sayi=100;
        sayi++;
        System.out.println(sayi);
        sayi+=1;
        System.out.println(sayi);
        sayi+=98;
        System.out.println(sayi);

        sayi--;
        System.out.println(sayi);
        sayi-=98;
        System.out.println(sayi);

        // Kullanicidan bolunen ve bolen seklinde 2 sayi alalim ve bolme operatoru
        // kullanmadan bolme islemini gerceklestirip bolumu hesaplayan method create ediniz.


        Scanner scanner= new Scanner(System.in);
        System.out.println("lutfen bölünen sayiyi giriniz");
        int bolunenSayi= scanner.nextInt();
        System.out.println("lutfen bölen sayiyi girin");
        int bolen= scanner.nextInt();
        int sayac=0;


        while (bolunenSayi>=bolen){
            bolunenSayi-=bolen;
            sayac++;

        }
        System.out.println("kalan sayi: "+bolunenSayi);
        System.out.println("bölüm:"+sayac);
    }
}
