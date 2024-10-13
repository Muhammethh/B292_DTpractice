package interviewday01;

import java.util.Scanner;

public class C04_InterviewQuestion {

    public static void main(String[] args) {


        /*
                Print Reverse number in  java program
                Bir sayiyi tersten yazdıran programi yazınız
 */
            //örnek 714 ---->417

        Scanner input = new Scanner(System.in);
        System.out.println("sayı girin");

        //1.yol

       /* for (int sayı = input.nextInt(); sayı > 0; sayı/=10) {

            System.out.print(sayı%10);

        }*/

        //2.Yol

        int reversed=0;

        for (int sayı = input.nextInt(); sayı > 0; sayı/=10) {

            reversed=reversed*10;
            reversed=reversed + sayı%10;

        }
        System.out.println(reversed);






    }
}
