package day08_practice;
// Bir "Car" sınıfı oluşturun ve bu sınıfın bir constructor'ı olsun.
// Bu constructor, marka ve model bilgilerini alacak şekilde tasarlanmalıdır.

// Örnek çıktı:
// Car nesnesi oluşturuldu: Ford Focus
public class Car {

    String marka;
    String model;
    int yil;

    public Car(String marka, String model, int yil){
        this.marka=marka;
        this.model=model;
        this.yil=yil;

    }

    public static void main(String[] args) {
        Car car= new Car("Toyota","auris",2011);
        Car car2= new Car("Toyota","yaris",2023);
        Car car3= new Car("Toyota","corolla",2020);

        System.out.println("ilk arabam: "+ car.marka+" "+car.model+" "+car.yil);
        System.out.println("ikinci arabam: "+ car2.marka+" "+car2.model+" "+car2.yil);
        System.out.println("son arabam: "+ car3.marka+" "+car3.model+" "+car3.yil);
    }


}
