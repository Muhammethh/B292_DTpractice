package day01_variables;

public class C01_variables {

    public static void main(String[] args) {

        //iki sayinin toplamini yeni bir degere atayanizi ve yazdiriniz

        int sayi1 = 76;
        double sayı2 = 89.6;

        double toplam = sayi1 + sayı2;
        System.out.println(toplam);

        //ayni sayilari toplayip sadece tam kismini alin

        //ayni sayilari toplayip sadece tam kismini alin

        //int toplam2 = a + (int)b ;


        //2.yol :
        // int toplam2 = (int)(a + b) ;


        //3. yol
        //int toplam2=(int)toplam;

        double x=5.7;
        double y=6.8;
        
        double toplam3=x+y;
        System.out.println("toplam3 = " + toplam3); //12.5

        int toplam4=(int)x+(int)y;
        System.out.println("toplam4 = " + toplam4);//11

        int toplam5=(int)(x+y);
        System.out.println("toplam5 = " + toplam5);//12

        int toplam6=(int)toplam3;
        System.out.println("toplam6 = " + toplam6);//12






    }
}
