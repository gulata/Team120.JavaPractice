package day09_practice;
/*
       Verilen bir array'de  istenilen elemanın olup olmadığını kontrol eden
       varsa kaç kere kullanıldığını yazdıran bir method oluşturunuz.
       {2,3,4,5,6,7,5,8,3,5,7,5,2,5}
        */
public class Arrays {
    public static void main(String[] args) {
        int []arr={2,3,4,5,6,7,5,8,3,5,7,5,2,5};

        istenenElemaniAra(arr,5);
    }

    private static void istenenElemaniAra(int[] arr, int istenen) {
        int flag=0;
        for (int i = 0; i <arr.length ; i++) {
            if (istenen==arr[i]){
                flag++;
            }}
            if (flag!=0){
                System.out.println("Verilen array'de aradığımız"+istenen+ " elemanı"+flag+ " kez vardır");

            }else {
                System.out.println("Verilen array'de aradığımız "+istenen+" elemanı yoktur");
            }
        }


    }





