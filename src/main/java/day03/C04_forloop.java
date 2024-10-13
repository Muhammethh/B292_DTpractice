package day03;

public class C04_forloop {

    public static void main(String[] args) {

        /*
            * * * * .
            * * * . .
            * * . . .
            * . . . .
            . . . . .
*/

        int satır = 5;

        for (int bulunanSatır = 1; bulunanSatır <= satır; bulunanSatır++) {

            for (int yıldızSayısı = satır - bulunanSatır; yıldızSayısı > 0; yıldızSayısı--) {
                System.out.print("* ");
            }
            for (int nokta = 1; nokta <= bulunanSatır ; nokta++) {
                System.out.print(". ");
            }
            System.out.println();
        }


        /*
               *
              * *
             *****
            *     *
           *       *

         */

        int satir=5;


        for (int bulsatir = 1; bulsatir <=satir ; bulsatir++) {
            for (int bosluk = satir-bulsatir; bosluk >=1 ; bosluk--) {
                System.out.print(" ");
            }
            for (int yildiz = 1; yildiz <= bulsatir*2-1; yildiz++) {
                if (yildiz==1||yildiz==bulsatir*2-1||bulsatir==satir/2+1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }





    }
}
