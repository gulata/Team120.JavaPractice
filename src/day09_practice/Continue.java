package day09_practice;
/*
1'den 10'a kadar (10 Dahil Sayıları sırayla yazdırın. Fakat 5 olmasın)
    */
public class Continue {
    public static void main(String[] args) {

        for (int i = 1; i <11 ; i++) {
            if (i==5){
                continue;
            }
            System.out.print(i+" ");

        }



    }
}
