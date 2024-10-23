package day06.inheritance02;

public class Araba {

        // Araba, Opel, Corsa adinda farkli class'lar olusturunuz.
    // Opel class'ı:Araba class'ina baglı olacak
    // Corsa class'a Opel class'ina baglı olacak
    // Araba class'ina genel bilgileri, variable ve method olarak yaziniz.
    // Opel class'ina gerekli bilgileri, variable ve method olarak yaziniz.
    // Corsa class'ına en spesifik bilgileri, variable ve method olarak yaziniz.
    // Corsa class'indan obje olusturarak variablelara ve methodlara yazdiriniz.

    public String hareket = "Arabalar tekerlek ile hareket eder";
    public String hız = "Arabalar motor gücüne göre hızlanır";
    public String yakıt = "Arabalar farklı yakıt türüne sahipler";
    public String marka = "Arabalar üretildikleri firmanın markasına sahipler";

    public void motor(){

        System.out.println("arabalar farklı marka motor kullanır");
    }

    public void yakıtTüketimi(){

        System.out.println("Arabalar yakıt tüketir");
    }


}
