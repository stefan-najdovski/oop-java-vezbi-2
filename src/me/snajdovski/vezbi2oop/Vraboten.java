package me.snajdovski.vezbi2oop;

public class Vraboten {
    public String name;
    public String surname;
    public int salary;

    public Vraboten(){}

    public Vraboten(String name, String surname, int salary) {
        //staticni parmetri
        this.name = "Aleksandar";
        this.surname = "Spirovski";
        this.salary = 15_000;
    }
}
