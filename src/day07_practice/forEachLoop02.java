package day07_practice;

import java.util.ArrayList;
import java.util.Scanner;

public class forEachLoop02 {
    public static void main(String[] args) {
        /*
// Bir ArrayList oluşturun ve içine çeşitli ürün fiyatları ekleyin.
// Bu fiyatların toplamını hesaplayarak ekrana yazdırın.
// Örnek çıktı:
// Toplam fiyat: 236.5
*/
       ArrayList<Double>fiyatlar=new ArrayList<>();

        Scanner scan= new Scanner(System.in);
        System.out.print("1.Ürün Satış Fiyatını Girin: ");
        double urun1=scan.nextDouble();
        fiyatlar.add(urun1);
        System.out.print("2.Ürün Satış Fiyatını Girin: ");
        double urun2=scan.nextDouble();
        fiyatlar.add(urun2);
        System.out.print("3.Ürün Satış Fiyatını Girin: ");
        double urun3=scan.nextDouble();
        fiyatlar.add(urun3);
        System.out.print("4.Ürün Satış Fiyatını Girin: ");
        double urun4=scan.nextDouble();
        fiyatlar.add(urun4);
        System.out.print("5.Ürün Satış Fiyatını Girin: ");
        double urun5=scan.nextDouble();
        fiyatlar.add(urun5);
        double toplam=0;

        for (double fiyat:fiyatlar) {
            toplam+=fiyat;


        }
        System.out.println("Bugünkü Satışların Toplamı: "+ toplam);


    }
}
