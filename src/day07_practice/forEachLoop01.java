package day07_practice;

import java.util.ArrayList;

public class forEachLoop01 {
    public static void main(String[] args) {
         /*
    // Bir ArrayList oluşturun ve içine 3 adet meyve ekleyin.
    // Daha sonra bu meyveleri büyük harflerle ekrana yazdırın. (forEachLoop kullanın)
    // Örnek çıktı:
    // Meyveler: ELMA ARMUT ÇİLEK
     */

        ArrayList<String>meyveler= new ArrayList<>();

        //kolay yontem
        //meyveler.add("Elma");
        //meyveler.add("Armut");
        //meyveler.add("Çilek");
        //System.out.print("Meyveler: "+ meyveler.toString().toUpperCase());


        meyveler.add("Elma");
        meyveler.add("Armut");
        meyveler.add("Çilek");

        for (String meyve:meyveler) {
            System.out.println(meyve.toUpperCase());

        }


    }
}
