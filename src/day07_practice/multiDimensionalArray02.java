package day07_practice;

import java.util.Scanner;

public class multiDimensionalArray02 {
    public static void main(String[] args) {
         /*
        // 5x2'lik bir multidimension[Her birinin içinde 2li eleman bulunduran 5 elemanlı array] array oluşturun ve
         içine çeşitli şehir ve nüfus bilgileri ekleyin.
        // Daha sonra kullanıcıdan bir şehir adı alarak, bu şehrin nüfusunu ekrana yazdırın.
     */

        String [][] sehirlerNufuslar={{"Ankara","5.000.000"},{"Kırıkkale","277.000"},{"Adana","2.000.000"},{"Elazığ","450.000"},{"Amsterdan","1.100.000"}};

      Scanner scan = new Scanner(System.in);
        System.out.println("Nufusunu öğrenmek istediğiniz şehiri yazın");
        String arananSehir = scan.next();

        boolean kontrol=false;

        for (int i = 0; i <sehirlerNufuslar.length ; i++) {

            if (arananSehir.equalsIgnoreCase(sehirlerNufuslar[i][0])){
                System.out.println(arananSehir + " Şehrinin nufusu: "+ sehirlerNufuslar[i][1]);
                kontrol=true;
                break;


            }

        }
    if (!kontrol){
        System.out.println("Girdiğiniz şehir datalarımızda mevcut değil");
    }

    }
}
