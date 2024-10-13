package day02;

import java.util.Scanner;

public class C03_stringManipulation {

    public static void main(String[] args) {

        /*
         Kullanicidan email adresini girmesini isteyin,
          mail @gmail.com icermiyorsa "Lutfen gmail adresi giriniz",
          @gmail.com ile bitiyorsa "Email adresiniz kaydedildi "
          @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin

          odev!! bosluk karakteri varsada hata mesaji verin
 */


        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen mail giriniz");
        String mail = input.nextLine();

        if (!mail.contains("@gmail.com")){
            System.out.println("lütfen mail adresi girin");
        } else if (mail.endsWith("@gmail.com")) {
            System.out.println("mail adresi kaydedildi");
        }else {
            System.out.println("lütfen yazımı kontrol edin");
        }


        /* if (!email.contains("@gmail.com")){
            System.out.println("Lutfen gmail adresi giriniz :)");
        }else if (email.contains(" ")){
            System.out.println("lütfen bosluksuz yazdirin");
        } else if (email.endsWith("@gmail.com")) {
            System.out.println("Email adresiniz kaydedildi");
        }else {
            System.out.println("lütfen yazımını kontrol ediniz");

         */




    }
}
