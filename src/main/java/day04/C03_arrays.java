package day04;

import java.util.Arrays;

public class C03_arrays {

    public static void main(String[] args) {


               /*
            3.soru Verilen array
            in tum elemanlarini bir soldaki konuma tasiyacak
            bir program yazin. Ornek; array ((1,2,3,4,5)) ise output (2, 3,4,5, 1) olacak
            
*/
        
        
        int[] nums = {1,2,3,4,5};

        int temp = nums[0];
        //indexler ile işimiz var ise veya eleman sayısı değişecekse her zaman for döngüsü olmalı aksi halde for each


        for (int i = 0; i < nums.length-1 ; i++) {
            nums[i]=nums[i+1];
            System.out.println(Arrays.toString(nums));
        }

        nums[nums.length-1]=temp;
        System.out.println(Arrays.toString(nums));

    }
}
