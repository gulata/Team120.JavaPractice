package day05_practice;

import java.util.Scanner;

public class CokDahaBasitBirForLoop {
    public static void main(String[] args) {
        /*
        Kullanıcıdan baslangıc ve bitiş değeri olarak pozitif sayılar alın, sınırlar
        dahil olarak aralarındaki tum sayıların toplamını yazdırın. bitiş değeri başlangıc değerinden kucukse
        uyarı yadırıp sonlandırın
         */
        Scanner scanner= new Scanner(System.in);
        System.out.print("lutfen baslnagıc değeri girin:  ");
        int baslangıc= scanner.nextInt();
        System.out.print("lutfen bitiş değeri girin:  ");
        int bitis= scanner.nextInt();
        int toplam=0;

        if (baslangıc>bitis){
            System.out.println("başlangıc değeri bitiş değerinden buyuk olamaz");


        }else {
            for (int i = baslangıc; i <=bitis ; i++) {
                toplam+=i;



            }
            System.out.println("girilen değerler arasındaki toplamı:" +toplam);
        }


    }
}
