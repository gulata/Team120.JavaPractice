package day09_practice;

import java.util.Arrays;
import java.util.Scanner;

/*
   Kullanıcıdan array'in boyutunu ve elemanlarını alıp array'i oluşturan ve bize dödüren bir method oluşturunuz
    */
public class Arrays2 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println(Arrays.toString(arrayOlustur()));


    }

    public static int [] arrayOlustur() {

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen oluşturulacak Array'in boyutunu giriniz");
        int length=scan.nextInt();
        int[]array=new int[length];

        for (int i = 0; i <length ; i++) {
            System.out.println("Array için tamsayi olan elaman giriniz");
            array[i]=scan.nextInt();


        }
        return array;
    }


}
