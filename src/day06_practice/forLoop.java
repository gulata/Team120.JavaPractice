package day06_practice;

public class forLoop {
    public static void main(String[] args) {
        /*
    SORU -1:
    Çarpım tablosunu ekrana yazdıran bir program yazın (örneğin 1x1'den 10x10'a kadar).
     */

        for (int i = 1; i <=10 ; i++) {
            for (int j = 1; j <=10 ; j++) {
                System.out.println(i+"x"+j+"="+(i*j));

            }

        }


    }


}
