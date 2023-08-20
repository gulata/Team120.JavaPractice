package day08_practice;
// Bir "Product" sınıfı oluşturun ve bu sınıfın bir constructor'ı olsun.
// Bu constructor, ürün adını, fiyatını ve stok adedini alacak şekilde tasarlanmalıdır.
// Aynı zamanda, bu constructor içinden "display" adında bir metodu çağırarak ürün bilgilerini ekrana yazdırın.

// Örnek çıktı:
// Ürün Adı: Laptop, Fiyat: 4000.0 TL, Stok: 15 adet
public class Product {
    String urunAdi;
    double urunFiyati;
   int stokAdeti;
   public Product(String urunAdi, double urunFiyati, int stokAdeti){
       this.urunAdi=urunAdi;
       this.urunFiyati=urunFiyati;
       this.stokAdeti=stokAdeti;
       display();

   }
   private void display() {
        System.out.println("Ürün Adı:"+urunAdi+"\nFiyat:"+urunFiyati+"\nStok Adeti:"+stokAdeti);
    }

    public static void main(String[] args) {

        Product urunBilgileri= new Product("Nutella",70,1000);

    }
}
