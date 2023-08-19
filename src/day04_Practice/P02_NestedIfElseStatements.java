package day04_Practice;

import java.util.Scanner;

public class P02_NestedIfElseStatements {
    public static void main(String[] args) {
         /*
        Soru: Kenar değerleri verilen üçgenin ikizkenar üçgen olup olmadığını kontrol edip
        dönüt veren kod dizisini yazınız.
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen Ücgenin kenar değerlerini giriniz");
        System.out.println("Lütfen Ücgenin kenar1'in değerlerini giriniz");

        double kenar1= scan.nextDouble();
        System.out.println("Lütfen Ücgenin kenar2'in değerlerini giriniz");
        double kenar2= scan.nextDouble();
        System.out.println("Lütfen Ücgenin kenar3'ün değerlerini giriniz");
        double kenar3= scan.nextDouble();

        if (kenar1>0 && kenar2>0 && kenar3>0){

            if (kenar1==kenar2 || kenar1==kenar3 || kenar2==kenar3){
                System.out.println("Ücgen Eşkenar ücgendir");
            }else {
                System.out.println("Üçgen eşkenar değildir");
            }

        }
    }
}
