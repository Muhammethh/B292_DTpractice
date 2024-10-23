package day06.inheritance02;

public class Opel extends Araba {

    //hareket, hız, yakıt, marka, ve motor

       public String marka ="Opel";
       public String yakıt ="Opel arabalarda dizel yakıt türü kullanılır";
        public String sirketMerkezi="Almanya";

    @Override
    public void motor() {
        System.out.println("Opel arabaları opel marka motor kullnamak");
    }

    @Override
    public void yakıtTüketimi() {
        System.out.println("Opel çok az yakıt tüketir");
    }

    public void fren(){

        System.out.println("opel arabalar abs özelliğine sahip fren kullanır");
    }


}
