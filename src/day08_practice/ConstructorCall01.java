package day08_practice;

// Bir "ConstructorCall01" sınıfı oluşturun ve bu sınıfın bir constructor'ı olsun.
// Bu constructor, x ve y koordinatlarını alacak şekilde tasarlanmalıdır.
// Aynı zamanda, bu constructor içinden "display" adında bir metodu çağırarak koordinatları ekrana yazdırın.

// Örnek çıktı:
// X: 5, Y: 10
public class ConstructorCall01 {
    int x;
    int y;

    public ConstructorCall01(int x, int y){

        this.x=x;
        this.y=y;

        display();

    }

    private void display() {
        System.out.println("X:" + x + " "+ "Y:"+y);
    }

    public static void main(String[] args) {
        ConstructorCall01 koordinat= new  ConstructorCall01(5,10);

    }

}
