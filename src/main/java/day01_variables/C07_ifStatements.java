package day01_variables;

import java.util.Scanner;

public class C07_ifStatements {
    public static void main(String[] args) {

        // Soru 1) Kullanicidan 100 uzerinden notunu isteyin.
        // Not'u harf sistemine cevirip yazdirin.
        // 50’den kucukse "D",
        // =50  <60 arasi "C",
        // =60  <80 arasi "B",
        // =80’nin uzerinde ise "A"

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen notunuzu girin");
        float not = input.nextFloat();

        if (not<0) {
            System.out.println("Not 0dan küçük olamaz");
        } else if (not<51) {
            System.out.println("Harf notunuz D dir");

        } else if (not<61) {
            System.out.println("Harf notunuz C dir");

        } else if (not < 81) {
            System.out.println("Harf notunuz B dir");
        } else if (not < 101) {
            System.out.println("Harf notunuz A dır");
        }else {
            System.out.println("Not 100den büyük olamaz");
        }

    }
}
