package day05;

import java.time.LocalDate;

public class C07_dateTime {

    public static void main(String[] args) {

             /*
       soru 1)
       -bugunun tarihini obje olusturarak yazdirin
       -bugun yilin kacinci gunu oldugunu yazdirin
       -hangi gunde oldugumuzu yazdirin
       -yılın bitmesine kac gun kaldıgını yazdırın
       -bugunden itibaren 3yil 5 ay 7gun sonraki tarihi yazdirin
       -bugunden itibaren 2yil 2 ay 2 gun sonraki tarihin ayin kacinci gunu oldugunu yazdirin
       -bugunden itibaren 7yil 7 ay 7 gun sonraki tarihin haftanin hangi gunu oldugunu yazdirin
       -ikinci bir tarih objesi olusturun ve iki tarihi karsilastirin ve bize eski olan tarihi dondurun
*/

        LocalDate today = LocalDate.now();
        int dayOfYear = today.getDayOfYear();
        System.out.println(today.getDayOfWeek());
        System.out.println(today.getDayOfYear()-365);

        if (today.isLeapYear()){
            System.out.println(today.getDayOfYear()-366);
        }else {
            System.out.println(today.getDayOfYear()-365);
        }
        System.out.println(today.plusYears(3).plusMonths(5).plusDays(7).getDayOfMonth());


        //soru 2)
        //-suanin saatini dakikasini ve saniyesini bize dondurun
        //-suanin saniyesini bize dondurun
        // -10000 saniye sonrasini bize dondurun
        //-200 dakika onceki saati bize dondurun
        //-bize saati 3 yapip yazdirin(dakika ve saniye degismeden)
        //Odev!!!!

        ///*
        //        soru 3)
        //        bize bugunun tarihini ve su anki saati dondurun
        //        bize 3 ay 100 saat sonraki tarih ve saati dondurun
        //        bize 100 gun once 100 saat sonraki tarihi dondurun
        //        bize 3 yil 5 ay 10 gün 1000 saat sonraki tarihin haftanin hangi günü oldugunu dondurun
        //        bize sadece bugunun tarihi dondurun
        //        LocalDateTime kullanarak yapın tum hepsini
        //         */
        // Odev!!!


    }

}
