package day04_Practice;

import java.util.Scanner;

public class P06_forLoop {
    public static void main(String[] args) {
          /*
    Kulanıcıdan sıfırdan farklı pozitif bir tam sayı alalım ve 1'den o sayıya kadar olan sayılardan 4 ile bölünebilenleri yazıdırın
     */
        Scanner scanner= new Scanner(System.in);
        System.out.println("lutfen bir tamsayi giriniz");
        int girilenSayi= scanner.nextInt();

        if (girilenSayi<=0){
            System.out.println("lutfen başka bir sayı giriniz");

        }else {
            for (int i = 1; i <=girilenSayi ; i++) {
                if (i%4==0){
                    System.out.print(i+"-");
                }


            }
        }


    }

}
