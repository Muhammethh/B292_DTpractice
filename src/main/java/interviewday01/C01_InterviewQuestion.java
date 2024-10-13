package interviewday01;

import java.util.Scanner;

public class C01_InterviewQuestion {

    public static void main(String[] args) {

       /* How to convert
        Fahrenheit  to Celsius

        Program in
        java*/

        //java'da nasıl fahrenheit celcius'a cevrilir

        double derece;

        Scanner input = new Scanner(System.in);
        System.out.println("Fahreneit cindisnde dereceyi giriniz");
        derece = input.nextDouble();

        derece = (derece-32)*5/9;
        System.out.println(derece);




    }
}
