package day03_Practice;

import java.util.Scanner;

public class P02_Ifelse {

    /*
    Öğrenci notunu harf notuna ceviren bir kod yazınız
    85-100.....>AA
    80-85......>BA
    75-80......>BB
    65-75......>CB
    50-65......>CC
    50 altı ise ...>ff
    */


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen sayısal olarak notunuzu giriniz: ");

        double not= scan.nextDouble();

        if (not>=85 && not<=100){
            System.out.println("Girdiğiniz"+ not+"'un karşılığı AA'dır");
        }if (not>=80&& not<85){
            System.out.println("Girdiğiniz"+ not+"'un karşılığı BA'dır");

        }if (not>=75 && not<80){
            System.out.println("Girdiğiniz"+ not+"'un karşılığı BB'dır");
    }if (not>=65 && not<75){
            System.out.println("Girdiğiniz"+ not+"'un karşılığı CB'dır");
        }if (not>=50 && not<65){
            System.out.println("Girdiğiniz"+ not+"'un karşılığı CC'dır");
        } else   {
            System.out.println("Girdiğiniz"+ not+"'un karşılığı FF'dır");
        }

        }


    }

