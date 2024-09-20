package day02;

public class C04_stringmanipulation {

    public static void main(String[] args) {

        /*
        Kişi isimleri için 3 String değişken oluşturunuz. Boşluk karakterleri hariç 3 isimdeki
        karakter sayısının toplamını yazdırınız.
        */

        String isim1 = "Ali Can";
        String isim2 = "Ömer Faruk Can";
        String isim3 = "Veli Can";

        isim1 = isim1.replace(" ", "");
        isim2 = isim2.replace(" ", "");
        isim3 = isim3.replace(" ", "");

        int lenght1 = isim1.length();
        int lenght2 = isim2.length();
        int lenght3 = isim3.length();

        System.out.println("Toplam harf sayısı: " + (lenght1+lenght2+lenght3));


    }
}
