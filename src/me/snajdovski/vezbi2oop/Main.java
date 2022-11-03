package me.snajdovski.vezbi2oop;

import me.snajdovski.vezbi2oop.z01.Student;
import me.snajdovski.vezbi2oop.z02.Vraboten;
import me.snajdovski.vezbi2oop.z03.Covek;
import me.snajdovski.vezbi2oop.z04.Avtomobil;
import me.snajdovski.vezbi2oop.z05.Predmet;

public class Main {
    public static void main(String[] args) {
    Student s1 = new Student();
    s1.name = "Stefan";
    s1.surname = "Najdovski";
    s1.studentID = 123456;



    System.out.println("Prv Obj");
    System.out.println(s1.name + " " + s1.surname + " " + s1.studentID);

    System.out.println("Vtor Obj");
    Student s2 = new Student("Stefan", "Stefanov", 246810);
    System.out.println(s2.name + " " + s2.surname + " " + s2.studentID);

    //Vraboten
        Vraboten vraboten1 = new Vraboten();
        System.out.println("Vraboten 1");
        System.out.println("Ime na vraboten e: " + vraboten1.name);
        System.out.println("Prezime na vraboten e: " + vraboten1.surname);
        System.out.println("Negovata plata iznesuva: " + vraboten1.salary);



        //Covek
        Covek covek1 = new Covek("Aleksandar", "Spirovski", 3090000);
        System.out.println("Ime na covekot e: " + covek1.name );
        System.out.println("Prezimeto na covekot e: " + covek1.surname );
        System.out.println("Covekot ima maticen broj: " + covek1.birthID );

    //Avtomobil
        Avtomobil avtomobil1 = new Avtomobil();
        Avtomobil avtomobil2 = new Avtomobil();

        System.out.println("Avtomobil 1");
        System.out.println("Markata na avtomobilot e: " + avtomobil1.marka);
        System.out.println("Modelot na avtomobilot e: " + avtomobil1.model);
        System.out.println("Pominatite kilometri na avtomobilot iznesuvaat: " + avtomobil1.pominatiKilometri);

        System.out.println("Avtomobil 2");
        avtomobil2.marka = "BMW";
        avtomobil2.model = "X5";
        avtomobil2.pominatiKilometri = 500_000;
        System.out.println("Markata na avtomobilot e: " + avtomobil2.marka);
        System.out.println("Modelot na avtomobilot e: " + avtomobil2.model);
        System.out.println("Pominatite kilometri na avtomobilot iznesuvaat: " + avtomobil2.pominatiKilometri);


        //Predmet
        Predmet predmet1 = new Predmet();
        Predmet predmet2 = new Predmet("PKM","Pece",3,6);
        Predmet predmet3 = new Predmet("Sistemski");
        System.out.println("Predmet 1");
        System.out.println("Predmetot se vika " + predmet1.imeNaPredmet + ", ime na profesor " + predmet1.imeNaProfesor + ", se slusa vo " + predmet1.semstar+" semestar"+" i iznesuva "+predmet1.brNaKrediti+" krediti");

        System.out.println("Predmet 2");
        System.out.println("Predmetot se vika " + predmet2.imeNaPredmet + ", ime na profesor " + predmet2.imeNaProfesor + ", se slusa vo " + predmet2.semstar+" semestar"+" i iznesuva "+predmet2.brNaKrediti+" krediti");

        //Predmet 3
        predmet3.imeNaPredmet = "Sistemski Softver";
        System.out.println("Predmetot se vika " + predmet3.imeNaPredmet);
    }
}