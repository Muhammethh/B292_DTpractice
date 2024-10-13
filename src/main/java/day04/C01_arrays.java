package day04;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C01_arrays {

    public static void main(String[] args) {
        /*
        1.soru bir array olusturun ve olusturdugunuz arraydeki tum elemanları yazdırın
 */


        String[] names = {"Ali can","Muhammet","Sinan","Esra","Kerim","Tuba"};
        System.out.println(Arrays.toString(names));

        for (String w: names){

            System.out.print(w + ", ");
        }

    }
}
