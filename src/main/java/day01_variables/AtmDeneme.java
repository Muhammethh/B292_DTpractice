package day01_variables;

import java.util.Scanner;

public class AtmDeneme {
    public static void main(String[] args) {


        System.out.println("Bakiyeniz: 1000. Para çekmek için 1'e. Para yatırmak için 2'e basınız");
        Scanner input = new Scanner(System.in);
        int choise = input.nextInt();
        double balance = 1000;





        do {
            switch (choise) {
                case 1:
                    System.out.println("Çekmek istediğiniz miktarı yazınız");
                    double withdraw = input.nextDouble();
                    if (withdraw>balance) {
                        System.out.println("Bakiye yetersiz");
                        break;
                    } else {
                        System.out.println("Yeni Bakiyeniz: "+ (balance - withdraw));
                    }
                    break;
                case 2:
                    System.out.println("Yatırmak istediğiniz miktarı yazınız");
                    double invest = input.nextDouble();
                    System.out.println("Yeni Bakiyeniz: "+ (balance + invest));
                    System.out.println("Başa dönmek için 3'e basınız");
                    break;
                default:
                    System.out.println("Uygun seçim yapılmadı");
                    break;
            }
        } while (choise==3);





    }
}
