package day02_practiceDay;

import java.util.Scanner;

public class P02_practice {
    public static void main(String[] args) {
        /*
        2- Kullanıcıdan üçgenin kenarını ve o kenarın yüksekliğini girmesini isteyerek
        üçgenin alanını hesaplayıp yazdırın

        */
        System.out.println("Lütfen alanı hesaplanacak olan ücgenin ilgili aygıt değerlerini giriniz ");

        System.out.println("Ücgenin kenarının uzunluğunu yazın");

        Scanner scanner = new Scanner(System.in);

        double kenar = scanner.nextDouble();
        System.out.println("Ücgenin yüksekliğini  yazın");

        double yukseklik= scanner.nextDouble();

        System.out.println("---------Ücgenin Alanı---------");

        System.out.println("Ucgenin alanı : " + ((kenar*yukseklik)/2));



    }
}
