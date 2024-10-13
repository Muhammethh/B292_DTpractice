package interviewday01;

import java.util.Scanner;

public class C06_InterviewQuestion {

    public static void main(String[] args) {

        //Sayının armstrong olup olmadığını kontrol ediniz

        /*

        basamak sayımız 3 olduğu için küp 3 aldık

        454 ---> 4^3 + 5^3 + 4^3 != 454---> no armstrong
        123
        548
        407---> 4^3 + 0^3 + 7^3 == 407 --->armstrong
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Sayı giriniz");
        int sayı = input.nextInt();

        int sayaç = 0;
        for (int i = sayı; i > 0; i /= 10) {

            sayaç++;
        }

        int sum = 0;

        for (int i = sayı; i > 0; i /= 10) {

            sum += power(i % 10, sayaç); //Math.Pow metodunu aşağıda kendimiz yazıp buraya uyguladık

        }


        if (sayı == sum) {
            System.out.println("armstrong");
        } else {
            System.out.println("değil");
        }

    }

    public static int power(int a, int b){

        int c = 1;

        for (int i = 1; i <=b ; i++) {

            c*=a;
        }
        return c;

    }

}
