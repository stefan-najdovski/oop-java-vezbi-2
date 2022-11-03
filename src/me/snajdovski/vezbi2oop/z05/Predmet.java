package me.snajdovski.vezbi2oop.z05;

public class Predmet {

    public String imeNaPredmet;
    public String imeNaProfesor;
    public int semstar;
    public int brNaKrediti;

    //Constructor with static params
    public Predmet() {
        //staticni parmetri
        this.imeNaPredmet = "OOP";
        this.imeNaProfesor = "Ilija";
        this.semstar = 3;
        this.brNaKrediti = 4;
    }
    //Constructor with 1 param

    public Predmet(String imeNaPredmet) {
        this.imeNaPredmet = imeNaPredmet;
    }
    //Dynamic Constructor with all params
    public Predmet(String imeNaPredmet, String imeNaProfesor, int semstar, int brNaKrediti) {
        this.imeNaPredmet = imeNaPredmet;
        this.imeNaProfesor = imeNaProfesor;
        this.semstar = semstar;
        this.brNaKrediti = brNaKrediti;
    }
}
