package day03;

import java.util.Random;
import java.util.Scanner;

public class C06_whileLoop {

    public static void main(String[] args) {

        // kullanicidan istedigi kadar pozitif sayi girmesini isteyin
        // kullanicinin girdigi sayilarin toplami 500'u gecerse
        // artik yeter cok sayi girdin, toplam.... oldu yazsin

        Scanner input = new Scanner(System.in);

        /*double sayı;
        double toplam = 0;


        while (toplam <= 500) {
            System.out.println("istenilen sayıyı girin");
            sayı = input.nextDouble();
            toplam += sayı;

        }
        System.out.println(toplam);

         */

        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin
        // Random rnd=new Random();
        // int sayi=rnd.nextInt(100);  // burasi 100'den kucuk rastgele bir sayi olusturur
        //odev!!!kullaniciya 5 tahmin hakkı verin bulursa tebrik edin bulamazsa exit atip tekrar oynamasini isteyin

        Random rnd = new Random();

        int sayı2 = rnd.nextInt(100);

        int deneme = 1;
        int kalanHak = 4;


        while (deneme <= 5) {

            System.out.println("Bir tahmin girin");
            int tahmin = input.nextInt();

            if (sayı2 > tahmin) {
                System.out.println("Sayı daha büyük");
                System.out.println("kalan hak " + (kalanHak--));
            } else if (sayı2 < tahmin) {

                System.out.println("Sayı daha küçük");
                System.out.println("kalan hak " + (kalanHak--));
            } else {
                System.out.println("Tebrikler sayıyı " + deneme + ". denemede buldunuz");
            }
            if (kalanHak<0){
                System.out.println("Sayı " + deneme + ". denemede bulunamadı");
            }
            deneme++;
        }


        //Hocanın çözümü


        //Scanner input=new Scanner(System.in);
        //Random rnd=new Random();
        int rndsayi=rnd.nextInt(100);

        int tahminHakki=5;
        while (tahminHakki>0){
            System.out.println("Lütfen tahminde bulunmak icin 1-100 arasında bir sayi giriniz ☺");
            int sayi=input.nextInt();
            if (sayi>100||sayi<0){
                System.out.println("Lütfen verilen aralıkta bir deger giriniz");
            }else {
                if (rndsayi>sayi){
                    System.out.println("daha büyük bir sayi giriniz");
                } else if (rndsayi < sayi){
                    System.out.println("daha küçük bir sayi giriniz");
                }else {
                    System.out.println("Tebrikler, dogru tahmin!");
                    break;
                }
                tahminHakki--;
                System.out.println("Kalan tahmin hakkınız : "+tahminHakki);
                if (tahminHakki==0){
                    System.out.println("Tahmin hakkınız bitmiştir eğer dilerseniz 3 tane daha alabilirsiniz almak e almamak icin h tuşuna basınız");
                    String str= input.next();
                    if (str.equals("e")){
                        tahminHakki+=3;
                    }else {
                        System.out.println("Görüşmek üzere tekrar bekleriz...");
                    }
                }


            }}







    }
}
