package day09_practice;

import java.util.Scanner;

/*
 * kullanıcıdan aşağıdaki koşullarda bir şifre oluşturmasını isteyin.
 * 1 özel karakter içermeli
 * 1 büyük harf içermeli
 * 1 küçük harf içermeli
 * 1 sayi içermeli
 * Şifre uzunluğu en az 8 karakter olmalıdır
 */
public class IfStatements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen şifre oluşturunuz");
        System.out.println("Şifrenizin içinde en az birer adet Büyük Harf,Küçük Harf,Rakam,Özel karakterler “(!”#$%^’*+-.,/)” \nolmalıdır");
        System.out.println("\nLütfen Şifrenizi giriniz: ");

        String sifre = scan.next();

        int sayacBH=0;
        int sayacKH=0;
        int sayacRkm=0;
        int sayacOkrk=0;
        boolean pass=true;

        for (int i = 0; i <sifre.length() ; i++) {
            if (sifre.charAt(i)>='A'&& sifre.charAt(i)<='Z'){
                sayacBH++;
            }
            else if (sifre.charAt(i)>='a'&& sifre.charAt(i)<='z'){
                sayacKH++;
            }
            else if (sifre.charAt(i)>='0'&& sifre.charAt(i)<='9'){
                sayacRkm++;
            }
            else if (sifre.charAt(i)>='!'&& sifre.charAt(i)<='/'){
                sayacOkrk++;
            }else{
                System.out.println("Lutfen verilen koşulları sağlayınız");
                break;
            }

        }
        if (sifre.length()<8){
            System.out.println("şifreniz 8 karakter olmalıdır");
            pass=false;
        }
        if (sayacBH==0){
            System.out.println("Şifreniz en az bir büyük harf içermelidir");
            pass=false;
        }
        if (sayacKH==0){
            System.out.println("Şifreniz en az bir küçük harf içermelidir");
            pass=false;
        }
        if (sayacOkrk==0){
            System.out.println("Şifreniz en az bir karakter içermelidir");
            pass=false;
        }
        if (sayacRkm==0){
            System.out.println("Şifreniz en az bir rakam içermelidir");
            pass=false;
        }
        if (pass){
            System.out.println("Şİfreniz :"+ sifre+" başarı ile oluşturuldu");
        }



    }
}
