package day04_Practice;

import java.util.Locale;
import java.util.Scanner;

public class P05_SwitchStatements {
    public static void main(String[] args) {
        // Kulanıcıdan o günün hangi gün olduğunu girmesini isteyip
        //Haftanın kaçıncı günü oldupunu yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("Bugün Günlerden Hangi Gün: ");
        String gun= scan.next();



        switch (gun){
            case "Pazartesi":
                System.out.println("Haftanın birinci günü");
                break;
            case "Salı":
                System.out.println("Haftanın ikinci günü");
                break;
            case "Çarşamba":
                System.out.println("Haftanın ücüncü günü");
                break;
            case "Perşembe":
                System.out.println("Haftanın dördüncü günü");
                break;
            case "Cuma":
                System.out.println("Haftanın beşinci günü");
                break;
            case "Cumartesi":
                System.out.println("Haftanın altıncı günü");
                break;
            case "Pazar":
                System.out.println("Haftanın yedinci günü");
                break;
            default:
                System.out.println("BÖYLE BİR GÜN YOK");

        }

    }
}
