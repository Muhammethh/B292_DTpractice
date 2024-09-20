package day01_variables;

import java.util.Scanner;

public class C05_scanner {

    public static void main(String[] args) {

        //Soru : Kullanicidan dikdortgenler prizmasinin uzun,
        //kisa kenarlarini ve
        //yuksekligini isteyip prizmanin hacmini(uzun*kısa*yukselik) hesaplayip yazdirin


        Scanner input = new Scanner(System.in);


       /* System.out.println("Lütfen uzun kenarı girin");

        double uzunKenar = input.nextDouble();
        System.out.println("Lütfen kısa kenarı girin");
        double kisaKenar = input.nextByte();
        System.out.println("Lütfen yüksekliği girin");
        double yukseklik = input.nextByte();

        System.out.println("Hacim:" + uzunKenar*kisaKenar*yukseklik);
        */
        //-------------------------------------------------


        System.out.println("Lütfen uzun kısa ve yüksekliğini kenarı girin");
        double uzunKenar = input.nextDouble();
        double kisaKenar = input.nextByte();
        double yukseklik = input.nextByte();
        System.out.println("Hacim:" + uzunKenar*kisaKenar*yukseklik);




    }
}
