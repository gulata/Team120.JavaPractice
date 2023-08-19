package day07_practice;

import java.util.ArrayList;

public class ArrayList02 {
    public static void main(String[] args) {
// Bir ArrayList oluşturun ve içine 5 adet isim ekleyin.
// Daha sonra bu isimleri sondan başlayarak ekrana yazdırın.
// Örnek çıktı:
// Son isim: Ahmet
// Son ikinci isim: Mehmet
// ...

        ArrayList<String> isimler= new ArrayList<>();
        isimler.add("Salih");
        isimler.add("Naim");
        isimler.add("Asaf");
        isimler.add("ilknur");
        isimler.add("Nurgul");
        System.out.println("İsim Listesi: "+isimler);

        System.out.println("********************************************");

        for (int i = isimler.size()-1; i >=0 ; i--) {
            System.out.print(isimler.get(i)+" ");

        }

    }
}
