package day03;

import java.util.Scanner;

public class C02_forloop {

    public static void main(String[] args) {

         /*
        soru 1) belirlenen sayının 1 den 10 a kadar çarpım sonuçlarını yapan Java programını yazınız.


        */

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı girin");
        int sayı = input.nextInt();


        for ( sayı = 0; sayı < 11; sayı++) {


            for (int j = 1; j < 11; j++) {
                System.out.println(sayı + "X" + j + "=" + (sayı * j));
            }

            System.out.println();
        }

        // 10X10luk çarpım tablosunda kullanıcıdan veri almaya gerek yok aslında

        /* for (int i = 1; i <=10 ; i++) {

            for (int j = 1; j <=10 ; j++) {
                System.out.print(i + " * " + j + " = " + i * j+"  ");
            }
            System.out.println("");
        }

         */

        // kullanicidan 10'dan kucuk bir tam sayi isteyin ve girilen sayinin faktoryelini bulun.

        System.out.println("tam sayı girin");
        int sayı2 = input.nextInt();
        int sonuc = 0;

        if (sayı2<10 && sayı2>0){

            for (int i = 1; i < sayı2; i++) {

                sonuc = sayı2*i;

            }
            System.out.println(sayı2 + "!" + sonuc);
        }else {
            System.out.println("geçerli bir değer giriniz");
        }

        //kendi olusturdugumuz hesap makinesine güncelleme olarak ekleyelim ÖDEV!!!!!!!!




    }
}
