package me.snajdovski.vezbi2oop.z04;

public class Avtomobil {

        //Attributes of the class
        public String marka;
        public String model;
        public int pominatiKilometri;

        //Constructor with static params
        public Avtomobil() {
            //staticni parmetri
            this.marka = "Audi";
            this.model = "A4";
            this.pominatiKilometri = 100_000;
        }

        //Constructor with dynamic params
        public Avtomobil(String marka, String model, int pominatiKilometri) {
            this.marka = marka;
            this.model = model;
            this.pominatiKilometri = pominatiKilometri;
        }
}
