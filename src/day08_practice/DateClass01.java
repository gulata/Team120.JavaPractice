package day08_practice;

import java.time.LocalDate;
import java.time.LocalDateTime;

// Soru: Java'da tarih ve saat bilgisini temsil etmek için hangi sınıflar kullanılır? Verilen
// bir örnekle tarih ve saat bilgisini nasıl elde edebileceğinizi gösteriniz.
public class DateClass01 {
    public static void main(String[] args) {
        LocalDateTime time= LocalDateTime.now();
        System.out.println("Şu an SAAT: "+ time);
    }
}
