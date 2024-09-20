package day02;

import java.util.Scanner;

public class C02_ternary {
    public static void main(String[] args) {

         /*
        Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
        değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
        1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
        Sesli harfler: a,e,i,o,u
          */

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen kontrol etmek istediğiniz harfi giriniz");

        String harf = input.next().toLowerCase();

        harf=harf.replaceAll("[^a-z]","^");
        harf= harf.replaceAll("[aeiou]","e");


        if(harf.contains("^")||harf.length()>1){
            System.out.println("Hatalıdır");
        }else {
            if (harf.equals("e")) {
                System.out.println("sesli harf");
            }else {
                System.out.println("sessiz harf");
            }
        }

            //nested ternary olarak çözümü

        String str = harf.contains("^")||harf.length()>1?("Hatalıdır"):(harf.equals("e")?"sesli harf":"sessiz harf");
        System.out.println(str);



    }
}
