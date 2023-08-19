package day05_practice;

import java.util.Scanner;

public class DahaBasitBir_forLoop {
    public static void main(String[] args) {
         /*
         Kullanicidan 150'den küçük pozitif bir sayi alin, 1’den baslayarak tum
        tamsayilari yazdirin, sira
        - 3 ile bolunebilen bir sayiya gelirse, sayi yerine WISE
        - 5 ile bolunebilen bir sayiya gelirse sayi yerine QUARTER
        - hem 3 hem 5 ile bolunebilen bir sayiya gelirse sayi yerine WISE QUARTER
        yazdirin
     */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen 150'den kücük pozitif bir sayi giriniz");
        int sayi = scanner.nextInt();

        for (int i = 1; i <=sayi ; i++) {
            if (sayi%3==0 && sayi%5==0){
                System.out.println("WISE QUARTER");
                return;

            } else if (sayi%3==0) {
                System.out.println("WISE");

            } else if (sayi%5==0) {
                System.out.println("QUARTER");

            }else {
                System.out.println("Girilen sayi 3'e ve 5'e bölünmüyor");
            }

        }






    }
}