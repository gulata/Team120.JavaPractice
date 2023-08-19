package practiceday_extra;

import java.time.LocalDateTime;
import java.util.Scanner;

public class WiseMarket {

         /*
  Bir market yazılımı yazdığınızı düşünerek aşşağıdaki menü ile giriş yapıp, ilgili bölüme yönlendiren
  alışveriş yaptıran ve sepet tutarını hesaplayarak hafızada tutan, kasaya gidince fiş yazdıran bir program
  hazırlayın
   ==================== WISE MARKET KASA PROGRAMI ===================================
 ilk programa girildiginde bizi bir menu karsilasin bu secenekler
   1 ŞARKÜTERİ ÜRÜNLERİ
   2 MANAV ÜRÜNLERİ
   3 MARKET ÜRÜNLERİ
   secime gore ,
   4-urunleri listele ve
   5-fiyatlari gelsin
   Variable'ları belirleyelim
   urunAdi, urunFiyatı, urunMiktari, urunKodu, sepet, toplam
 */
    static Scanner scan= new Scanner(System.in);
    static String urunAdi;
    static double urunFiyati;
    static double urunMiktari;
    static int urunKodu;
    static String sepet ="";
    static double toplam;
    static boolean ekUrun= false;

    public static void main(String[] args) {
        girisEkrani();{

    }


    }

    public static void girisEkrani() { //private sadece t120 icinde

        System.out.println("============ T120 - WİSE MARKET ============");
        System.out.println("============ Hosgeldiniz ============");
        System.out.println("============   Menu   ===========");
        System.out.println(" Lutfen Alısveris yapmak istediğiniz Reyonu Seciniz ");
        System.out.println("1 - Şarküteri \n2 - Manav\n3 - Market\n4 - Fis Yazdır\n5 - Çıkış\n");

        int secim = scan.nextInt();
        if (!(secim>=1 &&  secim<=5)){
            System.out.println("Geçersiz bir tuşa bastınız. Yeniden deneyiniz ");
            girisEkrani();

        }else {
            switch (secim){
                case 1:
                    sarkuteri();
                    break;
                case 2:
                    manav();
                    break;
                case 3:
                    market();
                    break;
                case 4:
                    fisYazdir();
                    break;
                case 5:
                    cikis();
                    break;
                default:


            }
        }


    }
    public static void sarkuteri() {
        System.out.println("Şarküteri Reyonuna Hoşgeldiniz");
        System.out.println("lutfen almak istediğiniz urun numarasını giriniz. \n6- Kaşar Peynir 130tl\n7-Zeytin 80tl\n8-Sucuk 200tl\n9-Kıyma 350tl\n");
        while (!ekUrun) {
            urunKodu = scan.nextInt();
            if (urunKodu >= 6 && urunKodu <= 9) {
                System.out.println("kaç kg alacaksınız");
                urunMiktari = scan.nextInt();
                switch (urunKodu) {
                    case 6:
                        urunAdi = "Kaşar Peynir";
                        urunFiyati = 130;
                        System.out.println(urunMiktari + "kg" + urunAdi + ":" + (urunFiyati * urunMiktari) + "TL'dir");
                        break;
                    case 7:
                        urunAdi = "Zeytin";
                        urunFiyati = 80;
                        System.out.println(urunMiktari + "kg" + urunAdi + ":" + (urunFiyati * urunMiktari) + "TL'dir");
                        break;
                    case 8:
                        urunAdi = "Sucuk";
                        urunFiyati = 200;
                        System.out.println(urunMiktari + "kg" + urunAdi + ":" + (urunFiyati * urunMiktari) + "TL'dir");
                        break;
                    case 9:
                        urunAdi = "Kıyma";
                        urunFiyati = 350;
                        System.out.println(urunMiktari + "kg" + urunAdi + ":" + (urunFiyati * urunMiktari) + "TL'dir");
                        break;


                }
                urunFiyati = urunFiyati * urunMiktari;
                toplam += urunFiyati;

                System.out.println("Oluşan sepet tutarı: " + toplam);
                sepet += urunAdi + ":" + urunFiyati+"\n";
                System.out.println("başka bir ürün eklemek isterseniz ürün kodu girin.\n Ana menu için sıfır giriniz.\n");

            } else if (urunKodu == 0) {
                girisEkrani();

            }
        }
    }
    public static void manav() {
        System.out.println("Manav Reyonuna Hoşgeldiniz");
        System.out.println("lutfen almak istediğiniz urun numarasını giriniz. \n71-Muz - 60tl\n72-Patates - 25tl\n73-Elma - 49tl\n74-Soğan -20tl\n75-Domates - 39tl\n76-Ananas - 59tl\n");

        while (!ekUrun){
            urunKodu=scan.nextInt();
            if (urunKodu>=71 &&urunKodu<=76){
                System.out.println("Kaç kg alacaksınız");
            urunMiktari=scan.nextInt();

            switch (urunKodu){
                case 71:
                    urunAdi="Muz";
                    urunFiyati=60;
                    System.out.println(urunMiktari+"kg"+urunAdi+"fiyati:"+urunFiyati*urunMiktari+"TL'dir");
                    break;

                case 72:
                    urunAdi="Patates";
                    urunFiyati=25;
                    System.out.println(urunMiktari+"kg"+urunAdi+"fiyati:"+urunFiyati*urunMiktari+"TL'dir");
                    break;

                case 73:
                    urunAdi="Elma";
                    urunFiyati=49;
                    System.out.println(urunMiktari+"kg"+urunAdi+"fiyati:"+urunFiyati*urunMiktari+"TL'dir");
                    break;
                case 74:
                    urunAdi="Soğan";
                    urunFiyati=20;
                    System.out.println(urunMiktari+"kg"+urunAdi+"fiyati:"+urunFiyati*urunMiktari+"TL'dir");
                    break;

                case 75:
                    urunAdi="Domates";
                    urunFiyati=39;
                    System.out.println(urunMiktari+"kg"+urunAdi+"fiyati:"+urunFiyati*urunMiktari+"TL'dir");
                    break;

                case 76:
                    urunAdi="Ananas";
                    urunFiyati=59;
                    System.out.println(urunMiktari+"kg"+urunAdi+"fiyati:"+urunFiyati*urunMiktari+"TL'dir");
                    break;

            }

            urunFiyati=urunMiktari*urunFiyati;
            toplam+=urunFiyati;
            System.out.println("Oluşan Sepet Tutarı:"+toplam);
            sepet+=urunAdi+" : " +urunFiyati+"TL\n";
            System.out.println("Başka urun almka isterseniz kodunu giriniz. Ana menuye dönmek için 0 tuşuna basınız");

        } else if (urunKodu==0) {
                girisEkrani();

            }
        }
    }

    public static void market() {
        System.out.println("Market Reyonuna Hoşgeldiniz");
        System.out.println("Lutfen almak istediğiniz urun kodunu giriniz:\n81-Nutella- 103tl\n82-Ekmek- 8tl\n83-Yumurta- 76tl\n84-Yoğurt- 29tl");
        while (!ekUrun){
            urunKodu=scan.nextInt();
            if (urunKodu>=81&&urunKodu<=84){
                System.out.println("kaç paket alacaksınız");
                urunMiktari=scan.nextInt();
                switch (urunKodu){
                    case 81:
                        urunAdi="Nutella";
                        urunFiyati=103;
                        System.out.println(urunMiktari+"kg"+urunAdi+"fiyati:"+urunFiyati*urunMiktari+"TL'dir");
                        break;
                    case 82:
                        urunAdi="Ekmek";
                        urunFiyati=8;
                        System.out.println(urunMiktari+"kg"+urunAdi+"fiyati:"+urunFiyati*urunMiktari+"TL'dir");
                        break;
                    case 83:
                        urunAdi="Yumurta";
                        urunFiyati=76;
                        System.out.println(urunMiktari+"kg"+urunAdi+"fiyati:"+urunFiyati*urunMiktari+"TL'dir");
                        break;
                    case 84:
                        urunAdi="Yoğurt";
                        urunFiyati=29;
                        System.out.println(urunMiktari+"kg"+urunAdi+"fiyati:"+urunFiyati*urunMiktari+"TL'dir");
                        break;

                }
                urunFiyati=urunFiyati*urunMiktari;
                toplam+=urunFiyati;
                System.out.println("oluşan sepet tutarı: "+toplam);
                sepet+=urunAdi+" : "+urunMiktari+"TL\n";
                System.out.println("başka urun almak isterseniz kodu giriniz. Ana menuye dönmek için 0 tuşuna basınız");
            } else if (urunKodu==0) {
                girisEkrani();

            }


        }

    }
    public static void fisYazdir() {
        System.out.println("============ T120 - WİSE MARKET ============");
        System.out.println("============ Bizi Tercih Ettiğiniz İçin Teşekkür Ederiz ============");
        System.out.println("============   Alışveriş Bilgileriniz   ===========");
        System.out.println("  \n \n");

        System.out.println("Alıveriş Listeniz: \n" + sepet);
        System.out.println("");
        System.out.println("Toplam Tutar: "+ toplam);
        System.out.println("");
        System.out.println("============ İyi Günler Dileriz ============");
        LocalDateTime saat= LocalDateTime.now();
        System.out.println(saat);
        System.out.println("ana menuye dönmek için 0 tuşuna basınız. Çıkıs yapmak için 5 tuşuna basınız");
        if (urunKodu==0){
            girisEkrani();
        } else if (urunKodu==5) {
            cikis();

        }


    }


    public static void cikis() {

        //scan.close();
        System.exit(0);

    }








}
