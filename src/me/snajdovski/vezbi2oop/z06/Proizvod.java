package me.snajdovski.vezbi2oop.z06;

public class Proizvod {

    //Attributes of the class
    public String ime;
    public int tezina;
    public int cena;

    //Constructor with static params
    public Proizvod() {
        //staticni parmetri
        this.ime = "Cokolado";
        this.tezina = 100;
        this.cena = 55;
    }

    //Constructor with dynamic params
    public Proizvod(String ime, int tezina, int cena) {
        this.ime = ime;
        this.tezina = tezina;
        this.cena = cena;
    }
}

