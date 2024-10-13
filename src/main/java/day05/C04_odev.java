package day05;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C04_odev {
    public static void main(String[] args) {

        /*
        icinde 200 tane 1000'den kucuk pozitif tamsayi olan bir list olusturun
        kullanicidan bir sayi isteyip
        listede var olup olmadigini kullaniciya yazin
        */

        Scanner input = new Scanner(System.in);


        Random rnd = new Random();
        int sayı = 0;

        List<Integer> myLİst = new ArrayList<>();
        while (myLİst.size() < 200) {

            sayı = rnd.nextInt(1000);
            if (!myLİst.contains(sayı)) {

                myLİst.add(sayı);
            }
        }
        System.out.println(myLİst.size());


        System.out.println("Sayıyı giriniz");
        sayı= input.nextInt();

        if (myLİst.contains(sayı)){
            System.out.println("sayı listede mevcut");
            myLİst.indexOf(sayı);
        }else {
            System.out.println("sayı listede mevcut değil");
        }

    }
}
