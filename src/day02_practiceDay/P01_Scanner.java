package day02_practiceDay;

import java.util.Scanner;

public class P01_Scanner {
    public static void main(String[] args) {
           /*
        1- Kullanıcıdan ad/soyad/yas/mail adresi/şifre bilgileirini alıp
        sisteme kaydedildiğini aşağıdaki formatta yazdırın.
         *****       KAYIT BAŞARILI      *****
        Adınız: Tarık
        Soyadınız: Yiğit
        Yaşınız:42
        Mail Adresiniz:tarik@yigit.com
        Şifreniz: A2e365
        şeklinde sistemimize kaydınız başarıyla tamamlanmıştır.
         */

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen aşağıdaki bilgileri giriniz!");
        System.out.print("Adınız: ");
        String name=scanner.nextLine();
        System.out.println("");
        System.out.print("Soyadınız: ");
        String surname=scanner.nextLine();
        System.out.println("");
        System.out.print("Yaşınız: ");
       int yas=scanner.nextInt();
        System.out.println("");
        System.out.print("Mail adresiniz: ");
        String mail =scanner.next();
        System.out.println("");
        System.out.print("Şifreniz");
        String pass= scanner.next();
        System.out.println("");
        System.out.println(" ****       KAYIT BAŞARILI      *****");
        System.out.println("Adınız: "+name);
        System.out.println("Soyadınız: "+surname);
        System.out.println("Yaşınız: "+yas);
        System.out.println("Mail Adresiniz: "+mail);
        System.out.println("Şifreniz: "+pass);
        System.out.println("şeklinde sistemimize kaydınız başarıyla tamamlanmıştır.");



    }
}
