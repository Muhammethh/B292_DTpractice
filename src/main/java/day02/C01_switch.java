package day02;

import java.util.Scanner;

public class C01_switch {

    public static void main(String[] args) {

        //Toplama, Çıkarma, Çarpma, Bölme , kalan Hesaplama ve us alma
        // 2 sayi işlem yapan basit bir Hesap Makinesi oluşturun:


        Scanner input = new Scanner(System.in);


        System.out.println("Lütfen işlem yapmak istediğiniz operatoru giriniz : \\ntoplama icin : +\\ncıkarma icin : -\\ncarpma icin : *\\nbolme icin : /\\nus almak icin : ^\\nkalan hesaplama icin : %");

        char operator = input.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println("Lütfen sayıları giriniz");
                System.out.println("Sayıların toplamı" + (input.nextInt() + input.nextInt()));
                break;
            case '-':
                System.out.println("Lütfen sayıları giriniz");
                System.out.println("Sayıların çıkarması" + (input.nextInt() - input.nextInt()));
                break;
            case '*':
                System.out.println("Lütfen sayıları giriniz");
                System.out.println("Sayıların çarpımı" + (input.nextInt() * input.nextInt()));
                break;
            case '/':
                System.out.println("Lütfen sayıları giriniz");
                System.out.println("Sayıların bölümü" + (input.nextInt() / input.nextInt()));
                //paydanın 0 olma durmunu kontrol ediniz
                break;
            case '%':
                System.out.println("Lütfen sayıları giriniz");
                System.out.println("Sayıların modu" + (input.nextInt() % input.nextInt()));
                //paydanın 0 olma durmunu kontrol ediniz
                break;
            case '^':
                System.out.println("Lütfen birbirinin kuvvetini almak istediğiniz sayıları giriniz");
                System.out.println("sayılar kuvvet durumu:" +Math.pow(input.nextDouble(), input.nextDouble()));
                break;
            default:
                System.out.println("Lütfen geçerli bir operator girniz");
                break;


        }


    }
}
