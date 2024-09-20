package day02;

import java.util.Scanner;

public class C5_forloops {

    public static void main(String[] args) {

        /* Kullanicidan 100'den kucuk bir pozitif tamsayi isteyin.
        1'den baslayarak girilen sayiya kadar(istenen sayi dahil) 3'un kati olan sayilari yazdirin.
        */

        Scanner input = new Scanner(System.in);
        System.out.println("LÜtfen 100den küçük bir tam sayı giriniz");
        byte sayı1 = input.nextByte();

        if(sayı1<0 || sayı1>100){
            System.out.println("lütfen geçerli bir sayı giriniz");

        }else {
            //1. yol
            //    for (int i = 1; i <=sayı1 ; i++) {
            //        if (i%3==0) {
            //            System.out.print(i + " ");
            //    toplam=toplam+i;
            //        }
            //    }
            //    System.out.println("toplam : "+toplam);
            //2.yol
            for (int i = 3; i < sayı1; i+=3) {//i=i+3;
                System.out.print(i + " ");
            }


        }

    }
}
