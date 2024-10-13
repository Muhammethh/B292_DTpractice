package day04;

public class C04_arrays {
    public static void main(String[] args) {

        /*
        4.soru Verilen bir int array'deki
        en buyuk sayiyi yazdiran bir method olusturun.
        */

        int sayi[] = {1, 4, 7, 3, 2, 8, 6, 4, 9, 4, 2, 3, 5, 1, 99, 123, 632, 213, 543, 4332, 43, 56, 7, 54, 657};
        System.out.println("----");
        maxSayiYazdır(sayi);
        System.out.println("----");

    }

    public static void maxSayiYazdır(int[] sayi) {

        int max = sayi[0];

        for (int w : sayi) {
            if (w > max) {
                max = w;
            }

        }
        System.out.println("Max sayı: " + max);
    }

    /*
            6.Soru -Verilen String bir array'de en uzun
            ve en kisa String'leri yazdıran bir method olusturun
            */


            /* 7.soru -Verilen bir array'in istenen bir elemani icerip icermedigini kontrol edip, bize
         true veya false sonucu donen bir method olusturun

         */











}
