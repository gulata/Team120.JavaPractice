package day03_Practice;

import java.util.Scanner;

public class P01_IfElseStatements {
    /*
    Kullanıcıdan mesafeyi kilometre olarak alın ve cevirmek istediği birimi
    sorun, istediği birim metre yada santimetre ise cevirip yazdırın. yoksa istediğiniz
    birim sisteme kayıtlı değil yazdırın
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("lutfen mesafeyi kilometre cinsinden yaziniz: ");
        double km= scan.nextDouble();
        System.out.print("lutfen donuşturmek istediğiniz birim cinsini yazınız: ");
        char birim= scan.next().charAt(0);
        if (birim=='m'|| birim== 'M'){
            System.out.println("Km olarak yazdığınız değerin karşılığı: "+km*1000+" ' m dir");
        } else if (birim=='s'|| birim=='S'|| birim=='C'|| birim=='c') {

            System.out.println("Km olarak yazdığınız değerin karşılığı : "+ km*10000+"'cm dir");

        }else {
            System.out.println("Girdiğiniz birim sistemimizde bulunmamaktadır");
        }
    }
}
