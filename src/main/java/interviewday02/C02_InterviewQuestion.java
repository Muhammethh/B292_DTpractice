package interviewday02;

import java.util.Scanner;

public class C02_InterviewQuestion {

    public static void main(String[] args) {

        //bir cümlenin kelimelerini sayacak, her kelimeyi ters çevirecek kodu yazınız

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz");
        String str = input.nextLine();

        //hem kelimelere ayırdık hem de kelime sayısını bulduk
        String[] words = str.split(" ");


        System.out.println("Ters çevrilmiş kelimeler");
        for (String w : words) {

            System.out.println(new StringBuilder(w).reverse());

        }

        for (int i = words.length - 1; i >= 0; i--) {
            StringBuilder sb = new StringBuilder(words[i]);
            System.out.print(sb.reverse() + " ");
        }


    }
}
