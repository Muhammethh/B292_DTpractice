package day06.encapsulation;

public class Runner {

    public static void main(String[] args) {


        //Mete, Han, 25 ozelliklerine sahip bir obje olusturunuz ve yazdiriniz
        //objenin yasinı 30 olarak guncelleyin
        //paranetresiz cons kullanarak 2. bir obje olusturun
        //Ayse, Yilmaz, 40 degerlerini atayin
        //yas'ı -5 olarek guncelleyin
        //yas negatif deger olamayacak sekilde set methodunu quncelleyin

        //ODEV
        //isim ve soyismin sadece ilk harfi okunsun diğerleri * olsun,
        //getter metodunda gerekli düzeltmeyi yapınız.

        Student std = new Student("Mete","Han",25);
        System.out.println(std);

        std.setYaş(30);
        System.out.println(std);

        Student std1 = new Student();

        std1.setIsim("Ayse");
        std1.setSoyIsim("Yılmaz");
        std1.setYaş(40);
        System.out.println(std1);

        System.out.println("////////////////");
        std1.setYaş(-5);
        System.out.println(std1);
        System.out.println("////////////////");



    }
}
