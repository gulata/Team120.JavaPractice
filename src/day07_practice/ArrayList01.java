package day07_practice;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList01 {
    public static void main(String[] args) {
        // Kullanıcıdan 5 adet sayı alarak bir ArrayList oluşturun.
        // Ardından bu sayıların toplamını hesaplayarak ekrana yazdırın.

        Scanner scan= new Scanner(System.in);
        ArrayList<Integer> sayilar= new ArrayList<>();

        System.out.println("Toplanacak sayiları giriniz");

        for (int i = 0; i <5 ; i++) {
            System.out.println((i+1)+ ".Sayı: ");
            int sayi= scan.nextInt();
            sayilar.add(sayi);
        }

        int toplam=0;
        for (int sayi:sayilar){
            toplam+=sayi;
        }

        System.out.println("Toplam: "+ toplam);



    }
}
