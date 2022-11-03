package me.snajdovski.vezbi2oop.z03;

public class Covek {

    //Public attributes of the class
    public String name;
    public String surname;
    public int  birthID;
    public String birthIDASString;

    //Public default Constructor with dynamic params
    public Covek(String name, String surname, int birthID) {
        this.name = name;
        this.surname = surname;
        this.birthID = birthID;
        this.birthIDASString = String.valueOf(birthID);
    }
}

