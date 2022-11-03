package me.snajdovski.vezbi2oop.z07;

public class Triagolnik {

    //Attributes of the class
    public float a;
    public float b;
    public float c;

    //Float Constructor with dynamic params
    public Triagolnik(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //String Constructor with dynamic params

    public Triagolnik(String a, String b, String c) {
        this.a = Float.parseFloat(a);
        this.b = Float.parseFloat(b);
        this.c = Float.parseFloat(c);
    }

    public float perimetarNaTriagolnik() {
        return a + b + c;
    }
    public float plostinaNaTriagolnik() {
        float s = (Float) (a + b + c) / 2;

        //heronova formula
        return (float) Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}

