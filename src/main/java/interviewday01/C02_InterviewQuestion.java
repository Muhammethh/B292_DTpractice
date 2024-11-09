package interviewday01;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;



public class C02_InterviewQuestion {

    public static void main(String[] args) {

        /*
             Java'da 2 degisken nasıl değiştirilir?
             How to swap 2 variables in Java?
 */

        int a = 6;
        int b = 10;


        //1.yol
        a=a^b;
        b=a^b;
        a=a^b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);



        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a);
        System.out.println(b);



    }
}
