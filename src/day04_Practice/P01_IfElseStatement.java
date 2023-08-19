package day04_Practice;

import java.util.Scanner;

public class P01_IfElseStatement {
    public static void main(String[] args) {
        /*
        Soru: kenar değerleri girilen bir üçgenin dik üçgen olup olmadığını kontrol edip
        dönüt veren kod dizisini yazınız

         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen kenar  degerlerini giriniz");

        System.out.println("Lutfen kenar1  degerlerini giriniz: ");

        double kenar1= scan.nextDouble();
        System.out.println("Lutfen kenar2  degerlerini giriniz: ");
        double kenar2= scan.nextDouble();
        System.out.println("Lutfen kenar3  degerlerini giriniz: ");
        double kenar3= scan.nextDouble();
        System.out.println("-----------------1.COZUM -------------------------------------");
        if ((kenar1*kenar1)+(kenar2*kenar2)==(kenar3*kenar3)){
            System.out.println("Girdiğiniz değere sahip ücgen dik ücgendir");
        } else if ((kenar1*kenar1)+(kenar3*kenar3)==(kenar2*kenar2)) {
            System.out.println("Girdiğiniz değere sahip ücgen dik ücgendir");

        } else if ((kenar2*kenar2)+(kenar3*kenar3)==(kenar1*kenar1)) {
            System.out.println("Girdiğiniz değere sahip ücgen dik ücgendir");

        }else {
            System.out.println("Girdiğiniz değere sahip ücgen dik ücgen değildir");
        }
        System.out.println("-----------------2.COZUM -------------------------------------");

        if ((kenar1*kenar1)+(kenar2*kenar2)==(kenar3*kenar3) || (kenar2*kenar2)+(kenar3*kenar3)==(kenar1*kenar1) || (kenar1*kenar1)+(kenar3*kenar3)==(kenar2*kenar2)){
            System.out.println("Girdiğiniz değere sahip ücgen dik ücgendir");
        }else {
            System.out.println("Girdiğiniz değere sahip ücgen dik ücgen değildir");
        }



    }
}
