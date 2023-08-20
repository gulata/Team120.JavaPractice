package day08_practice;
// Bir "Rectangle" sınıfı oluşturun ve bu sınıfın iki constructor'ı olsun.
// İlk constructor, uzun ve genişlik değerlerini alacak şekilde tasarlanmalıdır.
// İkinci constructor ise sadece bir boyut değeri alacak şekilde tasarlanmalıdır (kare).

// Aynı zamanda, bu constructorlarin içinden "display" adında bir metodu çağırarak boyutları ekrana yazdırın.

// Örnek çıktı:
// Uzunluk: 8, Genişlik: 6
// Kenar uzunluğu: 5 (Kare)

public class Rectangle {
    int uzunluk;
    int genislik;

    public Rectangle(int uzunluk, int genislik){
        this.genislik=genislik;
        this.uzunluk=uzunluk;
        display();
    }
    public Rectangle(int boyut){
        this.uzunluk=boyut;
        this.genislik=boyut;
        display();

    }

    private void display() {

        if (uzunluk==genislik){
            System.out.println("Boyutu: "+ uzunluk+ "KARE");
        }else {
            System.out.println("Uzunluk: "+ uzunluk+ "Genişlik: "+genislik);
        }

    }

    public static void main(String[] args) {
        Rectangle boyut=new Rectangle(5,6);
        Rectangle boyut2=new Rectangle(8);


    }
}


