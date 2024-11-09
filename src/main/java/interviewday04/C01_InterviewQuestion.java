package interviewday04;

import java.util.Scanner;

public class C01_InterviewQuestion {

    // Bir metin içinde kullanıcıdan alınan bir kelimenin kaç kez geçtiğini sayan bir Java metodu yazın.
    // Metin büyük/küçük harf duyarlı olmamalıdır.
    // Örnek girdi olarak 'Java, Java, and java!' verildiğinde kullanıcı java girerse, çıktı olarak 3 verilmelidir


    public static void main(String[] args) {

        String str = "Java, Java and java!";
        Scanner input = new Scanner(System.in);
        System.out.println("aramak istediğiniz kelimeyi giriniz");
        String word = input.next();
        //kelimeSay(str, word);
        kelimeSay2(str, word);

    }


    //--------2.Yol
    private static void kelimeSay2(String cumle, String arananKelime) {
        cumle = cumle.toLowerCase().replaceAll("[^a-z]", "");
        arananKelime = arananKelime.toLowerCase();
        String[] arr = cumle.split(" ");

        int sayaç = 0;

        for (String w : arr) {

            if (w.contains(arananKelime)) {
                sayaç++;
            }

        }
        System.out.println("Bu kelimeden toplam sayı: " + sayaç);
    }

    //------1.Yol
    private static void kelimeSay(String cumle, String arananKelime) {

        cumle = cumle.toLowerCase();
        arananKelime = arananKelime.toLowerCase();
        //direkt küçülttük çünkü duyarsız

        int count = 0;
        int index = 0;

        while ((index = cumle.indexOf(arananKelime, index)) != -1) {

            count++;
            index += arananKelime.length();

        }
        System.out.println("Bu kelimeden toplam sayı: " + count);

    }


}
