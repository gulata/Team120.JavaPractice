package day07_practice;

public class multiDimensional01 {
    public static void main(String[] args) {
        /*
    Bir okulun öğrencilerinin matematik sınav notlarını saklamak için
    bir program yapmanız gerekmektedir. Her öğrenci için
    iki dönemlik (örneğin, ilk ve ikinci dönem) sınav notlarını saklamak için
    kullanmanız gerekmektedir. öğrencilere ait notları ve yıl ortalamasını hesaplayan
    Java programını yazınız:
     */        int [][] sinavNotlari={{80,100},{75,90},{60,60},{100,100}};


        for (int i = 0; i <sinavNotlari.length ; i++) {

            int ilkDonemNotu=sinavNotlari[i][0];
            int ikinciDonemNotu=sinavNotlari[i][1];

            System.out.println((i+1)+". Öğrencinin Notları");

            System.out.println("Birinci Dönem Notu : "+ ilkDonemNotu);
            System.out.println("İkinci Dönem Notu : "+ ikinciDonemNotu);

            double yılSonuOrtalaması=(ilkDonemNotu+ikinciDonemNotu)/2.0;
            System.out.println("Yıl Sonu Ortalaması: " + yılSonuOrtalaması);
            System.out.println("***************************************");

        }




        }



        }



