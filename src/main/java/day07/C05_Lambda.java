package day07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_Lambda {
    public static void main(String[] args) {
         /*
    5)bir listedeki tekrarsiz elemanlardan 4'e tam bolunenlerin karekoklerinin carpimini yazdirin
 */
        List<Integer> mylist = new ArrayList<>(Arrays.asList(4, 8, 16, 64, 16, 64));
        tekrarsız4ebölünenler(mylist);
    }

    private static void tekrarsız4ebölünenler(List<Integer> myList) {

        double sum = myList.stream().distinct().filter(t -> t % 4 == 0).map(Math::sqrt).reduce(1.0, (t, u) -> t * u);
        System.out.println(String.format("%.2f",sum));

    }


}
