package day05;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class C08_DateTimeFormatter {

    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:m \n d.M.y ");
        LocalDateTime tarih = LocalDateTime.now();
        System.out.println(dtf.format(tarih));


    }
}
