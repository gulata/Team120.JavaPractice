package day09_practice;

import java.util.Scanner;

/*
       Kullnıcıdan bir harf girmesini isteyip o harften sonra gelen ilk üç harfi yazdıralım
       */
public class DataCasting {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Luften bir harf giriniz");
        char harf= scan.next().charAt(0);
        System.out.println("Girdiğiniz harften sonra gelen harfler sırasıyla: "+ (char)(harf+1)+ ","+(char)(harf+2)+ ","+(char)(harf+3)+" dır");

    }
}
