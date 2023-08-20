package day08_practice;
// Soru: Referans veri tiplerinin nasıl çalıştığını anlamak için bir nesnenin bir metoda
// geçirilmesinin orijinal nesneyi nasıl etkilemediğini gösteren bir örnek yapınız.
public class passByValue {
    public static void main(String[] args) {
        StringBuilder text= new StringBuilder("Merhaba");
        System.out.println("ilk metin: "+ text);

        modify(text);
        System.out.println("son metin: "+ text);
    }

public static void modify(StringBuilder str) {
        str.append(" java");
    System.out.println("Method içinde : "+ str);

    }
}
