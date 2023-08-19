package day07_practice;

import java.util.ArrayList;
import java.util.Scanner;

public class forEachLoop03 {
    public static void main(String[] args) {
        // Kullanıcıdan 5 adet not alarak bir ArrayList oluşturun.
// Bu notların ortalamasını hesaplayarak ekrana yazdırın.
// Örnek çıktı:
// Notların ortalaması: 78.5


        Scanner scanner= new Scanner(System.in);
        System.out.println("Lutfen not bilgileri sırayla giriniz");
        ArrayList<Double>notlar=new ArrayList<>();

        for (int i = 0; i <5 ; i++) {
            System.out.print((i+1)+ ".Dersimizin Notu: ");
            double not= scanner.nextDouble();
            notlar.add(not);

        }
        double toplam=0;

        for (double not :notlar) {
            toplam+=not;


        }
        double gano=toplam/notlar.size();
        System.out.print("Genel Akademik Not Ortamalamız: "+ gano);


        }

    }

