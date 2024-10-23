package day06.encapsulation;

public class Student {

    //encapsulation: data hiding veri koruma ve gizleme

    /*
        bir class oluşturalım.
        private access modifiera sahip variablelar oluşturun: isim, soyisim, yas seklinde
        parametreli ve parametresiz constructor oluşturun
        toString metodunu oluşturun
*/
    //private=gizli, protected=ev, default=oda, public=kütüphane;

    private String isim;
    private String soyIsim;
    private int yaş;


    //getter:okuma
    public String getIsim() {
        return isim;
    }

    public String getSoyIsim() {
        return soyIsim;
    }

    public int getYaş() {
        return yaş;
    }





    //Setter:değiştirme, güncelleme
    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void setSoyIsim(String soyIsim) {
        this.soyIsim = soyIsim;
    }

    public void setYaş(int yaş) {

        if (yaş<0){
            System.out.println("yaş 0'dan küçük olamaz");
        }else {
            this.yaş = yaş;
        }
    }






    //noArguments Constructor
    public Student() {
    }




    //allArgumanents constructor
    //hızlı değer ataması
    public Student(String isim, String soyIsim, int yaş) {
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.yaş = yaş;
    }



    //hızlı görüntüleme
    @Override
    public String toString() {
        return "Student{" +
                "isim='" + isim + '\'' +
                ", soyIsim='" + soyIsim + '\'' +
                ", yaş=" + yaş +
                '}';
    }

}
