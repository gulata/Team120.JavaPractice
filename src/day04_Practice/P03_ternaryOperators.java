package day04_Practice;

import java.util.Scanner;

public class P03_ternaryOperators {
    public static void main(String[] args) {
         /*
        Soru: Kenar değerleri verilen üçgenin ikizkenar üçgen olup olmadığını kontrol edip
        dönüt veren kod dizisini yazınız.
         */

        Scanner scanner= new Scanner(System.in);
        System.out.println("Kontrol etmek istediğiniz ücgenin kenar değerlerini giriniz");

        System.out.println("Kenar-1: ");
        double kenar1= scanner.nextDouble();

        System.out.println("Kenar-2: ");
        double kenar2= scanner.nextDouble();

        System.out.println("Kenar-3: ");
        double kenar3= scanner.nextDouble();

        System.out.println(kenar1>0 && kenar2>0 && kenar3>0 ? (kenar1==kenar2 || kenar3==kenar1 || kenar3==kenar2 ?
                "Girdiğiniz değerler bir ikizkenar ücgene aittir.": "Girdiğiniz değerler ikizkenar ücgene air değildir"):
                "Yanlış değer girdiniz");




    }
}
