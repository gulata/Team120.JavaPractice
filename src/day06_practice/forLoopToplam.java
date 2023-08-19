package day06_practice;

import java.util.Scanner;

public class forLoopToplam {
    /*
        Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
        dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
        baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin
         */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen baslangıc için bir sayi giriniz: ");
        int baslangic = scan.nextInt();
        System.out.println("Lutfen bitiş değeri için bir sayi giriniz: ");
        int bitis = scan.nextInt();
        int toplam = 0;
        if (bitis < baslangic) {
            System.out.println("baslangıc değeri bitiş değerinden buyuk olamaz ");
        } else {

            for (int i = baslangic; i <= bitis; i++) {
                toplam += i;

            }
            System.out.println("toplam:"+ toplam);
        }
    }
}
