package me.snajdovski.vezbi2oop;

public class Main {
    public static void main(String[] args) {
    Student s1 = new Student();
    s1.name = "Stefan";
    s1.surname = "Najdovski";
    s1.studentID = 123456;
    System.out.println(s1.name + " " + s1.surname + " " + s1.studentID);
    }
}