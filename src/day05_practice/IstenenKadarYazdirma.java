package day05_practice;

import java.util.Scanner;

public class IstenenKadarYazdirma {
    public static void main(String[] args) {
         /*
         * Kullanicidan 3 harften uzun bir kelime ve 10'dan kucuk bir sayi alin,
         * Kelimenin son 2 harfini girilen sayi kadar yan yana yazdirin

         */

        Scanner scan= new Scanner(System.in);
        System.out.println( "Lutfen bir kelime yazınız");
        String kelime = scan.next();
        System.out.println("luften bir rakam giriniz");
        int rakam= scan.nextInt();

        String sonIkıHarf= kelime.substring(kelime.length()-2);

        if (rakam>=0 && rakam<10){
            for (int i = 0; i <rakam ; i++) {
                System.out.print(sonIkıHarf);

            }
        }



    }
}
