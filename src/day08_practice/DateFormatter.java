package day08_practice;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormatter {
    // Soru: Java'da tarih ve saat bilgisini belirli bir formatta nasıl biçimlendirirsiniz?
// Verilen bir örnekle tarih ve saati farklı biçimlerde nasıl gösterebileceğinizi açıklayınız.
    public static void main(String[] args) {
        LocalDateTime currentTime=LocalDateTime.now();
        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd/mm/yyy HH.MM.SS");
        String newFormatDateTime= currentTime.format(formatter);
        System.out.println("yeni zaman biçimi: "+ newFormatDateTime);
    }


}
