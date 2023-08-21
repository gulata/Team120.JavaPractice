package day09_practice;

import java.util.ArrayList;
import java.util.List;

/*
      Verilen bir array içinde tekrar eden elementleri bulup mükerrer olanı silip
      her bir elemandan sadece 1 tane içeren(unique) bir array
      oluşturup bize döndüren method oluşturunuz
      arr={3,1,2,4,1,2,3,4,5,10,2,7}
       */
public class ArraysListe3 {
    public static void main(String[] args) {

        int[]arr={3,1,2,4,1,2,3,4,5,10,2,7};

        System.out.println("Tekrarsız Array: "+ tekrarlariSil(arr));



    }

    private static List<Integer> tekrarlariSil(int[] arr) {

        List<Integer>duzenliarr=new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
            if (!(duzenliarr.contains(arr[i]))){
                duzenliarr.add(arr[i]);

            }

        }


        return duzenliarr;
    }
}
