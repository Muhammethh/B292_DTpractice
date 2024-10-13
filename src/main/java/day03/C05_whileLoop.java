package day03;

import java.util.Scanner;

public class C05_whileLoop {

    public static void main(String[] args) {

        // kullanicidan toplamak istedigi sayilari alin
        // ve kullanici 0'a basincaya kadar devam edin
        // kullanici 0'a bastiginda
        // girdigi tum sayilarin toplamini yazdirin

        Scanner input = new Scanner(System.in);
        double sayı;
        double toplam = 0;


        do {

            System.out.println("Lüfen toplamak istenilen sayıyı girin");
            sayı = input.nextDouble();
            toplam = toplam + sayı;
            System.out.println(toplam);

        }while (sayı != 0);



    }
}
