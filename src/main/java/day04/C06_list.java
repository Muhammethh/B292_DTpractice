package day04;

import java.util.ArrayList;
import java.util.Arrays;

public class C06_list {

    public static void main(String[] args) {


        // verilen bir listede tekrar eden sayilari sadece 1 tane yapan
        // bir method olusturun
        // orn : [1, 3, 5, 3, 5, 6, 1, 7]  bu listi
        //       [1, 3, 5, 6, 7] bu hale donusturun

        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1, 3, 5, 3, 5, 6, 1, 7));
        System.out.println(myList);

       tekrarsızList(myList);

    }

    private static void tekrarsızList(ArrayList<Integer> myList) {


        ArrayList<Integer> newList = new ArrayList<>();

        for (Integer w : myList){

            if (!newList.contains(w)){

                newList.add(w);
            }else {
                System.out.println("Bu sayıdan 1den fazla var: " + w);
            }

        }
        System.out.println(newList);


    }


}
