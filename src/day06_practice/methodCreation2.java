package day06_practice;

import java.util.Scanner;

public class methodCreation2 {
    public static void main(String[] args) {
         /*
    Kullanicidan main method icinde ayri ayri isim ve soyismini alin
    Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
    isim bosluk soyisim seklinde bize donduren bir method olusturun
     */
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim= scan.nextLine();
        System.out.println("Lutfen soyisminiz girin");
        String soyIsim=scan.nextLine();

        System.out.println(isimSoyisim(isim,soyIsim));
    }

    private static String isimSoyisim(String isim, String soyIsim) {
        isim=isim.toUpperCase().charAt(0)+isim.substring(1).toLowerCase();
        soyIsim=soyIsim.toUpperCase().charAt(0)+isim.substring(1).toLowerCase();

        String duzenliIsim=isim+" "+soyIsim;
        return duzenliIsim;






    }

}
