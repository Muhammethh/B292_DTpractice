package interviewday02;

import java.util.ArrayList;
import java.util.Scanner;

public class C03_InterviewQuestion {
    public static void main(String[] args) {

       /* Kullanıcıdan bir pozitif tam sayı alın. Bu sayı, Fibonacci dizisinin kaç terimini üreteceğinizi belirleyecek.
                Fibonacci dizisini hesaplayın ve dizinin elemanlarını ekrana yazdırın.
                Fibonacci dizisinin toplamını hesaplayın ve ekrana yazdırın.
        Fibonacci dizisindeki en büyük terimi ve en küçük terimi bulun ve bunları ekrana yazdırın.
*/

        Scanner input = new Scanner(System.in);
        System.out.println("Kaç fibonacci terimi üreteceksiniz");
        int count = input.nextInt();
        //Fibonacci dizisi, 0 ve 1 ile başlar ve sonraki terimler, önceki iki terimin toplamı olarak hesaplanır.

        ArrayList<Integer> fibonacciList = new ArrayList<>();
        //ilk iki terimi ekleyelim
        fibonacciList.add(0); //1.terim
        fibonacciList.add(1); //2.terim

        //Fibonacci dizisini oluşturalım

        for (int i = 2; i <count ; i++) {

            int nextTerim = fibonacciList.get(i-1) + fibonacciList.get(i-2);
            fibonacciList.add(nextTerim);
        }

        //fibonacci dizisini yazdıralım
        System.out.println(fibonacciList);

        //Fibonacci dizisinin toplamını bulalım
        int sum=0;

        for (int num : fibonacciList){
            sum +=num;
        }
        System.out.println("Toplam: " + sum);




    }
}
