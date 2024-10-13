package day03;

public class C01_StringManipulation {

    public static void main(String[] args) {

        //Bir String' de benzersiz(tekrarsız) karakterler yazdırmak için kod yazınız

        String str = "Java her zaman güzeldir";

        String str2 = "";

        for (int i = 0; i < str.length(); i++) {

            if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))){

                str2= str2+ str.charAt(i);
                //veya
                // str2 += str.charAt(i);
            }
        }
        System.out.println(str2);
    }
}
