package day06_practice;

import java.util.Scanner;

public class tekSayiYazdir {
    public static void main(String[] args) {
         /*
Soru 2:
Kullanıcıdan bir sayı girişi alın ve 1'den o sayıya kadar olan tek sayıları ekrana yazdırın.
     */

        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi=scan.nextInt();

        for (int i = 1; i <sayi ; i++) {
            if (i%2==1){
                System.out.print(i+"-");
            }



        }




    }
}
