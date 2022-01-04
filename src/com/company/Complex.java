package com.company;

public class Complex {

    private double x;
    private double y;

    public Complex(double r, double i) {
        x = r;
        y = i;
    }

    public Complex(double r) {
        this(r,0.0);
    }
    public String toString(){
        String s = x+"+"+y+"i";
        return s;
    }

    public double abs(){
        double a = Math.pow(x,2);
        double b = Math.pow(y,2);
        return Math.sqrt(a+b);
    }
    public Complex add(Complex other){
        double a = x + other.x;
        double b = y + other.y;
        Complex c = new Complex(a,b);
        return c;
    }
    public Complex add(double s){
        double a = x + s;
        double b = y + s;
        Complex c = new Complex(a,b);
        return c;
    }

    public Complex multiply(Complex other){
        double a = x*other.x-y+other.y;
        double b = x*other.y+ y*other.x;
        Complex c = new Complex(a,b);
        return c;
    }

    public static void main(String[] args){
         Complex s = new Complex(3,4);
         Complex t = new Complex(5,8);
        System.out.println(s.abs());
        System.out.println(t.add(s));
        System.out.println(s.multiply(t));
    }
}